package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class CopperDust extends Item {
	public CopperDust() {
		this.setUnlocalizedName("copperDust");
		this.setTextureName(References.MODID + ":" + "copperDust");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
