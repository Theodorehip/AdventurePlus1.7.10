package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class EmeraldPickaxe extends ItemPickaxe{

	public EmeraldPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:EmeraldPickaxe");
		
	}

}

