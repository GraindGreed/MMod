package ru.GraindGreed.MMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class IgnotMMod extends Item {
	
	protected IgnotMMod(String name, String texture) {
		
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":ignot_texture/" + texture);
		this.setCreativeTab(Main.tabMModIndustryItems);
		GameRegistry.registerItem(this, name);
		
	}
	
}
