package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class SapphirePickaxe extends ItemPickaxe{

	public SapphirePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:sapphire_pickaxe");
		
	}

}

