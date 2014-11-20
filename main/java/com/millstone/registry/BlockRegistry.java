package com.millstone.registry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;

import com.millstone.MillstoneMod;
import com.millstone.blocks.BlockColoredBed;
import com.millstone.blocks.Cutter;
import com.millstone.blocks.Firerack;
import com.millstone.blocks.ItemColoredBed;
import com.millstone.blocks.Lantern;
import com.millstone.blocks.LavaBrick;
import com.millstone.blocks.Millstone;
import com.millstone.blocks.ObsidianBlock;
import com.millstone.blocks.StairsBlock;
import com.millstone.blocks.WallBlock;
import com.millstone.blocks.ores.CopperOre;
import com.millstone.blocks.ores.NetherRubyOre;
import com.millstone.blocks.ores.SapphireOre;
import com.millstone.blocks.ores.SilverOre;
import com.millstone.lib.References;
import com.millstone.trees.LeafBlock;
import com.millstone.trees.LeafBlockItem;
import com.millstone.trees.LogBlock;
import com.millstone.trees.LogBlockItem;
import com.millstone.trees.PlanksBlock;
import com.millstone.trees.PlanksBlockItem;
import com.millstone.trees.SlabBlock;
import com.millstone.trees.SlabBlockItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistry {

	
	//misc
	public static Block obsidianBlock = new ObsidianBlock(Material.rock).setBlockName("obsidianBlock");
	public static Block lantern = new Lantern(Material.glass).setHardness(0.3F).setLightLevel(1.0F).setBlockName("lantern").setBlockTextureName("lantern");	
	
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

	//Walls
	public static Block sandstoneWall = new WallBlock(Blocks.sandstone, 0).setBlockName("sandstoneWall");
	public static Block brickWall = new WallBlock(Blocks.brick_block, 1).setBlockName("brickWall");
	public static Block stoneBrickWall = new WallBlock(Blocks.stonebrick, 2).setBlockName("stoneBrickWall");
	
	//Woods 
	public static Block planks = new PlanksBlock();
	public static Block log = new LogBlock().setBlockName("log").setCreativeTab(MillstoneMod.tabMillstone).setBlockTextureName("log");
	public static Block leaf = new LeafBlock().setBlockName("leaf").setCreativeTab(MillstoneMod.tabMillstoneDeco).setBlockTextureName("leaf");
	
	//Slabs
	public static Block doubleSlab = new SlabBlock(true, Material.wood);
	public static Block singleSlab = new SlabBlock(false, Material.wood);

	//Stairs
	public static Block willowStairs = new StairsBlock(planks, 0).setBlockName("willowStairs");
	public static Block palmStairs = new StairsBlock(planks, 1).setBlockName("palmStairs");
	public static Block dreadwoodStairs = new StairsBlock(planks, 2).setBlockName("dreadwoodStairs");
	public static Block redwoodStairs = new StairsBlock(planks, 3).setBlockName("redwoodStairs");
	public static Block applewoodStairs = new StairsBlock(planks, 4).setBlockName("applewoodStairs");
	public static Block cherryStairs = new StairsBlock(planks, 5).setBlockName("cherryStairs");
	public static Block baobobStairs = new StairsBlock(planks, 6).setBlockName("baobobStairs");

	public static Block coloredBed = new BlockColoredBed().setBlockName("coloredBed");

	
	
	public static void Register() {
		
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
		
		//Walls
		GameRegistry.registerBlock(sandstoneWall, "sandstoneWall");
		GameRegistry.registerBlock(brickWall, "brickWall");
		GameRegistry.registerBlock(stoneBrickWall, "stoneBrickWall");
		
		//Planks
		GameRegistry.registerBlock(planks, PlanksBlockItem.class, (planks.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(log, LogBlockItem.class, (log.getUnlocalizedName().substring(5)));
		GameRegistry.registerBlock(leaf, LeafBlockItem.class, (leaf.getUnlocalizedName().substring(5)));
		
		//Slabs
		GameRegistry.registerBlock(doubleSlab, SlabBlockItem.class, "doubleSlab");
		GameRegistry.registerBlock(singleSlab, SlabBlockItem.class, "singleSlab");
		
		//Walls
		GameRegistry.registerBlock(willowStairs, "willowStairs");
		GameRegistry.registerBlock(palmStairs, "palmStairs");
		GameRegistry.registerBlock(dreadwoodStairs, "dreadwoodStairs");
		GameRegistry.registerBlock(redwoodStairs, "redwoodStairs");
		GameRegistry.registerBlock(applewoodStairs, "applewoodStairs");
		GameRegistry.registerBlock(cherryStairs, "cherryStairs");
		GameRegistry.registerBlock(baobobStairs, "baobobStairs");
		
		GameRegistry.registerBlock(coloredBed, "coloredBed");

				
		
	}
}
