package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class BoneShard extends Item {
	public BoneShard() {
		this.setUnlocalizedName("boneShard");
		this.setTextureName(References.MODID + ":" + "bone_shard");
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.setMaxStackSize(64);
	}
}
