package com.millstone.enchantments;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.util.DamageSource;

public class Piercing extends Enchantment{
	
	public Piercing(int id, int rarity){
		super(id, rarity, EnumEnchantmentType.weapon);
		this.setName("Piercing");
		
	}
	
	public int getMinEnchantability(int par1){
		return 5 + (par1 - 1)* 10;
	}
	
	public int getMaximumEnchantability(int par1){
		return this.getMinEnchantability(par1) + 20;
	}
	
	public int getMaxLevel(){
		return 3;
	}
	

}
