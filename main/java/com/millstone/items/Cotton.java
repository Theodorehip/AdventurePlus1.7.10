package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.creativetab.tabMillstone;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Cotton extends Item {
	public Cotton() {
		this.setUnlocalizedName("cotton");
		this.setTextureName("millstonemod:cotton");
		this.setCreativeTab(MillstoneMod.tabMillstone);
	}
}
