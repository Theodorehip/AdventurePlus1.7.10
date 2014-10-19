package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;

public class CopperIngot extends Item {
	public CopperIngot() {
		this.setUnlocalizedName("copperIngot");
		this.setTextureName("millstonemod:copperIngot");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
