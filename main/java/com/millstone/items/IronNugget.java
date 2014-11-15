package com.millstone.items;

import net.minecraft.item.Item;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class IronNugget extends Item{
	
	public IronNugget() {
		this.setUnlocalizedName("ironNugget");
		this.setTextureName(References.MODID + ":" + "IronNugget");
		this.setCreativeTab(MillstoneMod.tabMillstoneMisc);
		this.setMaxStackSize(64);
	}

}
