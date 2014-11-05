package com.millstone.tools;

import com.millstone.MillstoneMod;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.IIcon;

public class FlintKnife extends ItemSword {

	public FlintKnife(ToolMaterial material) {
		super(material);

		this.setCreativeTab(MillstoneMod.tabMillstoneTools);

		this.setTextureName("millstonemod:flint_knife");

	}

}