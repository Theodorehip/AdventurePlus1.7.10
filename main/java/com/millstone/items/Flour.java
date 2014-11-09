package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Flour extends Item {
	public Flour() {
		this.setUnlocalizedName("flour");
		this.setTextureName(References.MODID + ":" + "Flour");
		this.setCreativeTab(MillstoneMod.tabMillstoneMaterials);
		this.setMaxStackSize(64);
	}
}
