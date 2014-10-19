package com.millstone.items;

import com.millstone.MillstoneMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Flour extends Item {
	public Flour() {
		this.setUnlocalizedName("flour");
		this.setTextureName("millstonemod:Flour");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
