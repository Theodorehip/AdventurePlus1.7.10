package com.millstone.trees;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TreeBlockItem extends ItemBlock{
	
	
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	      
	
	public TreeBlockItem(Block block)
    {
        super(block);
        this.setCreativeTab(MillstoneMod.tabMillstone);
        this.setUnlocalizedName("planks");
        setHasSubtypes(true);
        
    }
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
	String name = "";
	switch (itemstack.getItemDamage())
	{
	case 0:
	{
	name = "willow";
	break;
	}
	case 1:
	{
	name = "palm";
	break;
	}
	case 2:
	{
	name = "dreadwood";
	break;
	}
	case 3:
	{
	name = "redwood";
	break;
	}
	case 4:
	{
	name = "applewood";
	break;
	}
	case 5:
	{
	name = "cherry";
	break;
	}
	case 6:
	{
	name = "baobob";
	break;
	}
	default:
	name = "broken";
	}
	return getUnlocalizedName() + "." + name;
	}
	 
	@Override
	public int getMetadata(int par1)
	{
	return par1;
	}
	}


