package com.millstone.items;

import java.util.*;

import com.millstone.MillstoneMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemGear extends Item{

	public ItemGear(){
		this.setCreativeTab(MillstoneMod.tabMillstoneMisc);
		this.setMaxStackSize(1);
		
	}
	
	 public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4){
		 par3List.add("Uses remaining : " + (1 + (par1ItemStack.getMaxDamage()/20) - this.getDamage(par1ItemStack)/20));
	 }
}