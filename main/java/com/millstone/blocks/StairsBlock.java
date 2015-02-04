package com.millstone.blocks;

import java.util.List;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class StairsBlock extends BlockStairs
{
	public StairsBlock(Block block, int metadata)
	{
		super(block, metadata);
        this.setStepSound(block.stepSound);
		this.setCreativeTab(MillstoneMod.tabMillstone);
	}
	
}