package com.millstone.crafting;

import java.util.Comparator;

import net.minecraft.item.crafting.IRecipe;

public class CutterSorter implements Comparator {

	final CutterCraftingManager cutter;
	
	public CutterSorter(CutterCraftingManager cutter) {
		this.cutter = cutter;
	}
	
	public int compareRecipes(IRecipe irecipe1, IRecipe irecipe2) {
		return irecipe1 instanceof CutterShapelessRecipes && irecipe2 instanceof CutterShapedRecipes ? 1: (irecipe2 instanceof CutterShapelessRecipes && irecipe1 instanceof CutterShapedRecipes ? -1 : (irecipe2.getRecipeSize() < irecipe1.getRecipeSize() ? -1 : (irecipe2.getRecipeSize() > irecipe1.getRecipeSize() ? 1 : 0)));
	}
	
	@Override
	public int compare(Object o1, Object o2) {
		return this.compareRecipes((IRecipe)o1, (IRecipe)o2);
	}

}