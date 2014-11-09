package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class RicePaper extends Item {
	
	public RicePaper() {
		this.setUnlocalizedName("ricePaper");
		this.setTextureName(References.MODID + ":ricePaper");
		this.setCreativeTab(MillstoneMod.tabMillstoneMisc);
		this.setMaxStackSize(64);
	}
}
