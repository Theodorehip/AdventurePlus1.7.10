package com.millstone.items;

import com.millstone.MillstoneMod;
import com.millstone.entities.EntityGrenade;
import com.millstone.lib.References;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemGrenade extends Item {
	public ItemGrenade() {
		this.setUnlocalizedName("grenade"); // Sets the name of this item, Has
											// to be unique!
		this.setCreativeTab(MillstoneMod.tabMillstoneMisc);
		this.setTextureName(References.MODID + ":" + "grenade");
	}

	/**
	 * Called whenever this item is equipped and the right mouse button is
	 * pressed. Args: itemStack, world, entityPlayer
	 */
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer) {
		
		if (!par2World.isRemote) {
			/*
			 * This method in World spawn in an entity, You can use with
			 * anything that extends the Entity class, in this case it's the
			 * EntityGrenade class
			 */
			par2World.spawnEntityInWorld(new EntityGrenade(par2World, par3EntityPlayer));
			--par1ItemStack.stackSize;
		}
		return par1ItemStack;
	}

	/**
	 * Render Pass sensitive version of hasEffect()
	 */
	public boolean hasEffect(ItemStack par1ItemStack, int pass) {
		
		return true;
	}
}