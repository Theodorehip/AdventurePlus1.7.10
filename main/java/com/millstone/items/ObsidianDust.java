package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ObsidianDust extends Item {
	public ObsidianDust() {
		this.setUnlocalizedName("ObsidianDust");
		this.setTextureName(References.MODID + ":" + "ObsidianDust");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
