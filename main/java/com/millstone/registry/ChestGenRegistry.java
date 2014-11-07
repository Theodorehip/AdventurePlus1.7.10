package com.millstone.registry;

import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;

public class ChestGenRegistry {
	
	
	public static void RegisterGeneration(){
		
		//testing generating random chest
		//needs spawnrate tweak
		
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianPickaxe, 0 , 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianAxe, 0 , 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianHoe, 0 , 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianSword, 0 , 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianShovel, 0 , 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.armorObsidianHelm, 0 , 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.armorObsidianChest, 0 , 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.armorObsidianLegs, 0 , 1, 1, 1));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.armorObsidianBoots, 0 , 1, 1, 1));
	}

}
