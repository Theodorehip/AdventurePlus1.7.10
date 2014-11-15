package com.millstone.items;

import net.minecraft.item.Item;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class LeatherStrip extends Item{
	
	public LeatherStrip() {
		this.setUnlocalizedName("leatherStrip");
		this.setTextureName(References.MODID + ":" + "LeatherStrip");
		this.setCreativeTab(MillstoneMod.tabMillstoneMisc);
		this.setMaxStackSize(64);
	}

}
