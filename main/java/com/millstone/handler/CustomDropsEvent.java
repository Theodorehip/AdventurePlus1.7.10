package com.millstone.handler;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
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

		if (event.block == Blocks.stone && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().getItem() == ItemRegistry.bonePickaxe) {
			event.drops.clear();
			event.drops.add(new ItemStack(ItemRegistry.Rock));
		}

		if (event.block == Blocks.glass && event.harvester.getHeldItem() == null) {
			event.harvester.attackEntityFrom(DamageSource.generic, 2);

		}
		if ((event.block == Blocks.log || event.block == Blocks.log2) && event.harvester.getHeldItem() != null && ((event.harvester.getHeldItem().getItem() == ItemRegistry.sapphireAxe 
				|| event.harvester.getHeldItem().getItem() == ItemRegistry.copperAxe || event.harvester.getHeldItem().getItem() == ItemRegistry.emeraldAxe 
				|| event.harvester.getHeldItem().getItem() == ItemRegistry.obsidianAxe || event.harvester.getHeldItem().getItem() == ItemRegistry.rubyAxe 
				|| event.harvester.getHeldItem().getItem() == Items.wooden_axe || event.harvester.getHeldItem().getItem() == Items.stone_axe
				|| event.harvester.getHeldItem().getItem() == Items.diamond_axe || event.harvester.getHeldItem().getItem() == Items.golden_axe
				|| event.harvester.getHeldItem().getItem() == Items.iron_axe || event.harvester.getHeldItem().getItem() == ItemRegistry.copperAxe
				|| event.harvester.getHeldItem().getItem() == ItemRegistry.flintHatchet))) {
		
		}
		else if ((event.block == Blocks.log || event.block == Blocks.log2)) {

			event.drops.clear();

			if (event.harvester.getHeldItem() == null) {
				event.harvester.attackEntityFrom(DamageSource.generic, 1);
			}
		}
		
		if (event.block == Blocks.coal_ore && event.harvester.getHeldItem() != null && ((event.harvester.getHeldItem().getItem() == ItemRegistry.sapphirePickaxe
				|| event.harvester.getHeldItem().getItem() == ItemRegistry.copperPickaxe  || event.harvester.getHeldItem().getItem() == ItemRegistry.emeraldPickaxe 
				|| event.harvester.getHeldItem().getItem() == ItemRegistry.obsidianPickaxe  || event.harvester.getHeldItem().getItem() == ItemRegistry.rubyPickaxe 
				|| event.harvester.getHeldItem().getItem() == Items.stone_pickaxe || event.harvester.getHeldItem().getItem() == Items.diamond_pickaxe  
				|| event.harvester.getHeldItem().getItem() == Items.golden_pickaxe || event.harvester.getHeldItem().getItem() == Items.iron_pickaxe  
				|| event.harvester.getHeldItem().getItem() == ItemRegistry.copperPickaxe ))) {
		
		}
		else if ((event.block == Blocks.log || event.block == Blocks.log2)) {
			event.drops.clear();
			
		}

		if ((event.block == Blocks.leaves || event.block == Blocks.leaves2)) {

			if (r.nextInt(4) == 1) {
				event.drops.add(new ItemStack(Items.stick));
				event.drops.add(new ItemStack(Items.stick));
				event.drops.add(new ItemStack(Items.stick));
			}
		}

		if (event.block == Blocks.iron_ore && event.harvester.getHeldItem() != null && event.harvester.getHeldItem().getItem() == Items.stone_pickaxe) {
			event.drops.clear();
			for (int i = 0; i < 3 + r.nextInt(3); i++) {
				event.drops.add(new ItemStack(ItemRegistry.ironNugget));
			}

		}

	}
	
	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {

		if (event.entityLiving instanceof EntitySkeleton) {

			event.drops.clear(); // Clears all the drops of the entity
			event.entityLiving.dropItem(Items.bone, r.nextInt(3));
			event.entityLiving.dropItem(ItemRegistry.rottenArrow, r.nextInt(3));
			event.entityLiving.dropItem(Items.arrow, r.nextInt(2));
			event.entityLiving.dropItem(ItemRegistry.boneShard, r.nextInt(3));

		}

	}

}
