package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

public class RubyPickaxe extends ItemPickaxe{

	public RubyPickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstone);
			this.setTextureName("millstonemod:");
		
	}

}

