package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class Straw extends Item {
	public Straw() {
		this.setUnlocalizedName("straw");
		this.setTextureName(References.MODID + ":" + "straw");
		this.setCreativeTab(MillstoneMod.tabMillstoneMaterials);
		this.setMaxStackSize(64);
	}
}
