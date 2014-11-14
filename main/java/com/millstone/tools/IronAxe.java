package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class IronAxe extends ItemAxe{

	public IronAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:iron_axe");
		
	}

}
