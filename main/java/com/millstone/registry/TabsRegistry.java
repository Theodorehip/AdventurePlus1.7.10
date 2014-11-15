package com.millstone.registry;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;

import com.millstone.creativetab.tabMillstone;
import com.millstone.creativetab.tabMillstoneArmor;
import com.millstone.creativetab.tabMillstoneFood;
import com.millstone.creativetab.tabMillstoneMaterials;
import com.millstone.creativetab.tabMillstoneMisc;
import com.millstone.creativetab.tabMillstoneTools;
import com.millstone.handler.RemoveTabs;

public class TabsRegistry {
	
	public static void RemoveRecipes(){
		RemoveTabs.removeTabs(Items.iron_sword);
		RemoveTabs.removeTabs(Items.iron_pickaxe);
		RemoveTabs.removeTabs(Items.iron_shovel);
		RemoveTabs.removeTabs(Items.iron_axe);
		RemoveTabs.removeTabs(Items.iron_hoe);
	}

}
