package com.millstone.items;

import com.millstone.MillstoneMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronDust extends Item {
	public IronDust() {
		this.setUnlocalizedName("ironDust");
		this.setTextureName("millstonemod:ironDust");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
