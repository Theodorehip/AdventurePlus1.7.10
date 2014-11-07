package com.millstone.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.registry.ItemRegistry;

public class tabMillstoneTools extends CreativeTabs{
	
	public tabMillstoneTools(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return ItemRegistry.obsidianPickaxe;
	}
}
