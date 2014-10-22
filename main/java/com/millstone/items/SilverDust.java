package com.millstone.items;

import com.millstone.MillstoneMod;

import net.minecraft.item.Item;

public class SilverDust extends Item {
	public SilverDust() {
		this.setUnlocalizedName("silverDust");
		this.setTextureName("millstonemod:SilverDust");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
