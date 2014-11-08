package com.millstone.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Firerack extends Block{
	
	public Firerack(Material material) {
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
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(References.MODID + ":" + "Firerack");
		
	}
	
    public int quantityDropped(Random p_149745_1_)
    {
        return 0;
    }
    
    protected boolean canSilkHarvest()
    {
        return true;
    }
	

}
