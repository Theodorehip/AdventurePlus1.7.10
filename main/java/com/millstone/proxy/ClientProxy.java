package com.millstone.proxy;

import net.minecraft.client.model.ModelBiped;

import com.millstone.entities.Scarecrow;
import com.millstone.entities.render.RenderScarecrow;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
		
		RenderingRegistry.registerEntityRenderingHandler(Scarecrow.class, new RenderScarecrow(new ModelBiped(), 0.5F));
	
		
	}	
	
	public void registerTileEntitySpecialRenderer() {
		
	}
	
}
