package com.millstone.handler;

import java.util.Iterator;
import java.util.List;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;

public class RemoveRecipes {

	public static void removeRecipes(Item item) {
		 List<IRecipe> recipesList = CraftingManager.getInstance().getRecipeList();

		    Iterator<IRecipe> removerIterator = recipesList.iterator();


		    while (removerIterator.hasNext()){
		          ItemStack itemStack = removerIterator.next().getRecipeOutput();
		          if (itemStack != null && itemStack.getItem() == item)
		                removerIterator.remove();
		          }
	}
	
}