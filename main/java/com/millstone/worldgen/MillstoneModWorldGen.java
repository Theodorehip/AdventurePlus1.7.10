package com.millstone.worldgen;

import java.util.Random;

import com.millstone.MillstoneMod;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class MillstoneModWorldGen implements IWorldGenerator {

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world,
			IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.dimensionId) {
		case 0:
			// generater our surface world
			generateSurface(world, random, chunkX * 16, chunkZ * 16);

		case -1:
			// generater our surface world
			generateNether(world, random, chunkX * 16, chunkZ * 16);

		case 1:
			// generater our surface world
			generateEnd(world, random, chunkX * 16, chunkZ * 16);

		}

	}

	private void generateSurface(World world, Random random, int x, int z) {
		// this.addOreSpawn
		this.addOreSpawn(MillstoneMod.copperOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 25, 38, 100);
		this.addOreSpawn(MillstoneMod.silverOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 25, 38, 100);
		
		 String s = world.getBiomeGenForCoords(x, z).biomeName;
		    	this.addOreSpawn(MillstoneMod.sapphireOre, world, random, x, z, 16, 16, 4 + random.nextInt(6), 25, 38, 100);
		
	}

	private void generateNether(World world, Random random, int x, int z) {
		this.addNetherOreSpawn(MillstoneMod.lavaBrick, world, random, x, z, 16, 16, 4 + random.nextInt(15), 50, 0, 120);
		this.addNetherOreSpawn(MillstoneMod.netherRubyOre, world, random, x, z, 16, 16, 4 + random.nextInt(15), 50, 0, 120);
		
	}

	private void generateEnd(World world, Random random, int x, int z) {
		// TODO Auto-generated method stub

	}

	private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {

		for (int i = 0; i < chanceToSpawn; i++) {

			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenMinable(block, maxVeinSize)).generate(world, random,
					posX, posY, posZ);
		}

	}
	private void addNetherOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY) {

		for (int i = 0; i < chanceToSpawn; i++) {

			int posX = blockXPos + random.nextInt(maxX);
			int posY = minY + random.nextInt(maxY - minY);
			int posZ = blockZPos + random.nextInt(maxZ);
			(new WorldGenNetherMinable(block, maxVeinSize)).generate(world, random,
					posX, posY, posZ);
		}

	}
}