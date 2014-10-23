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

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

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
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int metadata) {
		return this.blockIcon;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon(MillstoneMod.MODID + ":" + "Lavabrick");
		
	}
    
    /**protected boolean canSilkHarvest()
    {
        return true;
    }
	**/

}
