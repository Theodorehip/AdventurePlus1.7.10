package com.millstone;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class MillstoneCrafting {

	public static void addCraftingRecipes(){

		/**
		 *Let me explain recipes. So the "stonegear, 1" in the itemstack is basically the item you want to create, and the 1 for
		 *how many. Simple. Now, where you see the " S ", "S S", " S ", 'S', Blocks.stone" is where it gets trickier. Each "" represents
		 *one row in the crafting grid. The first "" is the top row, second "" middle, third "" bottom. Now, you put any letter you want 
		 *in there, such as S in the order you want to craft your recipe. If you want to leave a space blank, simply put a space there.
		 *Make sure there is only 3 characters in each "" for the recipe to work. Now, the 'S', Blocks.stone part is basically defining what
		 *the letter(s) you put in your recipe are. For example, its registering the S (caps are important) as the Stone. For a recipe with
		 *multiple characters such as "SIS", "ISI", "SIS", you would do (after the 3 "" 's) 'S', Blocks.stone (or whatever you want to use), 
		 *'I', Items.iron_ingot
		 *Hopefully I didn't make this too confusing*/

		//Logs to Planks reduction
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), new Object[] {new ItemStack(Blocks.log, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 1), new Object[] {new ItemStack(Blocks.log, 1, 1)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 2), new Object[] {new ItemStack(Blocks.log, 1, 2)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 3), new Object[] {new ItemStack(Blocks.log, 1, 3)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 4), new Object[] {new ItemStack(Blocks.log2, 1, 0)});
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 5), new Object[] {new ItemStack(Blocks.log2, 1, 1)});

		GameRegistry.addShapedRecipe(new ItemStack(Blocks.oak_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 0)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.birch_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 2)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.spruce_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.jungle_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 3)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.acacia_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 4)});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.dark_oak_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 5)});  
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.cobblestone});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.brick_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.brick_block});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_brick_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.stonebrick});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.nether_brick_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.nether_brick});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.sandstone});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.quartz_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.quartz_block});

		GameRegistry.addShapedRecipe(new ItemStack(MillstoneBlocks.millstoneIdle, 1), new Object[]{"SGS", "IXI", "BBB", 'S', Blocks.stone_slab, 'I', Items.iron_ingot, 'X', MillstoneBlocks.stoneCutter, 'G', Items.gold_ingot, 'B', Blocks.stonebrick});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneBlocks.stoneCutter, 1), new Object[]{"CCC", "CSC", "CCC", 'C', Blocks.cobblestone, 'S', MillstoneItems.stoneGear});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneBlocks.obsidianBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', MillstoneItems.obsidianDust});
		GameRegistry.addShapedRecipe(new ItemStack(Items.cake, 1), new Object[]{"MMM", "SES", "FFF", 'S', Items.sugar, 'M', Items.milk_bucket, 'E', Items.egg, 'F', MillstoneItems.flour});
		GameRegistry.addShapedRecipe(new ItemStack(Items.cookie, 8), new Object[]{"   ", "FCF", "   ",'F', MillstoneItems.flour, 'C', new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.string, 1), new Object[]{"   ", "CCC", "   ", 'C', MillstoneItems.cotton});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1), new Object[]{"   ", "CC ", "CC ", 'C', MillstoneItems.cotton});

		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.woodGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.stick, 'C', Blocks.planks});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.stoneGear, 1), new Object[]{" S ", "SCS", " S ", 'C', Blocks.cobblestone, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.ironGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.iron_ingot, 'C', MillstoneItems.stoneGear});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.goldGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.gold_ingot, 'C', MillstoneItems.ironGear});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.diamondGear, 1), new Object[]{" S ", "SCS", " S ", 'C', MillstoneItems.ironGear, 'S', Items.diamond});

		//Tools
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.obsidianSword, 1), new Object[]{" O ", " O ", " I ", 'I', MillstoneItems.ironRod, 'O', MillstoneBlocks.obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.obsidianPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', MillstoneItems.ironRod, 'O', MillstoneBlocks.obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.obsidianAxe, 1), new Object[]{" OO", " IO", " I ", 'I', MillstoneItems.ironRod, 'O', MillstoneBlocks.obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.obsidianShovel, 1), new Object[]{" O ", " I ", " I ", 'I', MillstoneItems.ironRod, 'O', MillstoneBlocks.obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.obsidianHoe, 1), new Object[]{" OO", " I ", " I ", 'I', MillstoneItems.ironRod, 'O', MillstoneBlocks.obsidianBlock});


		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.riceBowl,1), new Object[] {"x", "y", 'x', MillstoneItems.riceCrop, 'y', Items.bowl});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneBlocks.lantern,1), new Object[] {"xxx", "xyx", "xxx", 'x', MillstoneItems.ricePaper, 'y', Blocks.torch});
		GameRegistry.addShapedRecipe(new ItemStack(MillstoneItems.ricePaper,1), new Object[] {"xxx", 'x', MillstoneItems.riceCrop});
		GameRegistry.addShapelessRecipe(new ItemStack(MillstoneItems.sushi,1), new Object[] {new ItemStack(MillstoneItems.riceCrop, 1), Items.fish});


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


		GameRegistry.addSmelting(new ItemStack(MillstoneItems.ironDust), new ItemStack(Items.iron_ingot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MillstoneItems.goldDust), new ItemStack(Items.gold_ingot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MillstoneItems.flour), new ItemStack(Items.bread, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MillstoneBlocks.copperOre), new ItemStack(MillstoneItems.copperIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MillstoneItems.copperDust), new ItemStack(MillstoneItems.copperIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MillstoneBlocks.silverOre), new ItemStack(MillstoneItems.silverIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(MillstoneItems.silverDust), new ItemStack(MillstoneItems.silverIngot, 1), 0.35F);
	}

}
