package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;

public class CopperDust extends Item {
	public CopperDust() {
		this.setUnlocalizedName("copperDust");
		this.setTextureName("millstonemod:copperDust");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
