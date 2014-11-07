package com.millstone.handler;

import java.util.Random;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CustomDropsEvent {

public static double rand;
public Random r = new Random();

@SubscribeEvent
public void onEntityDrop(LivingDropsEvent event)
{
	if(r.nextInt(100)<50){
	if(event.entityLiving instanceof EntitySkeleton) {
		event.drops.clear(); //Clears all the drops of the entity
		event.entityLiving.dropItem(Items.bone, r.nextInt(2)); //drop the new items
	}
	
	//Put the next if statement here to add drops for other entities
	
	}

} 
}