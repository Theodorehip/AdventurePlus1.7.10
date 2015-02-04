package com.millstone.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;

public class ItemBlockStairsWool extends ItemBlockWithMetadata{

	public ItemBlockStairsWool(Block block)
	{
		
		super(block, block);

	}
	
	@Override
	public String getUnlocalizedName(ItemStack stack)
	{
		switch(stack.getItemDamage())
		{
		case 0:
			return this.getUnlocalizedName() + "_white";
		case 1:
			return this.getUnlocalizedName() + "_orange";
		case 2:
			return this.getUnlocalizedName() + "_magenta";
		case 3:
			return this.getUnlocalizedName() + "_light_blue";
		case 4:
			return this.getUnlocalizedName() + "_yellow";
		case 5:
			return this.getUnlocalizedName() + "_lime";
		case 6:
			return this.getUnlocalizedName() + "_pink";
		case 7:
			return this.getUnlocalizedName() + "_gray";
		case 8:
			return this.getUnlocalizedName() + "_light_gray";
		case 9:
			return this.getUnlocalizedName() + "_cyan";
		case 10:
			return this.getUnlocalizedName() + "_purple";
		case 11:
			return this.getUnlocalizedName() + "_blue";
		case 12:
			return this.getUnlocalizedName() + "_brown";
		case 13:
			return this.getUnlocalizedName() + "_green";
		case 14:
			return this.getUnlocalizedName() + "_red";
		case 15:
			return this.getUnlocalizedName() + "_black";
		
		default:
			return this.getUnlocalizedName();		
	
		}
		
	}
	
}
