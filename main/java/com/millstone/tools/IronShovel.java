package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class IronShovel extends ItemSpade{

	public IronShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:iron_shovel");
		
	}

}
