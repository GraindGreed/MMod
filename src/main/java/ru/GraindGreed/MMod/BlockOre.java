package ru.GraindGreed.MMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class BlockOre extends Block {

	public BlockOre(String name, String texture, int harvestLevel, float hardness,
			ItemStack ignot, float ep) {
		
		super(Material.rock);
		this.setBlockName(name);
		this.setLightLevel(0F);
		this.setLightOpacity(10);
		this.setHardness(hardness);
		this.setCreativeTab(Main.tabMModIndustryBlock);
		this.setResistance(10);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setStepSound(soundTypeStone);
		this.setBlockTextureName(Main.MODID + ":ore_texture/" + texture);
		GameRegistry.registerBlock(this, name);
		GameRegistry.addSmelting(this, ignot, ep);
	}

}
