package com.millstone.trees;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.millstone.MillstoneMod;

public class ItemSaplingBlocks extends ItemBlock{
	
	public static final String[] saplings = new String[] {"willow", "palm", "dreadwood", "redwood", "applewood", "cherry", "baobob"};

	
	public ItemSaplingBlocks(Block block)
    {
        super(block);
        setCreativeTab(MillstoneMod.tabMillstoneDeco);
        setUnlocalizedName("saplings");
        setHasSubtypes(true);
        
    }
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		int i = itemstack.getItemDamage();
		
		if (i < 0 || i >= saplings.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + saplings[i]; 
		}
	
	    @Override
	    public int getMetadata(int meta) {
	 
	        return meta;
	    }

}
