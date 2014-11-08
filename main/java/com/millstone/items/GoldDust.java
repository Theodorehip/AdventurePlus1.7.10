package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class GoldDust extends Item {
	public GoldDust() {
		this.setUnlocalizedName("goldDust");
		this.setTextureName(References.MODID + ":" + "gold_grinds");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
