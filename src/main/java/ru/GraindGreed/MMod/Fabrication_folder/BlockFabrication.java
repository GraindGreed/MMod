package ru.GraindGreed.MMod.Fabrication_folder;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import ru.GraindGreed.MMod.Main;

public class BlockFabrication extends Block implements ITileEntityProvider {
	
	public BlockFabrication(String name, String texture) {
		
		super(Material.iron);
		this.setBlockName(name);
		this.setBlockTextureName(Main.MODID + ":fabrications/" + texture);
		this.setCreativeTab(Main.tabMModIndustryBlock);
		GameRegistry.registerBlock(this, name);
		GameRegistry.registerTileEntity(TileEntityFabrication.class, name);
		
	}
	
	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		
		return new TileEntityFabrication();
		
	}
	
	public void onBlockPlaceBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
		
		if (itemStack.hasDisplayName())
			((TileEntityFabrication)world.getTileEntity(x, y, z)).setInventoryName(itemStack.getDisplayName());
		
	}
	
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX,
			float hitY, float hitZ) {
		
		if (!world.isRemote && world.getTileEntity(x, y, z) instanceof TileEntityFabrication)
			
			player.openGui(Main.instance, 0, world, x, y, z);
		
		return true;
		
	}

}
