package com.millstone.trees;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.millstone.MillstoneMod;
import com.millstone.registry.BlockRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class SlabBlock extends BlockSlab
{
	public static final String[] StepTypes = new String[] {"willow", "palm", "dreadwood", "redwood", "applewood", "cherry", "baobob"};

	public SlabBlock(boolean isdouble, Material material)
	{
		super(isdouble, material);
		setBlockName("slab");
		setCreativeTab(MillstoneMod.tabMillstone);
		setStepSound(soundTypeWood);
		this.setCreativeTab(MillstoneMod.tabMillstone);
		
		if(!this.field_150004_a)
		{
			this.setLightOpacity(0);
		}
	}

	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata)
	{
		int k = metadata & 7;
		return k == 0 ? BlockRegistry.planks.getIcon(side, 0) : k == 1 ? BlockRegistry.planks.getIcon(side, 1) : k == 2 ? BlockRegistry.planks.getIcon(side, 2) : k == 3 ? BlockRegistry.planks.getIcon(side, 3) : k == 4 ? BlockRegistry.planks.getIcon(side, 4) : k == 5 ? BlockRegistry.planks.getIcon(side, 5) : k == 6 ? BlockRegistry.planks.getIcon(side, 6) : BlockRegistry.planks.getIcon(side, 7);
	}

	@SideOnly(Side.CLIENT)
	private static boolean func_150003_a(Block block)
	{
		return block == BlockRegistry.singleSlab;
	}

	@SideOnly(Side.CLIENT)
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	{
		return func_150003_a(this) ? Item.getItemFromBlock(BlockRegistry.singleSlab) : Item.getItemFromBlock(BlockRegistry.doubleSlab);
	}

	public Item getItemDropped(int metadata, Random rand, int fortune)
	{
        return Item.getItemFromBlock(this);	}

	protected ItemStack createStackedBlock(int metadata)
	{
		return new ItemStack(BlockRegistry.singleSlab, 2, metadata & 7);
	}

	@SideOnly(Side.CLIENT)
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list)
	{
		if(item != Item.getItemFromBlock(BlockRegistry.doubleSlab))
		{
			for(int i = 0; i < StepTypes.length; i++)
			{
				list.add(new ItemStack(item, 1, i));
			}
		}
	}

	@Override
	public String func_150002_b(int metadata)
	{
		if(metadata < 0 || metadata >= StepTypes.length)
		{
			metadata = 0;
		}
		return super.getUnlocalizedName() + "." + StepTypes[metadata];
	}
}