package com.millstone.items;

import com.millstone.MillstoneMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianDust extends Item {
	public ObsidianDust() {
		this.setUnlocalizedName("ObsidianDust");
		this.setTextureName("millstonemod:ObsidianDust");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
