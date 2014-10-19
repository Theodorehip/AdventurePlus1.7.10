package com.millstone.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;

import com.millstone.MillstoneMod;

public class lavaBrick extends Block{
	
	public lavaBrick(Material material) {
		super(material);
		
		this.setHardness(3F);
		this.setResistance(30F);
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(MillstoneMod.tabMillstone);
	}
	
	public void onEntityWalking(World world, int x, int y, int z, Entity entity)
	{
	 if(entity instanceof EntityLivingBase)
	 {
	 entity.setFire(100);
	 }
	}
	

}
