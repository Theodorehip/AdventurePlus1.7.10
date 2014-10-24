package com.millstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.millstone.blocks.CopperOre;
import com.millstone.blocks.CottonPlant;
import com.millstone.blocks.Cutter;
import com.millstone.blocks.Firerack;
import com.millstone.blocks.Millstone;
import com.millstone.blocks.NetherRubyOre;
import com.millstone.blocks.ObsidianBlock;
import com.millstone.blocks.RicePlant;
import com.millstone.blocks.SapphireOre;
import com.millstone.blocks.SilverOre;
import com.millstone.blocks.lantern;
import com.millstone.blocks.lavaBrick;

import cpw.mods.fml.common.registry.GameRegistry;

public class MillstoneBlocks {
	public static Block millstoneIdle;
	public static Block millstoneActive;
	public static Block stoneCutter;
	public static Block obsidianBlock;
	public static Block copperOre;
	public static Block netherRubyOre;
	public static Block sapphireOre;
	public static Block silverOre;

	public static Block lantern;

	public static Block lavaBrick;
	public static Block Firerack;


	public static Block cottonPlant = new CottonPlant().setBlockName("cottonPlant");

	public static Block ricePlant = new RicePlant().setBlockName("Rice").setBlockTextureName(MillstoneMod.MODID + ":ricePlant");

	public static void registerBlocks(){
		Block millstoneIdle = new Millstone(false).setBlockName("millstoneIdle").setCreativeTab(MillstoneMod.tabMillstone).setHardness(5F);
		Block millstoneActive = new Millstone(true).setBlockName("millstoneActive").setHardness(5F);;
		Block stoneCutter = new Cutter().setBlockName("stoneCutter").setCreativeTab(MillstoneMod.tabMillstone).setHardness(5F);
		Block obsidianBlock = new ObsidianBlock(Material.rock).setBlockName("obsidianBlock");
		Block copperOre = new CopperOre(Material.rock).setBlockName("copperOre");
		Block netherRubyOre = new NetherRubyOre(Material.rock).setBlockName("netherRubyOre");
		Block sapphireOre = new SapphireOre(Material.rock).setBlockName("sapphireOre");
		Block silverOre = new SilverOre(Material.rock).setBlockName("silverOre");

		Block lantern = new lantern(Material.glass).setHardness(0.3F).setLightLevel(1.0F).setBlockName("lantern").setBlockTextureName("lantern");

		Block lavaBrick  = new lavaBrick(Material.rock).setBlockName("lavaBrick").setBlockTextureName(MillstoneMod.MODID + ":" + "lavaBrick");
		Block Firerack  = new Firerack(Material.rock).setBlockName("Firerack").setBlockTextureName(MillstoneMod.MODID + ":" + "Firerack");


		Block cottonPlant = new CottonPlant().setBlockName("cottonPlant");

		Block ricePlant = new RicePlant().setBlockName("Rice").setBlockTextureName(MillstoneMod.MODID + ":ricePlant");
	}
	
	public static void addBlocks(){
				//InteractiveBlocks
				GameRegistry.registerBlock(millstoneIdle, "millstoneIdle");
				GameRegistry.registerBlock(millstoneActive, "millstoneActive");
				GameRegistry.registerBlock(stoneCutter, "stoneCutter");
				
				//Ores
				GameRegistry.registerBlock(copperOre, "copperOre");
				GameRegistry.registerBlock(sapphireOre, "sapphireOre");
				GameRegistry.registerBlock(netherRubyOre, "netherRubyOre");
				GameRegistry.registerBlock(silverOre, "silverOre");
				
				//NonOreSpawningBlocks
				GameRegistry.registerBlock(lavaBrick, "lavaBrick");
				GameRegistry.registerBlock(Firerack, "Firerack");
				
				//Craftable
				GameRegistry.registerBlock(obsidianBlock, "obsidianBlock");
				GameRegistry.registerBlock(lantern, "lantern");
				
				//Plants
				GameRegistry.registerBlock(ricePlant, "ricePlant");

	}

}
