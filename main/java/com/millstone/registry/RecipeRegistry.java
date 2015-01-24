package com.millstone.registry;

import com.millstone.handler.RemoveRecipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeRegistry{
	
	static Item copperIngot = ItemRegistry.copperIngot;
	static Item ruby = ItemRegistry.ruby;
	static Item sapphire = ItemRegistry.sapphire;
	static Item silverIngot = ItemRegistry.silverIngot;
	
	public static void RegisterCrafting(){
		
	//Interactives
	//GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.millstoneIdle, 1), new Object[]{"SPS", "IDI", "BPB", 'S', Blocks.stone_slab, 'I', Blocks.iron_block, 'P', Blocks.piston, 'D', Blocks.diamond_ore, 'B', Blocks.stonebrick});
	GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.stoneCutter, 1), new Object[]{"CCC", "CSC", "CCC", 'C', Blocks.cobblestone, 'S', ItemRegistry.stoneGear});;

	//Gears
	//GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.woodGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.stick, 'C', Blocks.planks});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.stoneGear, 1), new Object[]{" S ", "SCS", " S ", 'C', Blocks.cobblestone, 'S', Items.stick});
	//GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ironGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.iron_ingot, 'C', ItemRegistry.stoneGear});
	//GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.goldGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.gold_ingot, 'C', ItemRegistry.ironGear});
	//GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.diamondGear, 1), new Object[]{" S ", "SCS", " S ", 'C', ItemRegistry.ironGear, 'S', Items.diamond});
	
	//Tools
	//GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperSword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubySword, 1), new Object[]{" O ", " O ", " I ", 'I', ItemRegistry.ironRod, 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubyPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubyAxe, 1), new Object[]{" OO", " IO", " I ", 'I', ItemRegistry.ironRod, 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubyShovel, 1), new Object[]{" O ", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubyHoe, 1), new Object[]{" OO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', ruby});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphireSword, 1), new Object[]{" O ", " O ", " I ", 'I', ItemRegistry.ironRod, 'O',sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphirePickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphireAxe, 1), new Object[]{" OO", " IO", " I ", 'I', ItemRegistry.ironRod, 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphireShovel, 1), new Object[]{" O ", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphireHoe, 1), new Object[]{" OO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', sapphire});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldSword, 1), new Object[]{" O ", " O ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O',Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldAxe, 1), new Object[]{" OO", " IO", " I ", 'I', ItemRegistry.ironRod, 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldShovel, 1), new Object[]{" O ", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldHoe, 1), new Object[]{" OO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.emerald});
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.golden_sword, 1), new Object[]{" O ", " O ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.gold_ingot});
	GameRegistry.addShapedRecipe(new ItemStack(Items.golden_pickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O',Items.gold_ingot});
	GameRegistry.addShapedRecipe(new ItemStack(Items.golden_axe, 1), new Object[]{" OO", " IO", " I ", 'I', ItemRegistry.ironRod, 'O', Items.gold_ingot});
	GameRegistry.addShapedRecipe(new ItemStack(Items.golden_shovel, 1), new Object[]{" O ", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.gold_ingot});
	GameRegistry.addShapedRecipe(new ItemStack(Items.golden_hoe, 1), new Object[]{" OO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.gold_ingot});
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_sword, 1), new Object[]{" O ", " O ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.diamond});
	GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_pickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O',Items.diamond});
	GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_axe, 1), new Object[]{" OO", " IO", " I ", 'I', ItemRegistry.ironRod, 'O', Items.diamond});
	GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_shovel, 1), new Object[]{" O ", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.diamond});
	GameRegistry.addShapedRecipe(new ItemStack(Items.diamond_hoe, 1), new Object[]{" OO", " I ", " I ", 'I', ItemRegistry.ironRod, 'O', Items.diamond});
	
	GameRegistry.addShapedRecipe(new ItemStack(Items.stone_sword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', Blocks.stone});
	GameRegistry.addShapedRecipe(new ItemStack(Items.stone_pickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O',Blocks.stone});
	GameRegistry.addShapedRecipe(new ItemStack(Items.stone_axe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', Blocks.stone});
	GameRegistry.addShapedRecipe(new ItemStack(Items.stone_shovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', Blocks.stone});
	GameRegistry.addShapedRecipe(new ItemStack(Items.stone_hoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', Blocks.stone});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ironSword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', Items.iron_ingot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ironPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O',Items.iron_ingot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ironAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', Items.iron_ingot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ironShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', Items.iron_ingot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ironHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', Items.iron_ingot});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.flintHatchet, 1), new Object[]{" OL", "  I", 'I', Items.stick, 'O', Items.flint, 'L', ItemRegistry.leatherStrip});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.bonePickaxe, 1), new Object[]{"OQO", " I ", " I ", 'I', Items.stick, 'Q', Items.bone, 'O',ItemRegistry.boneShard});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.flintKnife, 1), new Object[]{"  I", " I ", 'I', Items.flint});	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.boneShard, 1), new Object[]{ItemRegistry.flintKnife, Items.bone});
	//GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ironRod, 6), new Object[]{" I ", " I ", " I ", 'I', Items.iron_ingot});
	
	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.leatherStrip, 3), new Object[]{ItemRegistry.flintKnife, Items.leather});
	
	//Armor
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorCopperHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorCopperChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorCopperLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorCopperBoots, 1), new Object[]{"   ", "O O", "O O", 'O', copperIngot});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorRubyHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorRubyChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorRubyLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorRubyBoots, 1), new Object[]{"   ", "O O", "O O", 'O', ruby});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorSapphireHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorSapphireChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorSapphireLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorSapphireBoots, 1), new Object[]{"   ", "O O", "O O", 'O', sapphire});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEmeraldHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEmeraldChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEmeraldLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEmeraldBoots, 1), new Object[]{"   ", "O O", "O O", 'O', Items.emerald});
	
	//Unsorted
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.lantern,1), new Object[] {"xxx", "xyx", "xxx", 'x', ItemRegistry.ricePaper, 'y', Blocks.torch});
    GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ricePaper,1), new Object[] {"xxx", 'x', ItemRegistry.riceCrop});
	GameRegistry.addShapedRecipe(new ItemStack(Items.cake, 1), new Object[]{"MMM", "SES", "FFF", 'S', Items.sugar, 'M', Items.milk_bucket, 'E', Items.egg, 'F', ItemRegistry.flour});
	GameRegistry.addShapedRecipe(new ItemStack(Items.cookie, 8), new Object[]{"   ", "FCF", "   ",'F', ItemRegistry.flour, 'C', new ItemStack(Items.dye, 1, 3)});
	
	//Misc
	GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.obsidianBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', ItemRegistry.obsidianDust});
	GameRegistry.addShapedRecipe(new ItemStack(Items.string, 1), new Object[]{"   ", "CCC", "   ", 'C', ItemRegistry.cotton});
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1), new Object[]{"   ", "CC ", "CC ", 'C', ItemRegistry.cotton});
  //  GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.riceBowl,1), new Object[] {"x", "y", 'x', ItemRegistry.riceCrop, 'y', Items.bowl});
   // GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.sushi,1), new Object[] {new ItemStack(ItemRegistry.riceCrop, 1), Items.fish});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.iron_bars, 4), new Object[] {"   ", "###", "###", '#', ItemRegistry.ironRod});
    
    //Re-done Rails
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.rail, 16), new Object[]{"X X", "XIX", "X X", 'X', ItemRegistry.ironRod, 'I', Items.stick});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.activator_rail, 6), new Object[]{"XIX", "XRX", "XIX", 'X', ItemRegistry.ironRod, 'I', Items.stick, 'R', Blocks.redstone_torch});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.detector_rail, 6), new Object[]{"X X", "XRX", "XIX", 'X', ItemRegistry.ironRod, 'I', Items.redstone, 'R', Blocks.stone_pressure_plate});
   // GameRegistry.addShapedRecipe(new ItemStack(Blocks.golden_rail, 6), new Object[]{"X X", "XIX", "XRX", 'X', Items.gold_ingot, 'I', Items.stick, 'R', Items.redstone});
    
	//Vanilla Logs to Planks reduction
    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), new Object[] {new ItemStack(Blocks.log, 1, 0)});
    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 1), new Object[] {new ItemStack(Blocks.log, 1, 1)});
    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 2), new Object[] {new ItemStack(Blocks.log, 1, 2)});
    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 3), new Object[] {new ItemStack(Blocks.log, 1, 3)});
    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 4), new Object[] {new ItemStack(Blocks.log2, 1, 0)});
    GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 5), new Object[] {new ItemStack(Blocks.log2, 1, 1)});
    
    //Mod Logs to Planks Reduction
    GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.planks, 2, 0), new Object[] {new ItemStack(BlockRegistry.log, 1, 0)});
    GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.planks, 2, 1), new Object[] {new ItemStack(BlockRegistry.log, 1, 1)});
    GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.planks, 2, 2), new Object[] {new ItemStack(BlockRegistry.log, 1, 2)});
    GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.planks, 2, 3), new Object[] {new ItemStack(BlockRegistry.log, 1, 3)});
    GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.planks, 2, 4), new Object[] {new ItemStack(BlockRegistry.log, 1, 4)});
    GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.planks, 2, 5), new Object[] {new ItemStack(BlockRegistry.log, 1, 5)});
    GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.planks, 2, 6), new Object[] {new ItemStack(BlockRegistry.log, 1, 5)});
    
    //Mod Planks to Crafting Table
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{"XX","XX", 'X', new ItemStack(BlockRegistry.planks, 1, 0)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{"XX","XX", 'X', new ItemStack(BlockRegistry.planks, 1, 1)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{"XX","XX", 'X', new ItemStack(BlockRegistry.planks, 1, 2)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{"XX","XX", 'X', new ItemStack(BlockRegistry.planks, 1, 3)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{"XX","XX", 'X', new ItemStack(BlockRegistry.planks, 1, 4)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{"XX","XX", 'X', new ItemStack(BlockRegistry.planks, 1, 5)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.crafting_table, 1), new Object[]{"XX","XX", 'X', new ItemStack(BlockRegistry.planks, 1, 6)});

    //Mod Saplings to Stick

	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[]{ItemRegistry.flintKnife, new ItemStack(BlockRegistry.sapling, 1, 0)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[]{ItemRegistry.flintKnife, new ItemStack(BlockRegistry.sapling, 1, 1)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[]{ItemRegistry.flintKnife, new ItemStack(BlockRegistry.sapling, 1, 2)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[]{ItemRegistry.flintKnife, new ItemStack(BlockRegistry.sapling, 1, 3)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[]{ItemRegistry.flintKnife, new ItemStack(BlockRegistry.sapling, 1, 4)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[]{ItemRegistry.flintKnife, new ItemStack(BlockRegistry.sapling, 1, 5)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 4), new Object[]{ItemRegistry.flintKnife, new ItemStack(BlockRegistry.sapling, 1, 6)});
	
	//Vanilla Saplings to stick
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 2), new Object[]{ItemRegistry.flintKnife, new ItemStack(Blocks.sapling, 1, 0)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 2), new Object[]{ItemRegistry.flintKnife, new ItemStack(Blocks.sapling, 1, 1)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 2), new Object[]{ItemRegistry.flintKnife, new ItemStack(Blocks.sapling, 1, 2)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 2), new Object[]{ItemRegistry.flintKnife, new ItemStack(Blocks.sapling, 1, 3)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 2), new Object[]{ItemRegistry.flintKnife, new ItemStack(Blocks.sapling, 1, 4)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.stick, 2), new Object[]{ItemRegistry.flintKnife, new ItemStack(Blocks.sapling, 1, 5)});


	//Walls /////I'm not sure if that's the right amount and right crafting recipe\\\\\
	GameRegistry.addRecipe(new ItemStack(BlockRegistry.sandstoneWall, 6, 0), new Object[] {"###", "###", '#', Blocks.sandstone});
	GameRegistry.addRecipe(new ItemStack(BlockRegistry.brickWall, 6, 0), new Object[] {"###", "###", '#', Blocks.brick_block});
	GameRegistry.addRecipe(new ItemStack(BlockRegistry.stoneBrickWall, 6, 0), new Object[] {"###", "###", '#', Blocks.stonebrick});
    
    //Vanilla Stairs
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.oak_stairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(Blocks.planks, 1, 0)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.birch_stairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(Blocks.planks, 1, 2)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.spruce_stairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(Blocks.planks, 1, 1)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.jungle_stairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(Blocks.planks, 1, 3)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.acacia_stairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(Blocks.planks, 1, 4)});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.dark_oak_stairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(Blocks.planks, 1, 5)});  
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_stairs, 4), new Object[] {"#  ", "## ", '#', Blocks.cobblestone});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.brick_stairs, 4), new Object[] {"#  ", "## ", '#', Blocks.brick_block});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_brick_stairs, 4), new Object[] {"#  ", "## ", '#', Blocks.stonebrick});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.nether_brick_stairs, 4), new Object[] {"#  ", "## ", '#', Blocks.nether_brick});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone_stairs, 4), new Object[] {"#  ", "## ", '#', Blocks.sandstone});
    GameRegistry.addShapedRecipe(new ItemStack(Blocks.quartz_stairs, 4), new Object[] {"#  ", "## ", '#', Blocks.quartz_block});
	
    //Mod Stairs
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.willowStairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(BlockRegistry.planks, 1, 0)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.palmStairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(BlockRegistry.planks, 1, 2)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.dreadwoodStairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(BlockRegistry.planks, 1, 1)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.redwoodStairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(BlockRegistry.planks, 1, 3)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.applewoodStairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(BlockRegistry.planks, 1, 4)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.cherryStairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(BlockRegistry.planks, 1, 5)});  
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.baobabStairs, 4), new Object[] {"#  ", "## ", '#', new ItemStack(BlockRegistry.planks, 1, 6)});

    //Mod Slabs
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.singleSlab, 6, 0), new Object[] {"###", '#', new ItemStack(BlockRegistry.planks, 1, 0)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.singleSlab, 6, 1), new Object[] {"###", '#', new ItemStack(BlockRegistry.planks, 1, 2)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.singleSlab, 6, 2), new Object[] {"###", '#', new ItemStack(BlockRegistry.planks, 1, 1)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.singleSlab, 6, 3), new Object[] {"###", '#', new ItemStack(BlockRegistry.planks, 1, 3)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.singleSlab, 6, 4), new Object[] {"###", '#', new ItemStack(BlockRegistry.planks, 1, 4)});
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.singleSlab, 6, 5), new Object[] {"###", '#', new ItemStack(BlockRegistry.planks, 1, 5)});  
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.singleSlab, 6, 6), new Object[] {"###", '#', new ItemStack(BlockRegistry.planks, 1, 6)});
    
    
	//making dyes craftable from other dyes, need this because i got rid of all dye recipes  //WIP
	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 15)});
	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 14), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 10), new Object[] {new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 15)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 8), new Object[] {new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 7), new Object[] {new ItemStack(Items.dye, 1, 8), new ItemStack(Items.dye, 1, 15)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 7), new Object[] {new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.dye, 1, 15)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 12), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 15)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 6), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 2)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new Object[] {new ItemStack(Items.dye, 1, 5), new ItemStack(Items.dye, 1, 9)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 13), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 9)});
    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 4, 13), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 15)});
    GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 2), new ItemStack(Blocks.cactus, 1), 0.35F);
	
}
	public static void RegisterSmelting(){
		
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.ironDust), new ItemStack(Items.iron_ingot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.goldDust), new ItemStack(Items.gold_ingot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.flour), new ItemStack(Items.bread, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockRegistry.copperOre), new ItemStack(copperIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.copperDust), new ItemStack(copperIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockRegistry.silverOre), new ItemStack(silverIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.silverDust), new ItemStack(silverIngot, 1), 0.35F);
	}
	
	public static void RemoveRecipes(){
		RemoveRecipes.removeRecipes(Items.sugar);
		RemoveRecipes.removeRecipes(Items.cookie);
		RemoveRecipes.removeRecipes(Items.cake);
		RemoveRecipes.removeRecipes(Items.dye);
		RemoveRecipes.removeRecipes(Items.blaze_powder);
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.brick_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_slab));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_brick_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_pressure_plate));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_button));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.cobblestone_wall));

		//Experimenting with recipes
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.planks));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.acacia_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.sandstone_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_brick_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.oak_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.birch_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.jungle_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.dark_oak_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.brick_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.spruce_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.quartz_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.nether_brick_stairs));
		
		RemoveRecipes.removeRecipes(Items.stick);

		
		//redoing Recipes
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.iron_bars));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.rail));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.activator_rail));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.detector_rail));
		//RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.golden_rail));
		
		
		//getting rid of wooden tools/changing diamond and gold tools and stone tools
		RemoveRecipes.removeRecipes(Items.wooden_axe);
		RemoveRecipes.removeRecipes(Items.wooden_pickaxe);
		RemoveRecipes.removeRecipes(Items.wooden_shovel);
		RemoveRecipes.removeRecipes(Items.wooden_sword);
		RemoveRecipes.removeRecipes(Items.wooden_hoe);
		
		RemoveRecipes.removeRecipes(Items.golden_axe);
		RemoveRecipes.removeRecipes(Items.golden_pickaxe);
		RemoveRecipes.removeRecipes(Items.golden_shovel);
		RemoveRecipes.removeRecipes(Items.golden_sword);
		RemoveRecipes.removeRecipes(Items.golden_hoe);
		
		RemoveRecipes.removeRecipes(Items.diamond_axe);
		RemoveRecipes.removeRecipes(Items.diamond_pickaxe);
		RemoveRecipes.removeRecipes(Items.diamond_shovel);
		RemoveRecipes.removeRecipes(Items.diamond_sword);
		RemoveRecipes.removeRecipes(Items.diamond_hoe);
		
		RemoveRecipes.removeRecipes(Items.stone_axe);
		RemoveRecipes.removeRecipes(Items.stone_pickaxe);
		RemoveRecipes.removeRecipes(Items.stone_shovel);
		RemoveRecipes.removeRecipes(Items.stone_sword);
		RemoveRecipes.removeRecipes(Items.stone_hoe);
		
		RemoveRecipes.removeRecipes(Items.bed);
		
		
	}
	
}