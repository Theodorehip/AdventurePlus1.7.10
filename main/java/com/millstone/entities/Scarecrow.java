package com.millstone.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Scarecrow extends EntityGolem
{
    /** deincrements, and a distance-to-home check is done at 0 */
    private static final String __OBFID = "CL_00001652";

    public Scarecrow(World p_i1694_1_)
    {
        super(p_i1694_1_);
        this.setSize(1.4F, 2.9F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(6, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Byte.valueOf((byte)0));
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }


    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(100.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.0D);
    }

    /**
     * Decrements the entity's air supply when underwater
     */
    protected int decreaseAirSupply(int p_70682_1_)
    {
        return p_70682_1_;
    }


    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    public void writeEntityToNBT(NBTTagCompound p_70014_1_)
    {
        super.writeEntityToNBT(p_70014_1_);
        p_70014_1_.setBoolean("PlayerCreated", this.isPlayerCreated());
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    public void readEntityFromNBT(NBTTagCompound p_70037_1_)
    {
        super.readEntityFromNBT(p_70037_1_);
        this.setPlayerCreated(p_70037_1_.getBoolean("PlayerCreated"));
    }


    @SideOnly(Side.CLIENT)
    public void handleHealthUpdate(byte p_70103_1_)
    {

            super.handleHealthUpdate(p_70103_1_);
    }


    /**
     * Returns the sound this mob makes when it is hurt.
     */
    //protected String getHurtSound()
    //{
     //   return "mob.irongolem.hit";
    //}

    /**
     * Returns the sound this mob makes on death.
     */
    //protected String getDeathSound()
    //{
    //    return "mob.irongolem.death";
    //}

    //protected void func_145780_a(int p_145780_1_, int p_145780_2_, int p_145780_3_, Block p_145780_4_)
    //{
    //    this.playSound("mob.irongolem.walk", 1.0F, 1.0F);
    //}

    /**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.func_145778_a(Item.getItemFromBlock(Blocks.pumpkin), 1, 0.0F);
        }

        k = 3 + this.rand.nextInt(3);

        for (int l = 0; l < k; ++l)
        {
            this.dropItem(Items.stick, 2);
        }
    }

    public boolean isPlayerCreated()
    {
        return (this.dataWatcher.getWatchableObjectByte(16) & 1) != 0;
    }

    public void setPlayerCreated(boolean p_70849_1_)
    {
        byte b0 = this.dataWatcher.getWatchableObjectByte(16);

        if (p_70849_1_)
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 | 1)));
        }
        else
        {
            this.dataWatcher.updateObject(16, Byte.valueOf((byte)(b0 & -2)));
        }
    }

}