package com.millstone.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.millstone.handler.RemoveRecipes;

public class RecipeRemover {

	public static void removeListedRecipes(){
				//Remove Recipes
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
	}
	
}
