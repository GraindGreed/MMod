package ru.GraindGreed.MMod;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class PickaxeMMod extends ItemPickaxe {
	
	protected PickaxeMMod(String name, String texture, Item ignot) {
		
		super(ToolMaterial.EMERALD);
		this.setHarvestLevel("pickaxe", 4);
		this.setCreativeTab(Main.tabMModIndustryTools);
		this.setTextureName(Main.MODID + ":tools_texture/" + texture);
		this.setUnlocalizedName(name);
		GameRegistry.registerItem(this, name);
		GameRegistry.addRecipe(new ItemStack(this),
				
				new Object[] {
						
						"XXX", " I ", " I ",
						
						('X'), ignot,
						('I'), Items.stick,
						
				}
		);
		
	}

}
