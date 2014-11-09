package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.item.Item;

public class SilverIngot extends Item {
	public SilverIngot() {
		this.setUnlocalizedName("silverIngot");
		this.setTextureName(References.MODID + ":" + "SilverIngot");
		this.setCreativeTab(MillstoneMod.tabMillstoneMaterials);
		this.setMaxStackSize(64);
	}
}
