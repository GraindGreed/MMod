package ru.GraindGreed.MMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DustMMod extends Item {
	
	protected DustMMod(String name, String texture) {
			
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":dust_texture/" + texture);
		this.setCreativeTab(Main.tabMModIndustryItems);
		GameRegistry.registerItem(this, name);
			
	
	}
	
	protected DustMMod(String name, String texture, Item ignot) {
		
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":dust_texture/" + texture);
		this.setCreativeTab(Main.tabMModIndustryItems);
		GameRegistry.registerItem(this, name);
		GameRegistry.addSmelting(this, new ItemStack(ignot), 1.0F);
		
	}
	
//	protected DustMMod(String name, String texture, Item dust1, Item dust2) {
//		
//		super();
//		this.setUnlocalizedName(name);
//		this.setTextureName(Main.MODID + ":dust_texture/" + texture);
//		this.setCreativeTab(Main.tabMModIndustryItems);
//		GameRegistry.registerItem(this, name);
//		GameRegistry.addShapelessRecipe(new ItemStack(this, 4), new Object[] {dust1, dust2, dust2, dust2});
//		
//	}
	
	protected DustMMod(String name, String texture, Item ignot, Item dust1, Item dust2) {
		
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":dust_texture/" + texture);
		this.setCreativeTab(Main.tabMModIndustryItems);
		GameRegistry.registerItem(this, name);
		GameRegistry.addSmelting(this, new ItemStack(ignot), 1.0F);
		GameRegistry.addShapelessRecipe(new ItemStack(this, 4), new Object[] {dust1, dust2, dust2, dust2});
		
	}

}
