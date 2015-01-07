package com.millstone.trees;

import java.util.List;

import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlanksBlock extends BlockWood{

	public static final String[] icons = new String[] {"willow", "palm", "dreadwood", "redwood", "applewood", "cherry", "baobab"};
	@SideOnly(Side.CLIENT)
    private IIcon[] field_150095_b;
	
	
	public PlanksBlock()
	{
	setBlockName("planks");
	setCreativeTab(MillstoneMod.tabMillstone);
	setStepSound(soundTypeWood);

	}
	
	@Override
    public void registerBlockIcons(IIconRegister iconRegister) {
		this.field_150095_b = new IIcon[icons.length];
		
		for (int i = 0; i < this.field_150095_b.length; i++){
			this.field_150095_b[i] = iconRegister.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + icons[i]);

		}
    }
	 
//	@Override
//	public int damageDropped(int par1)
//	{
//	return par1;
//	}
	
	/**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        if (meta < 0 || meta >= this.field_150095_b.length)
        {
            meta = 0;
        }

        return this.field_150095_b[meta];
    }
	

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs tabs, List list){
		
		for (int i = 0; i < icons.length; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
	 
}