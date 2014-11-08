package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class Flax extends Item {
	public Flax() {
		this.setUnlocalizedName("flax");
		this.setTextureName(References.MODID + ":" + "flax");
		this.setCreativeTab(MillstoneMod.tabMillstone);
	}
}
