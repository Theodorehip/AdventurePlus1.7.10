package com.millstone.blocks;

import java.util.Random;

import net.minecraft.block.BlockBed;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import com.millstone.lib.References;
import com.millstone.registry.ItemRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
 
public class BlockColoredBed extends BlockBed
{
	private int colorIndex;
 
	private IIcon[] topIcons;
	private IIcon[] endIcons;
	private IIcon[] sideIcons;
 
	public BlockColoredBed(int colorIndex)
	{
		super();
		this.colorIndex = colorIndex;
	}
 
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) {
		String prefix = References.MODID + ":" + this.getUnlocalizedName().substring(5);// + "_" + References.COLORS[colorIndex];
 
		this.topIcons = new IIcon[] {iconRegister.registerIcon(prefix + "_feet_top"), iconRegister.registerIcon(prefix + "_head_top")};
		this.endIcons = new IIcon[] {iconRegister.registerIcon(prefix + "_feet_end"), iconRegister.registerIcon(prefix + "_head_end")};
		this.sideIcons = new IIcon[] {iconRegister.registerIcon(prefix + "_feet_side"), iconRegister.registerIcon(prefix + "_head_side")};
	}
 
	/**
	 * Gets the block's texture. Args: side, meta
	 */
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		if (side == 0)
		{
			return Blocks.planks.getBlockTextureFromSide(side);
		}
		else
		{
			int k = getDirection(meta);
			int l = Direction.bedDirection[k][side];
			int i1 = isBlockHeadOfBed(meta) ? 1 : 0;
			return (i1 != 1 || l != 2) && (i1 != 0 || l != 3) ? (l != 5 && l != 4 ? this.topIcons[i1] : this.sideIcons[i1]) : this.endIcons[i1];
		}
	}
 
	@Override
	public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_) {
		return ItemRegistry.coloredBed;
	}
 
	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) {
		return isBlockHeadOfBed(p_149650_1_) ? Item.getItemById(0) : ItemRegistry.coloredBed;
	}
 
	@Override
	public int damageDropped(int p_149692_1_) {
		return colorIndex;
	}
	
	 /**
	    * Determines if this block is classified as a Bed, Allowing 
	    * players to sleep in it, though the block has to specifically 
	    * perform the sleeping functionality in it's activated event.
	    * 
	    * @param world The current world
	    * @param x X Position
	    * @param y Y Position
	    * @param z Z Position
	    * @param player The player or camera entity, null in some cases.
	    * @return True to treat this as a bed
	    */
	   @Override
	   public boolean isBed(IBlockAccess world, int x, int y, int z, EntityLivingBase player) {
	       return true;
	   }
	   
	   /**
	    * Called when a user either starts or stops sleeping in the bed.
	    *  
	    * @param world The current world
	    * @param x X Position
	    * @param y Y Position
	    * @param z Z Position
	    * @param player The player or camera entity, null in some cases.
	    * @param occupied True if we are occupying the bed, or false if they are stopping use of the bed
	    */
	   @Override
	   public void setBedOccupied(IBlockAccess world, int x, int y, int z, EntityPlayer player, boolean occupied) {
	       if (world instanceof World) {
	           BlockBed.func_149979_a((World)world,  x, y, z, occupied);
//		           if (!occupied) {
//		               // Player woke up, collapse the stick shelter
//		               ((World) world).setBlockToAir(x, y, z);
//		               // TODO: quest generation
//		           }
	       }
	   }
	   
	   /**
	    * Returns the position that the player is moved to upon 
	    * waking up, or respawning at the bed.
	    * 
	    * @param world The current world
	    * @param x X Position
	    * @param y Y Position
	    * @param z Z Position
	    * @param player The player or camera entity, null in some cases.
	    * @return The spawn position
	    * 
	    */
	   @Override
	   public ChunkCoordinates getBedSpawnPosition(IBlockAccess world, int x, int y, int z, EntityPlayer player) {
	       if (world instanceof World)
	           return BlockBed.func_149977_a((World)world, x, y, z, 0);
	       return null;
	   }

	   /**
	    * Returns the direction of the block. Same values that
	    * are returned by BlockDirectional
	    *
	    * @param world The current world
	    * @param x X Position
	    * @param y Y Position
	    * @param z Z Position
	    * @return Bed direction
	    */
	   @Override
	   public int getBedDirection(IBlockAccess world, int x, int y, int z) {
	       return BlockBed.getDirection(world.getBlockMetadata(x,  y, z));
	   }

	   /**
	    * Determines if the current block is the foot half of the bed.
	    *
	    * @param world The current world
	    * @param x X Position
	    * @param y Y Position
	    * @param z Z Position
	    * @return True if the current block is the foot side of a bed.
	    */
	   @Override
	   public boolean isBedFoot(IBlockAccess world, int x, int y, int z) {
	       return BlockBed.isBlockHeadOfBed(world.getBlockMetadata(x,  y, z));
	   }
}