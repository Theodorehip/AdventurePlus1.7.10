package com.millstone.trees;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.millstone.MillstoneMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlanksBlockItem extends ItemBlock{
	
	
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public PlanksBlockItem(Block block)
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
	name = "baobab";
	break;
	}
	default:
	name = "noMeta";
	}
	return getUnlocalizedName() + "." + name;
	}
	
	    @Override
	    public int getMetadata(int meta) {
	 
	        return meta;
	    }

	}


