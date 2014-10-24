package com.millstone.items;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemFood;

public class Tomato extends ItemFood {
	public Tomato(int i, int j, boolean b) {
		super(j, b);
		this.setUnlocalizedName("tomato");
		this.setTextureName("millstonemod:tomato");
		this.setCreativeTab(MillstoneMod.tabMillstone);
	}
}
