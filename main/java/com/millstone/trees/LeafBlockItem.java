package com.millstone.trees;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.millstone.MillstoneMod;

public class LeafBlockItem extends ItemBlock{
	
	public static final String[] leaf = new String[] {"willow", "palm", "dreadwood", "redwood", "applewood", "cherry", "baobob"};

	
	public LeafBlockItem(Block block)
    {
        super(block);
        this.setCreativeTab(MillstoneMod.tabMillstone);
        this.setUnlocalizedName("leaf");
        setHasSubtypes(true);
        
    }
	
	@Override
	public String getUnlocalizedName(ItemStack itemstack)
	{
		int i = itemstack.getItemDamage();
		
		if (i < 0 || i >= leaf.length){
			i = 0;
		}
		return super.getUnlocalizedName() + "." + leaf[i]; 
		}
	
	    @Override
	    public int getMetadata(int meta) {
	 
	        return meta;
	    }

}
