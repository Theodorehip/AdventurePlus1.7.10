package com.millstone.registry;

import net.minecraft.world.World;

import com.millstone.MillstoneMod;

import cpw.mods.fml.common.registry.GameRegistry;

public class TileEntityRegistry {
	
	public static void Register() {
		
		GameRegistry.registerTileEntity(com.millstone.tileentity.TileEntityWoolStairs.class, "tileEntityWoolStairs");
		
	}
	
}
