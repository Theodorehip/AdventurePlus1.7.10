package com.millstone.handler;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.item.Item;

import com.millstone.entities.EntityScarecrow;

public class ModifyingHandler {
	
	public static void removeTabs(Item item){
		
		item.setCreativeTab(null);
		
	}
	
	
	//Doesn't work yet... Need to investigate on this...
	public static void scarecrowScared(EntityCreature entity){
		
		entity.tasks.addTask(3, new EntityAIAvoidEntity(entity, EntityScarecrow.class, 6.0F, 1.0D, 1.2D));
	}
	

}
