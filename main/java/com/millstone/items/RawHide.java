package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class RawHide extends Item {
	public RawHide() {
		this.setUnlocalizedName("rawHide");
		this.setTextureName(References.MODID + ":" + "rawHide");
		this.setCreativeTab(MillstoneMod.tabMillstoneMaterials);
		this.setMaxStackSize(64);
	}
}
