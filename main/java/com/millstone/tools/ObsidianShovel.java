package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class ObsidianShovel extends ItemSpade{

	public ObsidianShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstone);
			this.setTextureName("millstonemod:RefObsShovel");
		
	}

}
