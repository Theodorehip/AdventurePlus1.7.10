package com.millstone.registry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import com.millstone.handler.RemoveTabs;

public class TabsRegistry {
	
	public static void RemoveCreativeTab(){
		
		RemoveTabs.removeTabs(Items.iron_sword);
		RemoveTabs.removeTabs(Items.iron_pickaxe);
		RemoveTabs.removeTabs(Items.iron_shovel);
		RemoveTabs.removeTabs(Items.iron_axe);
		RemoveTabs.removeTabs(Items.iron_hoe);
		
		RemoveTabs.removeTabs(Items.bed);
	}

}
