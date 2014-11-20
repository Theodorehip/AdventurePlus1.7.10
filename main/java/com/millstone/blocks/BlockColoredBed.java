package com.millstone.blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBed;
import net.minecraft.block.BlockDirectional;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

import com.millstone.lib.References;
import com.millstone.registry.BlockRegistry;
import com.millstone.registry.ItemRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

	public class BlockColoredBed extends BlockDirectional
	{
		
		public static final String[] color = new String[] {"black", "blue", "brown", "cyan", "gray", "green", "light_blue", "lime", "magenta", "orange", "pink", "purple", "red", "silver", "white", "yellow"};

	    public static final int[][] field_149981_a = new int[][] {{0, 1}, { -1, 0}, {0, -1}, {1, 0}};
	    @SideOnly(Side.CLIENT)
	    private IIcon[] field_149980_b;
	    @SideOnly(Side.CLIENT)
	    private IIcon[] field_149982_M;
	    @SideOnly(Side.CLIENT)
	    private IIcon[] field_149983_N;

	    public BlockColoredBed()
	    {
	        super(Material.cloth);
	        func_149978_e();
	        }
	    
	    private void func_149978_e()
	    {
	        this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
	    }

	    /**
	     * Gets the block's texture. Args: side, meta
	     */
	    @SideOnly(Side.CLIENT)
	    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
	    {
	        if (p_149691_1_ == 0)
	        {
	            return Blocks.planks.getBlockTextureFromSide(p_149691_1_);
	        }
	        else
	        {
	            int k = getDirection(p_149691_2_);
	            int l = Direction.bedDirection[k][p_149691_1_];
	            int i1 = isBlockHeadOfBed(p_149691_2_) ? 1 : 0;
	            return (i1 != 1 || l != 2) && (i1 != 0 || l != 3) ? (l != 5 && l != 4 ? this.field_149983_N[i1] : this.field_149982_M[i1]) : this.field_149980_b[i1];
	        }
	    }

	    @SideOnly(Side.CLIENT)
	    public void registerBlockIcons(IIconRegister p_149651_1_)
	    {
	    	this.field_149983_N = new IIcon[color.length];
			this.field_149980_b = new IIcon[color.length];
			this.field_149982_M = new IIcon[color.length];

			
	    	for (int i = 0; i < this.color.length; i++){
	        this.field_149983_N = new IIcon[] {p_149651_1_.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + color[i] + "_feet_top"), p_149651_1_.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + color[i] + "_head_top")};
	        this.field_149980_b = new IIcon[] {p_149651_1_.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + color[i] + "_feet_end"), p_149651_1_.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + color[i] + "_head_end")};
	        this.field_149982_M = new IIcon[] {p_149651_1_.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + color[i] + "_feet_side"), p_149651_1_.registerIcon(References.MODID + ":" + this.getUnlocalizedName().substring(5) + "_" + color[i] + "_head_side")};
	    	}
	    }

	    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
	    {
	        /**
	         * Returns whether or not this bed block is the head of the bed.
	         */
	        return isBlockHeadOfBed(p_149650_1_) ? Item.getItemById(0) : ItemRegistry.itemColoredBed;
	    }

	    
	    
	    @SideOnly(Side.CLIENT)
		public void getSubBlocks(Item item, CreativeTabs tabs, List list){
			
			for (int i = 0; i < color.length; i++){
				list.add(new ItemStack(item, 1, i));
			}
		}
	   
	    
	    /**
	     * Called upon block activation (right click on the block.)
	     */
	    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	    {
	        if (p_149727_1_.isRemote)
	        {
	            return true;
	        }
	        else
	        {
	            int i1 = p_149727_1_.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_);

	            if (!isBlockHeadOfBed(i1))
	            {
	                int j1 = getDirection(i1);
	                p_149727_2_ += field_149981_a[j1][0];
	                p_149727_4_ += field_149981_a[j1][1];

	                if (p_149727_1_.getBlock(p_149727_2_, p_149727_3_, p_149727_4_) != this)
	                {
	                    return true;
	                }

	                i1 = p_149727_1_.getBlockMetadata(p_149727_2_, p_149727_3_, p_149727_4_);
	            }

	            if (p_149727_1_.provider.canRespawnHere() && p_149727_1_.getBiomeGenForCoords(p_149727_2_, p_149727_4_) != BiomeGenBase.hell)
	            {
	                if (func_149976_c(i1))
	                {
	                    EntityPlayer entityplayer1 = null;
	                    Iterator iterator = p_149727_1_.playerEntities.iterator();

	                    while (iterator.hasNext())
	                    {
	                        EntityPlayer entityplayer2 = (EntityPlayer)iterator.next();

	                        if (entityplayer2.isPlayerSleeping())
	                        {
	                            ChunkCoordinates chunkcoordinates = entityplayer2.playerLocation;

	                            if (chunkcoordinates.posX == p_149727_2_ && chunkcoordinates.posY == p_149727_3_ && chunkcoordinates.posZ == p_149727_4_)
	                            {
	                                entityplayer1 = entityplayer2;
	                            }
	                        }
	                    }

	                    if (entityplayer1 != null)
	                    {
	                        p_149727_5_.addChatComponentMessage(new ChatComponentTranslation("tile.bed.occupied", new Object[0]));
	                        return true;
	                    }

	                    func_149979_a(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, false);
	                }

	                EntityPlayer.EnumStatus enumstatus = p_149727_5_.sleepInBedAt(p_149727_2_, p_149727_3_, p_149727_4_);

	                if (enumstatus == EntityPlayer.EnumStatus.OK)
	                {
	                    func_149979_a(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, true);
	                    return true;
	                }
	                else
	                {
	                    if (enumstatus == EntityPlayer.EnumStatus.NOT_POSSIBLE_NOW)
	                    {
	                        p_149727_5_.addChatComponentMessage(new ChatComponentTranslation("tile.bed.noSleep", new Object[0]));
	                    }
	                    else if (enumstatus == EntityPlayer.EnumStatus.NOT_SAFE)
	                    {
	                        p_149727_5_.addChatComponentMessage(new ChatComponentTranslation("tile.bed.notSafe", new Object[0]));
	                    }

	                    return true;
	                }
	            }
	            else
	            {
	                double d2 = (double)p_149727_2_ + 0.5D;
	                double d0 = (double)p_149727_3_ + 0.5D;
	                double d1 = (double)p_149727_4_ + 0.5D;
	                p_149727_1_.setBlockToAir(p_149727_2_, p_149727_3_, p_149727_4_);
	                int k1 = getDirection(i1);
	                p_149727_2_ += field_149981_a[k1][0];
	                p_149727_4_ += field_149981_a[k1][1];

	                if (p_149727_1_.getBlock(p_149727_2_, p_149727_3_, p_149727_4_) == this)
	                {
	                    p_149727_1_.setBlockToAir(p_149727_2_, p_149727_3_, p_149727_4_);
	                    d2 = (d2 + (double)p_149727_2_ + 0.5D) / 2.0D;
	                    d0 = (d0 + (double)p_149727_3_ + 0.5D) / 2.0D;
	                    d1 = (d1 + (double)p_149727_4_ + 0.5D) / 2.0D;
	                }

	                p_149727_1_.newExplosion((Entity)null, (double)((float)p_149727_2_ + 0.5F), (double)((float)p_149727_3_ + 0.5F), (double)((float)p_149727_4_ + 0.5F), 5.0F, true, true);
	                return true;
	            }
	        }
	    }

	    /**
	     * The type of render function that is called for this block
	     */
	    public int getRenderType()
	    {
	        return 14;
	    }

	    /**
	     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	     */
	    public boolean renderAsNormalBlock()
	    {
	        return false;
	    }

	    /**
	     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
	     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	     */
	    public boolean isOpaqueCube()
	    {
	        return false;
	    }

	    /**
	     * Updates the blocks bounds based on its current state. Args: world, x, y, z
	     */
	    public void setBlockBoundsBasedOnState(IBlockAccess p_149719_1_, int p_149719_2_, int p_149719_3_, int p_149719_4_)
	    {
	        this.func_149978_e();
	    }

	    /**
	     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
	     * their own) Args: x, y, z, neighbor Block
	     */
	    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
	    {
	        int l = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);
	        int i1 = getDirection(l);

	        if (isBlockHeadOfBed(l))
	        {
	            if (p_149695_1_.getBlock(p_149695_2_ - field_149981_a[i1][0], p_149695_3_, p_149695_4_ - field_149981_a[i1][1]) != this)
	            {
	                p_149695_1_.setBlockToAir(p_149695_2_, p_149695_3_, p_149695_4_);
	            }
	        }
	        else if (p_149695_1_.getBlock(p_149695_2_ + field_149981_a[i1][0], p_149695_3_, p_149695_4_ + field_149981_a[i1][1]) != this)
	        {
	            p_149695_1_.setBlockToAir(p_149695_2_, p_149695_3_, p_149695_4_);

	            if (!p_149695_1_.isRemote)
	            {
	                this.dropBlockAsItem(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, l, 0);
	            }
	        }
	    }


	    /**
	     * Returns whether or not this bed block is the head of the bed.
	     */
	    public static boolean isBlockHeadOfBed(int p_149975_0_)
	    {
	        return (p_149975_0_ & 8) != 0;
	    }

	    public static boolean func_149976_c(int p_149976_0_)
	    {
	        return (p_149976_0_ & 4) != 0;
	    }

	    public static void func_149979_a(World p_149979_0_, int p_149979_1_, int p_149979_2_, int p_149979_3_, boolean p_149979_4_)
	    {
	        int l = p_149979_0_.getBlockMetadata(p_149979_1_, p_149979_2_, p_149979_3_);

	        if (p_149979_4_)
	        {
	            l |= 4;
	        }
	        else
	        {
	            l &= -5;
	        }

	        p_149979_0_.setBlockMetadataWithNotify(p_149979_1_, p_149979_2_, p_149979_3_, l, 4);
	    }

	    public static ChunkCoordinates func_149977_a(World p_149977_0_, int p_149977_1_, int p_149977_2_, int p_149977_3_, int p_149977_4_)
	    {
	        int i1 = p_149977_0_.getBlockMetadata(p_149977_1_, p_149977_2_, p_149977_3_);
	        int j1 = BlockDirectional.getDirection(i1);

	        for (int k1 = 0; k1 <= 1; ++k1)
	        {
	            int l1 = p_149977_1_ - field_149981_a[j1][0] * k1 - 1;
	            int i2 = p_149977_3_ - field_149981_a[j1][1] * k1 - 1;
	            int j2 = l1 + 2;
	            int k2 = i2 + 2;

	            for (int l2 = l1; l2 <= j2; ++l2)
	            {
	                for (int i3 = i2; i3 <= k2; ++i3)
	                {
	                    if (World.doesBlockHaveSolidTopSurface(p_149977_0_, l2, p_149977_2_ - 1, i3) && !p_149977_0_.getBlock(l2, p_149977_2_, i3).getMaterial().isOpaque() && !p_149977_0_.getBlock(l2, p_149977_2_ + 1, i3).getMaterial().isOpaque())
	                    {
	                        if (p_149977_4_ <= 0)
	                        {
	                            return new ChunkCoordinates(l2, p_149977_2_, i3);
	                        }

	                        --p_149977_4_;
	                    }
	                }
	            }
	        }

	        return null;
	    }

	    /**
	     * Drops the block items with a specified chance of dropping the specified items
	     */
	    public void dropBlockAsItemWithChance(World p_149690_1_, int p_149690_2_, int p_149690_3_, int p_149690_4_, int p_149690_5_, float p_149690_6_, int p_149690_7_)
	    {
	        if (!isBlockHeadOfBed(p_149690_5_))
	        {
	            super.dropBlockAsItemWithChance(p_149690_1_, p_149690_2_, p_149690_3_, p_149690_4_, p_149690_5_, p_149690_6_, 0);
	        }
	    }

	    /**
	     * Returns the mobility information of the block, 0 = free, 1 = can't push but can move over, 2 = total immobility
	     * and stop pistons
	     */
	    public int getMobilityFlag()
	    {
	        return 1;
	    }

	    /**
	     * Gets an item for the block being called on. Args: world, x, y, z
	     */
	    @SideOnly(Side.CLIENT)
	    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
	    {
	        return ItemRegistry.itemColoredBed;
	    }

	    /**
	     * Called when the block is attempted to be harvested
	     */
	    public void onBlockHarvested(World p_149681_1_, int p_149681_2_, int p_149681_3_, int p_149681_4_, int p_149681_5_, EntityPlayer p_149681_6_)
	    {
	        if (p_149681_6_.capabilities.isCreativeMode && isBlockHeadOfBed(p_149681_5_))
	        {
	            int i1 = getDirection(p_149681_5_);
	            p_149681_2_ -= field_149981_a[i1][0];
	            p_149681_4_ -= field_149981_a[i1][1];

	            if (p_149681_1_.getBlock(p_149681_2_, p_149681_3_, p_149681_4_) == this)
	            {
	                p_149681_1_.setBlockToAir(p_149681_2_, p_149681_3_, p_149681_4_);
	            }
	        }
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
	        return this == BlockRegistry.coloredBed;
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
//	            if (!occupied) {
//	                // Player woke up, collapse the stick shelter
//	                ((World) world).setBlockToAir(x, y, z);
//	                // TODO: quest generation
//	            }
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
