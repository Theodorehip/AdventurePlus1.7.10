package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class StoneDust extends Item {
	public StoneDust() {
		this.setUnlocalizedName("stoneDust");
		this.setTextureName(References.MODID + ":" + "stonedust");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
