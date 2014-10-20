package com.millstone.items;

import com.millstone.MillstoneMod;

import net.minecraft.item.Item;

public class Ruby extends Item {
	public Ruby() {
		this.setUnlocalizedName("ruby");
		this.setTextureName("millstonemod:ruby");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
