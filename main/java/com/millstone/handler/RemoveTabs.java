package com.millstone.handler;

import net.minecraft.item.Item;

public class RemoveTabs {
	
	public static void removeTabs(Item item){
		
		item.setCreativeTab(null);
		
	}

}
