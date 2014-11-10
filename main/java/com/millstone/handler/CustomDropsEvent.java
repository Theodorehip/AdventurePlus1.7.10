package com.millstone.handler;

import java.util.Random;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;

import com.millstone.registry.ItemRegistry;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CustomDropsEvent {

public static double rand;
public Random r = new Random();

@SubscribeEvent
public void onEntityDrop(LivingDropsEvent event)
{
	
	if(event.entityLiving instanceof EntitySkeleton){
		
		event.drops.clear(); //Clears all the drops of the entity   DON'T FORGET TO DO THIS! ALWAYS PUT IT, EVEN FOR RARE DROPS!
		event.entityLiving.dropItem(Items.bone, r.nextInt(2));
		event.entityLiving.dropItem(ItemRegistry.rottenArrow, r.nextInt(2));
		
	}
	
	
	}

	/*
	 * Here is the "Rare Drops put them under this if statement"
	 */
	

} 
