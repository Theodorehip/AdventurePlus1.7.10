package com.millstone.tileentity;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class TileEntityWoolStairs extends TileEntity {

	private int facing;
	
	public void onPlaced(World world, int x, int y, int z, EntityPlayer player) 
	{
		
		
		
	}
	
	@Override
	public void writeToNBT(NBTTagCompound nbt)
	{
		
		super.writeToNBT(nbt);
		
	}
	
	@Override
	public void readFromNBT(NBTTagCompound nbt)
	{
		
		super.readFromNBT(nbt);
		
	}
	
}
