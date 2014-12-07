package com.millstone.trees;

import java.util.List;

import net.minecraft.block.Block;
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

public class PlanksBlock extends Block{

	private int maxMeta = 7;
	public IIcon[] icons;
	
	public PlanksBlock()
	{
	super(Material.wood);
	setBlockName("planks");
	setCreativeTab(MillstoneMod.tabMillstone);
	setStepSound(soundTypeWood);

	icons = new IIcon[maxMeta];
	
	}
	
	@Override
    public void registerBlockIcons(IIconRegister iconRegister) {
 
        for(int i = 0; i < icons.length; i++) {
 
            icons[i] = iconRegister.registerIcon(References.MODID + ":" + "planks" + i);
        }
    }
	 
	@Override
	public int damageDropped(int par1)
	{
	return par1;
	}
	
	@SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta) {
 
        switch(meta) {
 
            case 0:
                return icons[0];
           case 1: 
//                {
// 
//                switch(side) {
// 
//                    case 0:
//                        return icons[1];
//                    case 1:
//                        return icons[2];
//                    case 2:
//                        return icons[3];
//                    default:
//                        return icons[5];
//                }
//            }
        	    return icons[1];
            case 2:
                return icons[2];
            case 3:
                return icons[3];
            case 4:
                return icons[4];
            case 5:
                return icons[5];
            case 6:
               return icons[6];
            default: {
            	return icons[0];
        }
        }
    }

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	    public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list) {
	 
	        for(int i = 0; i < maxMeta; i++){
	 
	            list.add(new ItemStack(item, 1, i));
	        }
	    }
	
	 
}