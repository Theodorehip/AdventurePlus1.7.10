package com.millstone.tools;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.Item.ToolMaterial;

import com.millstone.MillstoneMod;

public class BonePickaxe extends ItemPickaxe{

	public BonePickaxe(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:bone_pickaxe");
		
	}

}
