package com.millstone.items;

import com.millstone.MillstoneMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BoneShard extends Item {
	public BoneShard() {
		this.setUnlocalizedName("boneShard");
		this.setTextureName("millstonemod:bone_shard");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
