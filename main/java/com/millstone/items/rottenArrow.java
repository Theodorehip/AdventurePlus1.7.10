package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;

public class rottenArrow extends Item{
	
	public rottenArrow() {
		this.setUnlocalizedName("rottenArrow");
		this.setTextureName(MillstoneMod.MODID + ":" + "rottenArrow");
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
		this.setMaxStackSize(64);
	}

}
