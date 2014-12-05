package com.millstone.lib;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPig;

import com.millstone.entities.EntityBoar;
import com.millstone.entities.Scarecrow;
import com.millstone.entities.render.RenderBoar;
import com.millstone.entities.render.RenderScarecrow;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {

	public void registerRenderThings() {
		
		RenderingRegistry.registerEntityRenderingHandler(Scarecrow.class, new RenderScarecrow(new ModelBiped(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, new RenderBoar(new ModelPig(), 0.5F));

		
	}	
	
	public void registerTileEntitySpecialRenderer() {
		
	}
	
}
