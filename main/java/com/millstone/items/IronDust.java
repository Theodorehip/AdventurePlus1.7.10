package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronDust extends Item {
	public IronDust() {
		this.setUnlocalizedName("ironDust");
		this.setTextureName(References.MODID + ":" + "ironDust");
		this.setCreativeTab(MillstoneMod.tabMillstoneMaterials);
		this.setMaxStackSize(64);
	}
}
