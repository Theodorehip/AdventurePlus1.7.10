package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class CopperAxe extends ItemAxe{

	public CopperAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstone);
			this.setTextureName("millstonemod:");
		
	}

}
