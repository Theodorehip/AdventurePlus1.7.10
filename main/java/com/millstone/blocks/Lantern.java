package com.millstone.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;
import com.millstone.registry.ItemRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Lantern extends Block{
	
	private static final String __OBFID = "CL_00000250";
	
	
	@SideOnly(Side.CLIENT)
	private IIcon top;
	@SideOnly(Side.CLIENT)
	private IIcon bottom;

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int p_149691_2_)
	{
	return side == 1 ? this.top : ( side == 0 ? this.bottom :this.blockIcon);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
	this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + "LanternSide");
	this.top = iconRegister.registerIcon(References.MODID + ":" + "LanternTop");
	this.bottom = iconRegister.registerIcon((References.MODID + ":" + "LanternBottom"));
	}
	

    public Lantern(Material p_i45409_1_)
    {
        super(p_i45409_1_);
        this.setCreativeTab(MillstoneMod.tabMillstone);
    }

    /**
     * Returns the usual quantity dropped by the block plus a bonus of 1 to 'i' (inclusive).
     */
    public int quantityDroppedWithBonus(int p_149679_1_, Random p_149679_2_)
    {
        return MathHelper.clamp_int(this.quantityDropped(p_149679_2_) + p_149679_2_.nextInt(p_149679_1_ + 1), 1, 4);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 2 + p_149745_1_.nextInt(3);
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return ItemRegistry.ricePaper;
    }

    public MapColor getMapColor(int p_149728_1_)
    {
        return MapColor.snowColor;
    }

}
