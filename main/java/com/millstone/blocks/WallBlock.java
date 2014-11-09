package com.millstone.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.millstone.MillstoneMod;

public class WallBlock extends BlockWall
{
    private Block icon;
	public WallBlock(Block block, int metadata)
    {
        super(block);
        this.setHardness(3.0F);
        this.setResistance(3.0F);
        this.setStepSound(block.stepSound);
        this.setCreativeTab(MillstoneMod.tabMillstone);
        this.icon = block;
    }
    
//    @SideOnly(Side.CLIENT)
//    public IIcon getIcon(int side, int meta)
//    {
//    	return icon.getBlockTextureFromSide(side);
//    }
//    
//    @SideOnly(Side.CLIENT)
//    public void getSubBlocks(Item item, CreativeTabs tab, List list)
//    {
//    	list.add(new ItemStack(item, 1, 0));
//    }
//	
//    @SideOnly(Side.CLIENT)
//    public void registerBlockIcons(IIconRegister icon) {}
	
	@Override
    public IIcon getIcon(int side, int metadata)
    {
        return icon.getIcon(side, metadata);
    }

    @Override
    public int damageDropped(int i)
    {
        return i;
    }

    @Override
    public void registerBlockIcons(IIconRegister icon) {}

    @Override
    public void getSubBlocks(Item block, CreativeTabs tabs, List list)
    {
    	list.add(new ItemStack(block, 1, 0));
    }
    
    @Override
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z) {
		return true;
	}
}