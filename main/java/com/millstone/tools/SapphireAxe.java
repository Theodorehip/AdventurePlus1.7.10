package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class SapphireAxe extends ItemAxe{

	public SapphireAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:sapphire_axe");
		
	}

}
