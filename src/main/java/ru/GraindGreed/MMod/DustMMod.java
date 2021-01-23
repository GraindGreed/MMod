package ru.GraindGreed.MMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class DustMMod extends Item {
	
protected DustMMod(String name, String texture) {
		
		super();
		this.setUnlocalizedName(name);
		this.setTextureName(Main.MODID + ":dust_texture/" + texture);
		this.setCreativeTab(Main.tabMModIndustryItems);
		GameRegistry.registerItem(this, name);
		
	}

}