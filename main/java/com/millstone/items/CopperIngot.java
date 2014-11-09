package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class CopperIngot extends Item {
	public CopperIngot() {
		this.setUnlocalizedName("copperIngot");
		this.setTextureName(References.MODID + ":" + "copperIngot");
		this.setCreativeTab(MillstoneMod.tabMillstoneMaterials);
		this.setMaxStackSize(64);
	}
}
