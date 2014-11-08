package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.creativetab.tabMillstone;
import com.millstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Cotton extends Item {
	public Cotton() {
		this.setUnlocalizedName("cotton");
		this.setTextureName(References.MODID + ":" + "cotton");
		this.setCreativeTab(MillstoneMod.tabMillstone);
	}
}
