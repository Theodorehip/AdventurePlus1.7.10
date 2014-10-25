package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class CopperShovel extends ItemSpade{

	public CopperShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:copper_shovel");
		
	}

}
