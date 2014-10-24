package com.millstone.tools;

import com.millstone.MillstoneMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon;

public class CopperSword extends ItemSword{

	public CopperSword(ToolMaterial material) {
		super(material);
		this.setCreativeTab(MillstoneMod.tabMillstone);
			this.setTextureName("millstonemod:");
		
	}

}
