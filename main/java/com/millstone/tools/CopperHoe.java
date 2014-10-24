package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class CopperHoe extends ItemHoe{
	
	public CopperHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstone);
			this.setTextureName("millstonemod:");
		
	}

}
