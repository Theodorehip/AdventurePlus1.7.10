package com.millstone.handler;

import java.util.Random;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.world.BlockEvent;

import com.millstone.MillstoneMod;

import com.millstone.registry.ItemRegistry;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

public class CustomDropsEvent {

public static double rand;
public Random r = new Random();



@SubscribeEvent

public void onDrops(BlockEvent.HarvestDropsEvent event) {

if (event.block == Blocks.stone && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().getItem() == Items.wooden_pickaxe)
event.drops.add(new ItemStack(com.millstone.registry.ItemRegistry.Rock));
}

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
