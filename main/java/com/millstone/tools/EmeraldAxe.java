package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldAxe extends ItemAxe{

	public EmeraldAxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:EmeraldAxe");
		
	}

}
