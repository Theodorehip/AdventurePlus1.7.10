package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.item.Item;

public class Sapphire extends Item {
	public Sapphire() {
		this.setUnlocalizedName("sapphire");
		this.setTextureName(References.MODID + ":" + "sapphire");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
