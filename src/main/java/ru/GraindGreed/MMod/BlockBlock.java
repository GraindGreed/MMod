package ru.GraindGreed.MMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class BlockBlock extends Block {
	
	public BlockBlock (String name, String texture, float hardness, int harvestLevel, Item ignot) {
		
		super(Material.iron);
		this.setBlockName(name);
		this.setBlockTextureName(Main.MODID + ":block_texture/" + texture);
		this.setCreativeTab(Main.tabMModIndustryBlock);
		this.setLightLevel(0F);
		this.setLightOpacity(10);
		this.setHardness(hardness);
		this.setResistance(15);
		this.setHarvestLevel("pickaxe", harvestLevel);
		this.setStepSound(soundTypeMetal);
		GameRegistry.registerBlock(this, name);
		GameRegistry.addRecipe(new ItemStack(this, 1),
				
				new Object[] {
						
						"XXX", "XXX", "XXX",
						
						('X'), ignot,
						
				}
		);	
		
	}

}
