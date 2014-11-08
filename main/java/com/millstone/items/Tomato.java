package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.item.ItemFood;

public class Tomato extends ItemFood {
	public Tomato(int i, int j, boolean b) {
		super(j, b);
		this.setUnlocalizedName("tomato");
		this.setTextureName(References.MODID + ":" + "tomato");
		this.setCreativeTab(MillstoneMod.tabMillstone);
	}
}
