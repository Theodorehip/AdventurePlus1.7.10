package com.millstone.items;

import com.millstone.MillstoneMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ricePaper extends Item {
	
	public ricePaper() {
		this.setUnlocalizedName("ricePaper");
		this.setTextureName(MillstoneMod.MODID + ":ricePaper");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
