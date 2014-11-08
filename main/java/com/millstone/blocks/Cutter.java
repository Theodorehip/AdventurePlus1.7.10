package com.millstone.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Cutter extends Block {
	
	public Cutter() {
		super(Material.iron);
	}

	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon front;
	@SideOnly(Side.CLIENT)
	private IIcon bottom;

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int p_149691_2_)
	{
	return side == 1 ? this.top : ( side == 0 ? this.bottom : (side == 2 ? this.front : this.blockIcon));
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
	this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + "StonecutterSide");
	this.top = iconRegister.registerIcon(References.MODID + ":" + "StonecutterTop");
	this.front = iconRegister.registerIcon(References.MODID + ":" + "StonecutterFront");
	this.bottom = iconRegister.registerIcon((References.MODID + ":" + "StonecutterBottom"));
	}
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		if (!player.isSneaking()) {
			player.openGui(MillstoneMod.instance, MillstoneMod.guiIDCutter, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}
	

}