package com.millstone.tools;

import com.millstone.MillstoneMod;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;

public class SapphireShovel extends ItemSpade{

	public SapphireShovel(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstoneTools);
			this.setTextureName("millstonemod:");
		
	}

}
