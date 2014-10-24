package com.millstone;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;

import com.millstone.armor.ObsidianArmor;
import com.millstone.items.CopperDust;
import com.millstone.items.CopperIngot;
import com.millstone.items.Cotton;
import com.millstone.items.Flour;
import com.millstone.items.GoldDust;
import com.millstone.items.IronDust;
import com.millstone.items.IronRod;
import com.millstone.items.ObsidianDust;
import com.millstone.items.Ruby;
import com.millstone.items.Sapphire;
import com.millstone.items.SilverDust;
import com.millstone.items.SilverIngot;
import com.millstone.items.StoneDust;
import com.millstone.items.riceBowl;
import com.millstone.items.ricePaper;
import com.millstone.items.sushi;
import com.millstone.tools.ObsidianAxe;
import com.millstone.tools.ObsidianHoe;
import com.millstone.tools.ObsidianPickaxe;
import com.millstone.tools.ObsidianShovel;
import com.millstone.tools.ObsidianSword;

import cpw.mods.fml.common.registry.GameRegistry;

public class MillstoneItems {


	//Gears
	public static Item woodGear;
	public static Item stoneGear;
	public static Item ironGear;
	public static Item goldGear;
	public static Item diamondGear;

	//Tools
	public static Item obsidianSword;
	public static Item obsidianPickaxe;
	public static Item obsidianShovel;
	public static Item obsidianAxe;
	public static Item obsidianHoe;

	//Armour
	public static Item armorObsidianHelm;
	public static Item armorObsidianChest;
	public static Item armorObsidianLegs;
	public static Item armorObsidianBoots;

	//Items
	public static Item stoneDust;
	public static Item goldDust;
	public static Item ironDust;
	public static Item obsidianDust;
	public static Item copperDust;
	public static Item copperIngot;
	public static Item ruby;
	public static Item sapphire;
	public static Item silverDust;
	public static Item silverIngot;
	public static Item ironRod;

	public static Item flour;
	public static Item ricePaper;

	//Crop Items
	public static Item cottonSeeds;
	public static Item cotton;
	public static Item riceCrop;

	//Food
	public static ItemFood riceBowl = new riceBowl(3, 0.4F, false);
	public static ItemFood sushi = new sushi(6, 0.7F, false);

