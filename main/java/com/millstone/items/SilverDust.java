package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.item.Item;

public class SilverDust extends Item {
	public SilverDust() {
		this.setUnlocalizedName("silverDust");
		this.setTextureName(References.MODID + ":" + "SilverDust");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
