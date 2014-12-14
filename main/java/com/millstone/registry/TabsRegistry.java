package com.millstone.registry;

import net.minecraft.init.Items;

import com.millstone.handler.ModifyingHandler;

public class TabsRegistry {
	
	public static void RemoveCreativeTab(){
		
		ModifyingHandler.removeTabs(Items.iron_sword);
		ModifyingHandler.removeTabs(Items.iron_pickaxe);
		ModifyingHandler.removeTabs(Items.iron_shovel);
		ModifyingHandler.removeTabs(Items.iron_axe);
		ModifyingHandler.removeTabs(Items.iron_hoe);
		
		ModifyingHandler.removeTabs(Items.bed);
	}

}
