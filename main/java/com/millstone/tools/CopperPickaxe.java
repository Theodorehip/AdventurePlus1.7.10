package com.millstone.tools;


import com.millstone.MillstoneMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class CopperPickaxe extends ItemPickaxe{

	public CopperPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:copper_pickaxe");
		
	}

}
