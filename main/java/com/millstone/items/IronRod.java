package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class IronRod extends Item {
	public IronRod() {
		this.setUnlocalizedName("ironRod");
		this.setTextureName(References.MODID + ":" + "IronRod");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
