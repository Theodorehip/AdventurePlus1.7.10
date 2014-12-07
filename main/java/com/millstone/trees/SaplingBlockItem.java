package com.millstone.trees;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.millstone.MillstoneMod;

public class SaplingBlockItem extends ItemBlock{
	
	public static final String[] sapling = new String[] {"willow", "palm", "dreadwood", "redwood", "applewood", "cherry", "baobab"};

	
	public SaplingBlockItem(Block block)
    {
        super(block);
        setCreativeTab(MillstoneMod.tabMillstoneDeco);
        setUnlocalizedName("leaf");
        setHasSubtypes(true);
        
    }
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		int i = itemstack.getItemDamage();
		
		if (i < 0 || i >= sapling.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + sapling[i]; 
		}
	
	    @Override
	    public int getMetadata(int meta) {
	 
	        return meta;
	    }

}
