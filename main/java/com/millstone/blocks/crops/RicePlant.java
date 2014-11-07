package com.millstone.blocks.crops;

import net.minecraft.block.BlockCrops;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import com.millstone.MillstoneMod;
import com.millstone.registry.ItemRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class RicePlant extends BlockCrops{
	

	@SideOnly(Side.CLIENT)
	private IIcon[] iconArray;
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.iconArray = new IIcon[8];

        for (int i = 0; i < this.iconArray.length; ++i)
        {
            this.iconArray[i] = p_149651_1_.registerIcon(MillstoneMod.MODID + ":" + this.getUnlocalizedName().substring(5) + "_stage_" + i);
        }
    }
    
    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ < 0 || p_149691_2_ > 7)
        {
            p_149691_2_ = 7;
        }

        return this.iconArray[p_149691_2_];
    }
	
	/**
	 * seeds
	 */
	@Override
	protected Item func_149866_i()
    {
        return ItemRegistry.riceCrop;
    }
	
	
	/**
	 * crop
	 */
	@Override
    protected Item func_149865_P()
    {
        return ItemRegistry.riceCrop;
    }
	
	

}