	public static void registerItems(){
		woodGear = new com.millstone.items.ItemGear().setMaxDamage(500).setTextureName(MillstoneMod.MODID + ":" + "woodGear").setUnlocalizedName("woodGear");
		stoneGear = new com.millstone.items.ItemGear().setMaxDamage(1320).setTextureName(MillstoneMod.MODID + ":" + "stoneGear").setUnlocalizedName("stoneGear");
		ironGear = new com.millstone.items.ItemGear().setMaxDamage(2500).setTextureName(MillstoneMod.MODID + ":" + "ironGear").setUnlocalizedName("ironGear");
		goldGear = new com.millstone.items.ItemGear().setMaxDamage(240).setTextureName(MillstoneMod.MODID + ":" + "goldGear").setUnlocalizedName("goldGear");
		diamondGear = new com.millstone.items.ItemGear().setMaxDamage(15612).setTextureName(MillstoneMod.MODID + ":" + "diamondGear").setUnlocalizedName("diamondGear");

		//Tools
		obsidianSword = new ObsidianSword(MillstoneMaterials.ObsidianMaterial).setUnlocalizedName("obsidianSword");
		obsidianPickaxe = new ObsidianPickaxe(MillstoneMaterials.ObsidianMaterial).setUnlocalizedName("obsidianPickaxe");
		obsidianShovel = new ObsidianShovel(MillstoneMaterials.ObsidianMaterial).setUnlocalizedName("obsidianShovel");
		obsidianAxe = new ObsidianAxe(MillstoneMaterials.ObsidianMaterial).setUnlocalizedName("obsidianAxe");
		obsidianHoe = new ObsidianHoe(MillstoneMaterials.ObsidianMaterial).setUnlocalizedName("obsidianHoe");

		armorObsidianHelm = new ObsidianArmor(MillstoneMaterials.ObsidianArmorMaterial, MillstoneMod.armorObsidianHelmID, 0).setUnlocalizedName("ObsidianHelm");
		armorObsidianChest = new ObsidianArmor(MillstoneMaterials.ObsidianArmorMaterial, MillstoneMod.armorObsidianChestID, 1).setUnlocalizedName("ObsidianChest");
		armorObsidianLegs = new ObsidianArmor(MillstoneMaterials.ObsidianArmorMaterial, MillstoneMod.armorObsidianLegsID, 2).setUnlocalizedName("ObsidianLegs");
		armorObsidianBoots = new ObsidianArmor(MillstoneMaterials.ObsidianArmorMaterial, MillstoneMod.armorObsidianBootsID, 3).setUnlocalizedName("ObsidianBoots");

		stoneDust = new StoneDust();
		goldDust = new GoldDust();
		ironDust = new IronDust();
		obsidianDust = new ObsidianDust();
		copperDust = new CopperDust();
		copperIngot = new CopperIngot();
		ruby = new Ruby();
		sapphire = new Sapphire();
		silverDust = new SilverDust();
		silverIngot = new SilverIngot();
		ironRod = new IronRod();

		flour = new Flour();
		ricePaper = new ricePaper();

		//
		riceBowl = new riceBowl(3, 0.4F, false);
		sushi = new sushi(6, 0.7F, false);

		cottonSeeds = new ItemSeeds(MillstoneBlocks.cottonPlant, Blocks.farmland).setUnlocalizedName("cottonSeeds").setTextureName(MillstoneMod.MODID + ":cottonSeeds").setCreativeTab(MillstoneMod.tabMillstone);
		cotton = new Cotton();
		riceCrop = new ItemSeeds(MillstoneBlocks.ricePlant, Blocks.farmland).setUnlocalizedName("riceCrop").setTextureName(MillstoneMod.MODID + ":riceCrop");

	}

	public static void addItems(){
		//Gears
		GameRegistry.registerItem(woodGear, "woodGear");
		GameRegistry.registerItem(stoneGear, "stoneGear");	
		GameRegistry.registerItem(ironGear, "ironGear");
		GameRegistry.registerItem(goldGear, "goldGear");
		GameRegistry.registerItem(diamondGear, "diamondGear");

		//Tools
		GameRegistry.registerItem(obsidianSword, "obsidianSword");
		GameRegistry.registerItem(obsidianHoe, "obsidianHoe");
		GameRegistry.registerItem(obsidianAxe, "obsidianAxe");
		GameRegistry.registerItem(obsidianPickaxe, "obsidianPickaxe");
		GameRegistry.registerItem(obsidianShovel, "obsidianShovel");

		//Armors
		GameRegistry.registerItem(armorObsidianHelm, "ObsidianHelm");	
		GameRegistry.registerItem(armorObsidianChest, "Obsidianchest");
		GameRegistry.registerItem(armorObsidianLegs, "ObsidianLegs");
		GameRegistry.registerItem(armorObsidianBoots, "ObsidianBoots");

		//OreItems
		GameRegistry.registerItem(copperIngot, "copperBar");
		GameRegistry.registerItem(silverIngot, "silverBar");
		GameRegistry.registerItem(sapphire, "sapphire");
		GameRegistry.registerItem(ruby, "ruby");

		//Dusts
		GameRegistry.registerItem(silverDust, "silverDust");
		GameRegistry.registerItem(copperDust, "copperDust");
		GameRegistry.registerItem(stoneDust, "stoneDust");
		GameRegistry.registerItem(obsidianDust, "obsidianDust");
		GameRegistry.registerItem(goldDust, "goldDust");
		GameRegistry.registerItem(ironDust, "ironDust");

		//Misc
		GameRegistry.registerItem(ironRod, "ironRod");
		GameRegistry.registerItem(riceBowl, "riceBowl");
		GameRegistry.registerItem(sushi, "sushi");
		GameRegistry.registerItem(ricePaper, "ricePaper");
		GameRegistry.registerItem(flour, "flour");
	}

}
