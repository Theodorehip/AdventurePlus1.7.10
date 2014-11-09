package com.millstone.creativetab;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import com.millstone.registry.BlockRegistry;
import com.millstone.registry.ItemRegistry;

public class tabMillstoneFood extends CreativeTabs{
	
	public tabMillstoneFood(int par1, String par2Str) {
		super(par1, par2Str);
		
	}
	
	@Override
	public Item getTabIconItem(){
		return ItemRegistry.tomato;
	}
}
