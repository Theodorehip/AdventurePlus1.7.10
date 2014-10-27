package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldHoe extends ItemHoe{
	
	public EmeraldHoe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:EmeraldHoe");
		
	}

}
