package com.millstone.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

public class RiceBowl extends ItemFood{
	
	
	public RiceBowl(int hunger, float saturation, boolean isWolfFood) {
		super(hunger, saturation, isWolfFood);
		
		setUnlocalizedName("riceBowl");
		setCreativeTab(MillstoneMod.tabMillstoneFood);
		setTextureName(References.MODID + ":" + "bowlofrice");
		
	}
	
	public ItemStack onEaten(ItemStack p_77654_1_, World p_77654_2_, EntityPlayer p_77654_3_)
    {
        super.onEaten(p_77654_1_, p_77654_2_, p_77654_3_);
        return new ItemStack(Items.bowl);
    }

}
