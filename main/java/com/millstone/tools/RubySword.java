package com.millstone.tools;

import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

import com.millstone.MillstoneMod;

public class RubySword extends ItemSword{

	public RubySword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstone);
			this.setTextureName("millstonemod:");
		
	}

}
