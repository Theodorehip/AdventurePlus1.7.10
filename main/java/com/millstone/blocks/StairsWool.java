package com.millstone.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class StairsWool extends BlockStairs {
	
	public StairsWool(String unlocalizedName, Block block, int meta) 
	{
		
		super(block, meta);
		this.setBlockName(unlocalizedName);
		this.setHardness(0.8F);
		this.setResistance(4.0F);
		this.setStepSound(soundTypeCloth);
		this.setCreativeTab(MillstoneMod.tabMillstone);
		this.useNeighborBrightness = true;
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		
		String name = References.MODID + ":" + this.getUnlocalizedName().substring(5);
		 
		this.blockIcon = iconRegister.registerIcon(name);
		
		}
		
	}
	

