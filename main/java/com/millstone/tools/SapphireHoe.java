package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class SapphireHoe extends ItemHoe{
	
	public SapphireHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:sapphire_hoe");
		
	}

}
