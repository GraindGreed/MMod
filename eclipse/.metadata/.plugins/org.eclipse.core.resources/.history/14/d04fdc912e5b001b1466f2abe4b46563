package ru.GraindGreed.MMod;

import java.util.ArrayList;
import java.util.Random;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class OreGeneration implements IWorldGenerator {
	
	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGeneration,
			IChunkProvider chunkProvider) {
		
		generateOverworld(rand, chunkX, chunkZ, world);
		
	}
	
	private void generateOverworld(Random rand, int chunkX, int chunkZ, World world) {
		
		generateOverworld(world, rand, chunkX * 16, chunkZ * 16);
		
	}
	
	public void generateOverworld(World world, Random rand, int blockXPos, int blockZPos) {
		
		ArrayList listOre = new ArrayList();
		ArrayList listMaxVeinSize = new ArrayList();
		ArrayList listMaxVeinsPerChank = new ArrayList();
		ArrayList listPersentege = new ArrayList();
		ArrayList listMaxY = new ArrayList();
		ArrayList listMinVeinSize = new ArrayList();
		ArrayList listMinVeinsPerChank = new ArrayList();
		
		listOre.add(Main.TinOre);
		listOre.add(Main.CopperOre);
		listOre.add(Main.AluminiumOre);
		listOre.add(Main.NickelOre);
		listOre.add(Main.TitaniumOre);
		listOre.add(Main.UraniumOre);
		listOre.add(Main.MatterOre);
		
		listMaxVeinSize.add(15);
		listMaxVeinSize.add(15);
		listMaxVeinSize.add(20);
		listMaxVeinSize.add(8);
		listMaxVeinSize.add(3);
		listMaxVeinSize.add(1);
		listMaxVeinSize.add(1);
		
		listMaxVeinsPerChank.add(25);
		listMaxVeinsPerChank.add(25);
		listMaxVeinsPerChank.add(30);
		listMaxVeinsPerChank.add(15);
		listMaxVeinsPerChank.add(4);
		listMaxVeinsPerChank.add(8);
		listMaxVeinsPerChank.add(2);
		
		listPersentege.add(60);
		listPersentege.add(60);
		listPersentege.add(75);
		listPersentege.add(45);
		listPersentege.add(23);
		listPersentege.add(37);
		listPersentege.add(8);
		
		listMaxY.add(128);
		listMaxY.add(128);
		listMaxY.add(128);
		listMaxY.add(64);
		listMaxY.add(25);
		listMaxY.add(60);
		listMaxY.add(10);
		
		listMinVeinSize.add(5);
		listMinVeinSize.add(5);
		listMinVeinSize.add(8);
		listMinVeinSize.add(2);
		listMinVeinSize.add(1);
		listMinVeinSize.add(1);
		listMinVeinSize.add(1);
		
		listMinVeinsPerChank.add(10);
		listMinVeinsPerChank.add(10);
		listMinVeinsPerChank.add(12);
		listMinVeinsPerChank.add(5);
		listMinVeinsPerChank.add(1);
		listMinVeinsPerChank.add(1);
		listMinVeinsPerChank.add(1);
		
		int len = listOre.size();
		
		for (int i = 0; i < len; i++) {
			
			Block ore =  (Block) listOre.get(i);
			int maxVeinSize = (Integer) listMaxVeinSize.get(i);
			int maxVeinsPerChank = (Integer) listMaxVeinsPerChank.get(i);
			int persentage = (Integer) listPersentege.get(i);
			int maxY = (Integer) listMaxY.get(i);
			int minVeinSize = (Integer) listMinVeinSize.get(i);
			int minVeinsPerChank = (Integer) listMinVeinsPerChank.get(i);
			
			addOreSpawn(ore, Blocks.stone, world, rand, blockXPos, blockZPos,
					16, 16, minVeinSize, maxVeinSize, minVeinsPerChank, maxVeinsPerChank, persentage, 5, maxY);
			
		}
		
	}
	
	public static void addOreSpawn(Block ore, Block replase, World world, Random rand, int blockXPos,
			int blockZPos, int maxX, int maxZ, int minVeinSize, int maxVeinSize, int minVeinsPerChunk,
			int maxVeinsPerChunk, int chanceToSpawn, int minY, int maxY) {
		
		if (rand.nextInt(101) < (100 - chanceToSpawn)) return;
		int veins = rand.nextInt(maxVeinsPerChunk - minVeinsPerChunk + 1) + minVeinsPerChunk;
		for (int i = 0; i < veins; i++) {
			
			int posX = blockXPos + rand.nextInt(maxX);
			int posY = minY + rand.nextInt(maxY - minY);
			int posZ = blockZPos + rand.nextInt(maxZ);
			(new WorldGenMinable(ore, minVeinSize + rand.nextInt(maxVeinSize - minVeinSize + 1),
					replase)).generate(world, rand, posX, posY, posZ);
			
		}
		
	}
	
	

}
