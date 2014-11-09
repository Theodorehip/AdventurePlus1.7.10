package com.millstone.registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import com.millstone.MillstoneMod;
import com.millstone.blocks.Cutter;
import com.millstone.blocks.Firerack;
import com.millstone.blocks.Lantern;
import com.millstone.blocks.LavaBrick;
import com.millstone.blocks.Millstone;
import com.millstone.blocks.ObsidianBlock;
import com.millstone.blocks.WallBlock;
import com.millstone.blocks.ores.CopperOre;
import com.millstone.blocks.ores.NetherRubyOre;
import com.millstone.blocks.ores.SapphireOre;
import com.millstone.blocks.ores.SilverOre;
import com.millstone.lib.References;
import com.millstone.trees.TreeBlock;
import com.millstone.trees.TreeBlockItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistry {
	
	//misc
	public static Block obsidianBlock = new ObsidianBlock(Material.rock).setBlockName("obsidianBlock");
	public static Block lantern = new Lantern(Material.glass).setHardness(0.3F).setLightLevel(1.0F).setBlockName("lantern").setBlockTextureName("lantern");
	
	//Walls
	public static Block sandstoneWall = new WallBlock(Blocks.sandstone, 0).setBlockName("sandstoneWall");
	public static Block brickWall = new WallBlock(Blocks.brick_block, 1).setBlockName("brickWall");
	public static Block stoneBrickWall = new WallBlock(Blocks.stonebrick, 2).setBlockName("stoneBrickWall");
	
	//Woods 
	public static Block treeBlock = new TreeBlock();

	
	
	//Interactive Blocks
	public static Block millstoneIdle = new Millstone(false).setBlockName("millstoneIdle").setCreativeTab(MillstoneMod.tabMillstone).setHardness(5F);
	public static Block millstoneActive = new Millstone(true).setBlockName("millstoneActive").setHardness(5F);;
	public static Block stoneCutter = new Cutter().setBlockName("stoneCutter").setCreativeTab(MillstoneMod.tabMillstone).setHardness(5F);

	//ores
	public static Block copperOre = new CopperOre(Material.rock).setBlockName("copperOre");
	public static Block netherRubyOre = new NetherRubyOre(Material.rock).setBlockName("netherRubyOre");
	public static Block sapphireOre = new SapphireOre(Material.rock).setBlockName("sapphireOre");
	public static Block silverOre = new SilverOre(Material.rock).setBlockName("silverOre");
	
	//NonOreSpawningBlocks
	public static Block lavaBrick  = new LavaBrick(Material.rock).setBlockName("lavaBrick").setBlockTextureName(References.MODID + ":" + "lavaBrick");
	public static Block Firerack  = new Firerack(Material.rock).setBlockName("Firerack").setBlockTextureName(References.MODID + ":" + "Firerack");

	public static void Register() {
		
		//Walls
		GameRegistry.registerBlock(sandstoneWall, "sandstoneWall");
		GameRegistry.registerBlock(brickWall, "brickWall");
		GameRegistry.registerBlock(stoneBrickWall, "stoneBrickWall");
		
		//Planks
		GameRegistry.registerBlock(treeBlock, TreeBlockItem.class, (treeBlock.getUnlocalizedName().substring(6)));
		
		//InteractiveBlocks
		GameRegistry.registerBlock(millstoneIdle, "millstoneIdle");
		GameRegistry.registerBlock(millstoneActive, "millstoneActive");
		GameRegistry.registerBlock(stoneCutter, "stoneCutter");

		//Ores
		GameRegistry.registerBlock(copperOre, "copperOre");
		GameRegistry.registerBlock(sapphireOre, "sapphireOre");
		GameRegistry.registerBlock(netherRubyOre, "netherRubyOre");
		GameRegistry.registerBlock(silverOre, "silverOre");
		
		//Craftable
		GameRegistry.registerBlock(obsidianBlock, "obsidianBlock");		
		GameRegistry.registerBlock(lantern, "lantern");

		//NonOreSpawningBlocks
		GameRegistry.registerBlock(lavaBrick, "lavaBrick");
		GameRegistry.registerBlock(Firerack, "Firerack");
		



	}
}
