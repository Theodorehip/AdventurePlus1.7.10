package com.millstone.items;

import net.minecraft.item.ItemFood;

import com.millstone.MillstoneMod;

public class sushi extends ItemFood{
	
	
	public sushi(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		
		setUnlocalizedName("sushi");
		setCreativeTab(MillstoneMod.tabMillstone);
		setTextureName(MillstoneMod.MODID + ":" + "Sushi");
		
	}

}
