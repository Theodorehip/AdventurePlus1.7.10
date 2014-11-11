package com.millstone.trees;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.millstone.MillstoneMod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class LogBlockItem extends ItemBlock{
	
	
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	
	public static final String[] logs = new String[] {"willow", "palm", "dreadwood", "redwood", "applewood", "cherry", "baobob"};

	
	public LogBlockItem(Block block)
    {
        super(block);
        this.setCreativeTab(MillstoneMod.tabMillstone);
        this.setUnlocalizedName("log");
        setHasSubtypes(true);
        
    }
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		int i = itemstack.getItemDamage();
		
		if (i < 0 || i >= logs.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + logs[i]; 
		}
	
	    @Override
	    public int getMetadata(int meta) {
	 
	        return meta;
	    }

	}


