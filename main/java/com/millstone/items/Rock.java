package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class Rock extends Item {
	public Rock() {
		this.setUnlocalizedName("rock");
		this.setTextureName(References.MODID + ":" + "rock");
		this.setCreativeTab(MillstoneMod.tabMillstoneMaterials);
		this.setMaxStackSize(64);
	}
}