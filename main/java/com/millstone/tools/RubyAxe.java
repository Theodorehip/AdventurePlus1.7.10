package com.millstone.tools;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

import com.millstone.MillstoneMod;


public class RubyAxe extends ItemAxe{

	public RubyAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:ruby_axe");
		
	}

}
