package ru.GraindGreed.MMod;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.GraindGreed.MMod.Fabrication_folder.BlockFabrication;
import ru.GraindGreed.MMod.Fabrication_folder.HandlerGui;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)

public class Main {
	
	public static final String 
	MODID = "MMod",
	MODNAME = "MMod Test",
	VERSION = "0.3.1";
	
	@Mod.Instance(MODID)
	public static Main instance;
	
	public static Block TinOre, CopperOre, AluminiumOre, NickelOre, TitaniumOre, UraniumOre, MatterOre,
	Fabrication, TinBlock, CopperBlock, AluminiumBlock, NickelBlock, TitaniumBlock, BronseBlock;
	
	public static Item TinIgnot, CopperIgnot, AluminiumIgnot, NickelIgnot, TitaniumIgnot, UraniumIgnot,
	MatterClot, TitaniumPickaxe, TinDust, CopperDust, AluminiumDust, NickelDust, TitaniumDust, BronseDust,
	UraniumDust, BronseIgnot;
	
	public static final CreativeTabs tabMModIndustryBlock = new CreativeTabs("tabMModIndustryBlock") {
		public Item getTabIconItem() {
			return Item.getItemFromBlock(CopperOre);
		}
	};
	
	public static final CreativeTabs tabMModIndustryTools = new CreativeTabs("tabMModIndustryTools") {
		public Item getTabIconItem() {
			return Main.TitaniumPickaxe;
		}
	};
	
	public static final CreativeTabs tabMModIndustryItems = new CreativeTabs("tabMModIndustryItems") {
		public Item getTabIconItem() {
			return Main.MatterClot;
		}
	};
	
	public static OreGeneration oreGeneration = new OreGeneration();
	
	@EventHandler
	public void preLoad(FMLPreInitializationEvent event) {
		
		TinIgnot = new IgnotMMod("Tin Ignot", "Tin Ignot Texture");
		CopperIgnot = new IgnotMMod("Copper Ignot", "Copper Ignot Texture");
		BronseIgnot = new IgnotMMod("Bronse Ignot", "Bronse Ignot Texture");
		AluminiumIgnot = new IgnotMMod("Aluminium Ignot", "Aluminium Ignot Texture");
		NickelIgnot = new IgnotMMod("Nickel Ignot", "Nickel Ignot Texture");
		TitaniumIgnot = new IgnotMMod("Titanium Ignot", "Titanium Ignot Texture");
		UraniumIgnot = new IgnotMMod("Uranium Ignot", "Uranium Ignot Texture");
		MatterClot = new IgnotMMod("Matter Clot", "Matter Clot Texture");
		
		TinDust = new DustMMod("Tin Dust", "Tin Dust Texture", Main.TinIgnot);
		CopperDust = new DustMMod("Copper Dust", "Copper Dust Texture", Main.CopperIgnot);
		AluminiumDust = new DustMMod("Aluminium Dust", "Aluminium Dust Texture", Main.AluminiumIgnot);
		NickelDust = new DustMMod("Nickel Dust", "Nickel Dust Texture", Main.NickelIgnot);
		TitaniumDust = new DustMMod("Titanium Dust", "Titanium Dust Texture", Main.TitaniumIgnot);
		UraniumDust = new DustMMod("Uranium Dust", "Uranium Dust Texture");
		BronseDust  = new DustMMod("Bronse Dust", "Bronse Dust Texture", Main.BronseIgnot,
				Main.TinDust, Main.CopperDust);
		
		TinOre = new BlockOre("Tin Ore", "Tin Ore Texture", 1, 2.0F,
				new ItemStack(TinIgnot, 1), 1.0F);
		CopperOre = new BlockOre("Copper Ore", "Copper Ore Texture", 1, 2.0F,
				new ItemStack(CopperIgnot, 1), 1.0F);
		AluminiumOre = new BlockOre("Aluminium Ore", "Aluminium Ore Texture", 1, 1.5F,
				new ItemStack(AluminiumIgnot, 1), 1.0F);
		NickelOre = new BlockOre("Nickel Ore", "Nickel Ore Texture", 2, 3.0F,
				new ItemStack(NickelIgnot, 1), 1.5F);
		TitaniumOre = new BlockOre("Titanium Ore", "Titanium Ore Texture", 3, 4.0F
				, new ItemStack(TitaniumIgnot, 1), 2.0F);
		UraniumOre = new BlockOre("Uranium Ore", "Uranium Ore Texture", 2, 3.5F,
				new ItemStack(UraniumIgnot, 1), 1.5F);
		MatterOre = new BlockOre("Inclusion of Matter", "Inclusion of Matter Texture", 4, 5.0F,
				new ItemStack(MatterClot, 2), 2.5F);
		
		GameRegistry.registerWorldGenerator(oreGeneration, 0);
		
		Fabrication = new BlockFabrication("Fabrication", "Test Fabrication");
		
		TinBlock = new BlockBlock("Tin Block", "Tin Block Texture", 1.5F, 1, Main.TinIgnot);
		CopperBlock = new BlockBlock("Copper Block", "Copper Block Texture", 1.5F, 1, Main.CopperIgnot);
		AluminiumBlock = new BlockBlock("Aluminium Block", "Aluminium Block Texture", 1.5F, 1,
				Main.AluminiumIgnot);
		NickelBlock = new BlockBlock("Nickel Block", "Nickel Block Texture", 1.5F, 1, Main.NickelIgnot);
		TitaniumBlock = new BlockBlock("Titanium Block", "Titanium Block Texture", 1.5F, 1,
				Main.TitaniumIgnot);
		BronseBlock = new BlockBlock("Bronse Block", "Bronse Block Texture", 1.5F, 1, Main.BronseIgnot);
		
		TitaniumPickaxe = new PickaxeMMod("Titanium Pickaxe", "Titanium Pickaxe Texture", Main.TitaniumIgnot);
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
		NetworkRegistry.INSTANCE.registerGuiHandler(instance, new HandlerGui());
		
	}

}
