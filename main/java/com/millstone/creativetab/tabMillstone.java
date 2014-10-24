package com.millstone.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.millstone.MillstoneItems;

public class tabMillstone extends CreativeTabs{
	
	public tabMillstone(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return MillstoneItems.obsidianDust;
	}
}
