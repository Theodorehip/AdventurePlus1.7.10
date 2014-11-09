package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.item.Item;

public class Ruby extends Item {
	public Ruby() {
		this.setUnlocalizedName("ruby");
		this.setTextureName(References.MODID + ":" + "ruby");
		this.setCreativeTab(MillstoneMod.tabMillstoneMaterials);
		this.setMaxStackSize(64);
	}
}
