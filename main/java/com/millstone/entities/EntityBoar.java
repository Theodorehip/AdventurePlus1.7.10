package com.millstone.entities;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.millstone.lib.References;

public class EntityBoar extends EntityMob{

	public boolean agressive;
	
	public EntityBoar(World par1World) {
		
		
		
		super(par1World);
        
        this.setSize(0.9F, 0.9F);
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.25D));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot_on_a_stick, false));
        this.tasks.addTask(4, new EntityAITempt(this, 1.2D, Items.carrot, false));
        this.tasks.addTask(6, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
	}
	@Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    }
	
	public boolean isAIEnabled()
	{
		 return true;
	}
	
	/**
     * Drop 0-2 items of this living's type. @param par1 - Whether this entity has recently been hit by a player. @param
     * par2 - Level of Looting used to kill this mob.
     */
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_);

        for (int k = 0; k < j; ++k)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.cooked_porkchop, 1);
            }
            else
            {
                this.dropItem(Items.porkchop, 1);
            }
        }
    }

//	@Override
//	public EntityAgeable createChild(EntityAgeable var1) {
//		return new EntityBoar(this.worldObj);
//	}
	
    /**
     * Applies Fall Damages to the entity
     */
    protected void fall(float par1)
    {
        super.fall(par1);
    }
    
    public boolean isBreedingItem(ItemStack par1ItemStack)
    {
        return par1ItemStack != null && par1ItemStack.getItem() == Items.carrot;
    }
    
    protected void updateAITasks()
    {
        super.updateAITasks();
    }
    
    @Override
    protected String getHurtSound(){
    return References.MODID + ":" + "boar.hit";
    }
    
    @Override
    protected String getDeathSound(){
    return References.MODID + ":" + "boar.die";
    }
    
    @Override
    protected String getLivingSound(){
    return References.MODID + ":" + "boar.say";
    }
    
    
    public void isAgressive(){
    	
    	if(agressive == true){		
    		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
    	}
    	else if(agressive == false){
    		
    		this.tasks.addTask(9, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.2D, false));

    	}
    	
    }
    
}