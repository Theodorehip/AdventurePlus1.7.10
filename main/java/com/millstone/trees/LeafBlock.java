package com.millstone.trees;

import java.util.List;

import com.millstone.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class LeafBlock extends BlockLeaves{
	
	public static final String[][] leaftypes = new String[][] {{"leaf_willow", "leaf_palm", "leaf_dreadwood", "leaf_redwood", "leaf_applewood", "leaf_cherry", "leaf_baobab"}, {"leaf_willow_opaque", "leaf_palm_opaque", "leaf_dreadwood_opaque", "leaf_redwood_opaque", "leaf_applewood_opaque", "leaf_cherry_opaque", "leaf_baobab_opaque"}};
	public static final String[] leaf = new String[] {"willow", "palm", "dreadwood", "redwood", "applewood", "cherry", "baobab"};
	
	protected void func_150124_c(World world, int x, int y, int z, int side, int meta)
    {
        if ((side & 3) == 1 && world.rand.nextInt(meta) == 0)
        {
            this.dropBlockAsItem(world, x, y, z, new ItemStack(Items.apple, 1, 0));
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int i)
    {
        return super.damageDropped(i) + 4;
    }

    /**
     * Get the block's damage value (for use with pick block).
     */
    public int getDamageValue(World world, int x, int y, int z)
    {
        return world.getBlockMetadata(x, y, z) & 3;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
	@Override
	public IIcon getIcon(int side, int meta) {
		return (meta & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : this.field_150129_M[this.field_150127_b][0];
	}

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item item, CreativeTabs tabs, List list)
    {
    	for (int i = 0; i < leaf.length; i++){
			list.add(new ItemStack(item, 1, i));
		}
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        for (int i = 0; i < leaftypes.length; ++i)
        {
            this.field_150129_M[i] = new IIcon[leaftypes[i].length];

            for (int j = 0; j < leaftypes[i].length; ++j)
            {
                this.field_150129_M[i][j] = iconRegister.registerIcon(References.MODID + ":" + leaftypes[i][j]);
            }
        }
    }
	
	@Override
	public String[] func_150125_e() {
		return leaf;
	}

}
