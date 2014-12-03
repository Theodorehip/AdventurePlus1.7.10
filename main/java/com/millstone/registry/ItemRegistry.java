package com.millstone.registry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraftforge.common.util.EnumHelper;

import com.millstone.MillstoneMod;
import com.millstone.armor.CopperArmor;
import com.millstone.armor.EmeraldArmor;
import com.millstone.armor.ObsidianArmor;
import com.millstone.armor.RubyArmor;
import com.millstone.armor.SapphireArmor;
import com.millstone.blocks.BlockColoredBed;
import com.millstone.blocks.ItemColoredBed;
import com.millstone.blocks.crops.CottonPlant;
import com.millstone.blocks.crops.FlaxPlant;
import com.millstone.blocks.crops.RicePlant;
import com.millstone.blocks.crops.TomatoPlant;
import com.millstone.items.BoneShard;
import com.millstone.items.CopperDust;
import com.millstone.items.CopperIngot;
import com.millstone.items.Cotton;
import com.millstone.items.Flax;
import com.millstone.items.Flour;
import com.millstone.items.GoldDust;
import com.millstone.items.IronDust;
import com.millstone.items.IronNugget;
import com.millstone.items.IronRod;
import com.millstone.items.ItemGrenade;
import com.millstone.items.LeatherStrip;
import com.millstone.items.ObsidianDust;
import com.millstone.items.RiceBowl;
import com.millstone.items.RicePaper;
import com.millstone.items.Ruby;
import com.millstone.items.Sapphire;
import com.millstone.items.SilverDust;
import com.millstone.items.SilverIngot;
import com.millstone.items.StoneDust;
import com.millstone.items.Tomato;
import com.millstone.items.rottenArrow;
import com.millstone.items.sushi;
import com.millstone.lib.References;
import com.millstone.tools.BonePickaxe;
import com.millstone.tools.CopperAxe;
import com.millstone.tools.CopperHoe;
import com.millstone.tools.CopperPickaxe;
import com.millstone.tools.CopperShovel;
import com.millstone.tools.EmeraldAxe;
import com.millstone.tools.EmeraldHoe;
import com.millstone.tools.EmeraldPickaxe;
import com.millstone.tools.EmeraldShovel;
import com.millstone.tools.EmeraldSword;
import com.millstone.tools.FlintHatchet;
import com.millstone.tools.FlintKnife;
import com.millstone.tools.IronAxe;
import com.millstone.tools.IronHoe;
import com.millstone.tools.IronPickaxe;
import com.millstone.tools.IronShovel;
import com.millstone.tools.IronSword;
import com.millstone.tools.ObsidianAxe;
import com.millstone.tools.ObsidianHoe;
import com.millstone.tools.ObsidianPickaxe;
import com.millstone.tools.ObsidianShovel;
import com.millstone.tools.ObsidianSword;
import com.millstone.tools.RubyAxe;
import com.millstone.tools.RubyHoe;
import com.millstone.tools.RubyPickaxe;
import com.millstone.tools.RubyShovel;
import com.millstone.tools.RubySword;
import com.millstone.tools.SapphireAxe;
import com.millstone.tools.SapphireHoe;
import com.millstone.tools.SapphirePickaxe;
import com.millstone.tools.SapphireShovel;
import com.millstone.tools.SapphireSword;

import cpw.mods.fml.common.registry.GameRegistry;


public class ItemRegistry{
	//Tool/Armor Materials
	public static ToolMaterial Tier0 = EnumHelper.addToolMaterial("Tier0" , 0, 60, 2.0F, 0.0F, 15);
	public static ToolMaterial CustomIron = EnumHelper.addToolMaterial("CustomIron" , 2, 480, 6.0F, 2.0F, 14);
	public static ToolMaterial CopperMaterial = EnumHelper.addToolMaterial("CopperMaterial" , 1, 251, 4.0F, 1.0F, 5);
	public static ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("RubyMaterial" , 3 , 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial SapphireMaterial = EnumHelper.addToolMaterial("SapphireMaterial" , 3 , 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial EmeraldMaterial = EnumHelper.addToolMaterial("EmeraldMaterial" , 3 , 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial ObsidianMaterial = EnumHelper.addToolMaterial("ObsidianMaterial" , 3 , 2000, 13.0F, 4.0F, 10);
	
	public static ArmorMaterial CopperArmorMaterial = EnumHelper.addArmorMaterial("CopperArmor", 13, new int[]{2, 5, 4, 1}, 12);
	public static ArmorMaterial RubyArmorMaterial = EnumHelper.addArmorMaterial("RubyArmor", 33, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial SapphireArmorMaterial = EnumHelper.addArmorMaterial("SapphireArmor", 33, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial EmeraldArmorMaterial = EnumHelper.addArmorMaterial("EmeraldArmor", 33, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial ObsidianArmorMaterial = EnumHelper.addArmorMaterial("ObsidianArmor", 42, new int[]{4, 10, 4, 2}, 20);

	//Tools
	public static Item bonePickaxe = new BonePickaxe(Tier0).setUnlocalizedName("bonePickaxe");
	public static Item flintKnife = new FlintKnife(Tier0).setUnlocalizedName("flintKnife");
	public static Item flintHatchet = new FlintHatchet(Tier0).setUnlocalizedName("flintHatchet");
	
	public static Item ironPickaxe = new IronPickaxe(CustomIron).setUnlocalizedName("ironPickaxe");
	public static Item ironShovel = new IronShovel(CustomIron).setUnlocalizedName("ironShovel");
	public static Item ironAxe = new IronAxe(CustomIron).setUnlocalizedName("ironAxe");
	public static Item ironHoe = new IronHoe(CustomIron).setUnlocalizedName("ironHoe");
	public static Item ironSword = new IronSword(CustomIron).setUnlocalizedName("ironSword");
	
	public static Item copperPickaxe = new CopperPickaxe(CopperMaterial).setUnlocalizedName("copperPickaxe");
	public static Item copperShovel = new CopperShovel(CopperMaterial).setUnlocalizedName("copperShovel");
	public static Item copperAxe = new CopperAxe(CopperMaterial).setUnlocalizedName("copperAxe");
	public static Item copperHoe = new CopperHoe(CopperMaterial).setUnlocalizedName("copperHoe");
	//public static Item copperSword = new CopperSword(CopperMaterial).setUnlocalizedName("copperSword");	
	
	public static Item rubyPickaxe = new RubyPickaxe(RubyMaterial).setUnlocalizedName("rubyPickaxe");
	public static Item rubyShovel = new RubyShovel(RubyMaterial).setUnlocalizedName("rubyShovel");
	public static Item rubyAxe = new RubyAxe(RubyMaterial).setUnlocalizedName("rubyAxe");
	public static Item rubyHoe = new RubyHoe(RubyMaterial).setUnlocalizedName("rubyHoe");
	public static Item rubySword = new RubySword(RubyMaterial).setUnlocalizedName("rubySword");
	
	public static Item sapphirePickaxe = new SapphirePickaxe(SapphireMaterial).setUnlocalizedName("sapphirePickaxe");
	public static Item sapphireShovel = new SapphireShovel(SapphireMaterial).setUnlocalizedName("sapphireShovel");
	public static Item sapphireAxe = new SapphireAxe(SapphireMaterial).setUnlocalizedName("sapphireAxe");
	public static Item sapphireHoe = new SapphireHoe(SapphireMaterial).setUnlocalizedName("sapphireHoe");
	public static Item sapphireSword = new SapphireSword(SapphireMaterial).setUnlocalizedName("sapphireSword");	
	
	public static Item emeraldPickaxe = new EmeraldPickaxe(EmeraldMaterial).setUnlocalizedName("emeraldPickaxe");
	public static Item emeraldShovel = new EmeraldShovel(EmeraldMaterial).setUnlocalizedName("emeraldShovel");
	public static Item emeraldAxe = new EmeraldAxe(EmeraldMaterial).setUnlocalizedName("emeraldAxe");
	public static Item emeraldHoe = new EmeraldHoe(EmeraldMaterial).setUnlocalizedName("emeraldHoe");
	public static Item emeraldSword = new EmeraldSword(EmeraldMaterial).setUnlocalizedName("emeraldSword");	
	
	public static Item obsidianPickaxe = new ObsidianPickaxe(ObsidianMaterial).setUnlocalizedName("obsidianPickaxe");
	public static Item obsidianShovel = new ObsidianShovel(ObsidianMaterial).setUnlocalizedName("obsidianShovel");
	public static Item obsidianAxe = new ObsidianAxe(ObsidianMaterial).setUnlocalizedName("obsidianAxe");
	public static Item obsidianHoe = new ObsidianHoe(ObsidianMaterial).setUnlocalizedName("obsidianHoe");
	public static Item obsidianSword = new ObsidianSword(ObsidianMaterial).setUnlocalizedName("obsidianSword");
	
	//Armor
	public static int armorCopperHelmID;
	public static int armorCopperChestID;
	public static int armorCopperLegsID;
	public static int armorCopperBootsID;
		
	public static int armorRubyHelmID;
	public static int armorRubyChestID;
	public static int armorRubyLegsID;
	public static int armorRubyBootsID;
		
	public static int armorSapphireHelmID;
	public static int armorSapphireChestID;
	public static int armorSapphireLegsID;
	public static int armorSapphireBootsID;
	
	public static int armorEmeraldHelmID;
	public static int armorEmeraldChestID;
	public static int armorEmeraldLegsID;
	public static int armorEmeraldBootsID;
	
	public static int armorObsidianHelmID;
	public static int armorObsidianChestID;
	public static int armorObsidianLegsID;
	public static int armorObsidianBootsID;
	
	public static Item armorCopperHelm = new CopperArmor(CopperArmorMaterial, armorCopperHelmID, 0).setUnlocalizedName("CopperHelm");
	public static Item armorCopperChest = new CopperArmor(CopperArmorMaterial, armorCopperChestID, 1).setUnlocalizedName("CopperChest");
	public static Item armorCopperLegs = new CopperArmor(CopperArmorMaterial, armorCopperLegsID, 2).setUnlocalizedName("CopperLegs");
	public static Item armorCopperBoots = new CopperArmor(CopperArmorMaterial, armorCopperBootsID, 3).setUnlocalizedName("CopperBoots");

	public static Item armorRubyHelm = new RubyArmor(RubyArmorMaterial, armorRubyHelmID, 0).setUnlocalizedName("RubyHelm");
	public static Item armorRubyChest = new RubyArmor(RubyArmorMaterial, armorRubyChestID, 1).setUnlocalizedName("RubyChest");
	public static Item armorRubyLegs = new RubyArmor(RubyArmorMaterial, armorRubyLegsID, 2).setUnlocalizedName("RubyLegs");
	public static Item armorRubyBoots = new RubyArmor(RubyArmorMaterial, armorRubyBootsID, 3).setUnlocalizedName("RubyBoots");

	public static Item armorSapphireHelm = new SapphireArmor(SapphireArmorMaterial, armorSapphireHelmID, 0).setUnlocalizedName("SapphireHelm");
	public static Item armorSapphireChest = new SapphireArmor(SapphireArmorMaterial, armorSapphireChestID, 1).setUnlocalizedName("SapphireChest");
	public static Item armorSapphireLegs = new SapphireArmor(SapphireArmorMaterial, armorSapphireLegsID, 2).setUnlocalizedName("SapphireLegs");
	public static Item armorSapphireBoots = new SapphireArmor(SapphireArmorMaterial, armorSapphireBootsID, 3).setUnlocalizedName("SapphireBoots");

	public static Item armorEmeraldHelm = new EmeraldArmor(EmeraldArmorMaterial, armorEmeraldHelmID, 0).setUnlocalizedName("EmeraldHelm");
	public static Item armorEmeraldChest = new EmeraldArmor(EmeraldArmorMaterial, armorEmeraldChestID, 1).setUnlocalizedName("EmeraldChest");
	public static Item armorEmeraldLegs = new EmeraldArmor(EmeraldArmorMaterial, armorEmeraldLegsID, 2).setUnlocalizedName("EmeraldLegs");
	public static Item armorEmeraldBoots = new EmeraldArmor(EmeraldArmorMaterial, armorEmeraldBootsID, 3).setUnlocalizedName("EmeraldBoots");
	
	public static Item armorObsidianHelm = new ObsidianArmor(ObsidianArmorMaterial, armorObsidianHelmID, 0).setUnlocalizedName("ObsidianHelm");
	public static Item armorObsidianChest = new ObsidianArmor(ObsidianArmorMaterial, armorObsidianChestID, 1).setUnlocalizedName("ObsidianChest");
	public static Item armorObsidianLegs = new ObsidianArmor(ObsidianArmorMaterial, armorObsidianLegsID, 2).setUnlocalizedName("ObsidianLegs");
	public static Item armorObsidianBoots = new ObsidianArmor(ObsidianArmorMaterial, armorObsidianBootsID, 3).setUnlocalizedName("ObsidianBoots");
	
	//Items 
	public static Item stoneDust = new StoneDust();
	public static Item ironDust = new IronDust();
	public static Item copperDust = new CopperDust();
	public static Item silverDust = new SilverDust();
	public static Item goldDust = new GoldDust();
	public static Item obsidianDust = new ObsidianDust();
	
	public static Item copperIngot = new CopperIngot();
	public static Item ruby = new Ruby();
	public static Item sapphire = new Sapphire();
	public static Item silverIngot = new SilverIngot();
	public static Item ironRod = new IronRod();
	public static Item boneShard = new BoneShard();
	public static Item ironNugget = new IronNugget();
	
	public static Item leatherStrip = new LeatherStrip();
	public static Item grenade = new ItemGrenade();
	public static Item rottenArrow = new rottenArrow();
	
	//Gears
	public static Item woodGear = new com.millstone.items.ItemGear().setMaxDamage(500).setTextureName(References.MODID + ":" + "woodGear").setUnlocalizedName("woodGear");
	public static Item stoneGear = new com.millstone.items.ItemGear().setMaxDamage(1320).setTextureName(References.MODID + ":" + "stoneGear").setUnlocalizedName("stoneGear");
	public static Item ironGear = new com.millstone.items.ItemGear().setMaxDamage(2500).setTextureName(References.MODID + ":" + "ironGear").setUnlocalizedName("ironGear");
	public static Item goldGear = new com.millstone.items.ItemGear().setMaxDamage(240).setTextureName(References.MODID + ":" + "goldGear").setUnlocalizedName("goldGear");
	public static Item diamondGear = new com.millstone.items.ItemGear().setMaxDamage(15612).setTextureName(References.MODID + ":" + "diamondGear").setUnlocalizedName("diamondGear");

	//Food
	public static ItemFood riceBowl = new RiceBowl(3, 0.4F, false);
	public static ItemFood sushi = new sushi(6, 0.7F, false);
	
	//Crops
    public static Block tomatoPlant = new TomatoPlant().setBlockName("tomatoPlant");
    public static Item tomatoSeeds = new ItemSeeds(tomatoPlant, Blocks.farmland).setUnlocalizedName("tomatoSeeds").setTextureName(References.MODID + ":tomatoSeeds").setCreativeTab(MillstoneMod.tabMillstoneMaterials);
    public static Item tomato = new Tomato(2, 2, false);
	
    public static Block cottonPlant = new CottonPlant().setBlockName("cottonPlant");
    public static Item cottonSeeds = new ItemSeeds(cottonPlant, Blocks.farmland).setUnlocalizedName("cottonSeeds").setTextureName(References.MODID + ":cottonSeeds").setCreativeTab(MillstoneMod.tabMillstoneMaterials);
    public static Item cotton = new Cotton();
    
    public static Block flaxPlant = new FlaxPlant().setBlockName("flaxPlant");
    public static Item flaxSeeds = new ItemSeeds(flaxPlant, Blocks.farmland).setUnlocalizedName("flaxSeeds").setTextureName(References.MODID + ":flaxSeeds").setCreativeTab(MillstoneMod.tabMillstoneMaterials);
    public static Item flax = new Flax();
    
    public static Block ricePlant = new RicePlant().setBlockName("ricePlant");
    public static Item riceCrop = new ItemSeeds(ricePlant, Blocks.farmland).setUnlocalizedName("riceCrop").setTextureName(References.MODID + ":riceCrop").setCreativeTab(MillstoneMod.tabMillstoneFood);

	public static Item flour = new Flour();
	public static Item ricePaper = new RicePaper();
	
	
	public static Item coloredBed = new ItemColoredBed();
	 
		
	
	//GameRegistry
    public static void Register()
    {  
	//Tools
    
    GameRegistry.registerItem(bonePickaxe, "bonePickaxe");
    GameRegistry.registerItem(flintKnife, "flintKnife");
    GameRegistry.registerItem(flintHatchet, "flintAxe");
    
    GameRegistry.registerItem(ironSword, "ironSword");
    GameRegistry.registerItem(ironHoe, "ironHoe");
    GameRegistry.registerItem(ironAxe, "ironAxe");
    GameRegistry.registerItem(ironPickaxe, "ironPickaxe");
    GameRegistry.registerItem(ironShovel, "ironShovel");
    
  //GameRegistry.registerItem(copperSword, "copperSword");
  	GameRegistry.registerItem(copperHoe, "copperHoe");
  	GameRegistry.registerItem(copperAxe, "copperAxe");
  	GameRegistry.registerItem(copperPickaxe, "copperPickaxe");
  	GameRegistry.registerItem(copperShovel, "copperShovel");
  	
  	GameRegistry.registerItem(rubySword, "rubySword");
  	GameRegistry.registerItem(rubyHoe, "rubyHoe");
  	GameRegistry.registerItem(rubyAxe, "rubyAxe");
  	GameRegistry.registerItem(rubyPickaxe, "rubyPickaxe");
  	GameRegistry.registerItem(rubyShovel, "rubyShovel");
  	
  	GameRegistry.registerItem(sapphireSword, "sapphireSword");
  	GameRegistry.registerItem(sapphireHoe, "sapphireHoe");
  	GameRegistry.registerItem(sapphireAxe, "sapphireAxe");
  	GameRegistry.registerItem(sapphirePickaxe, "sapphirePickaxe");
  	GameRegistry.registerItem(sapphireShovel, "sapphireShovel");
	
	GameRegistry.registerItem(emeraldSword, "emeraldSword");
	GameRegistry.registerItem(emeraldHoe, "emeraldHoe");
	GameRegistry.registerItem(emeraldAxe, "emeraldAxe");
	GameRegistry.registerItem(emeraldPickaxe, "emeraldPickaxe");
	GameRegistry.registerItem(emeraldShovel, "emeraldShovel");
    	
	GameRegistry.registerItem(obsidianSword, "obsidianSword");
	GameRegistry.registerItem(obsidianHoe, "obsidianHoe");
	GameRegistry.registerItem(obsidianAxe, "obsidianAxe");
	GameRegistry.registerItem(obsidianPickaxe, "obsidianPickaxe");
	GameRegistry.registerItem(obsidianShovel, "obsidianShovel");


	
	//Armors
	
	GameRegistry.registerItem(armorCopperHelm, "CopperHelm");	
	GameRegistry.registerItem(armorCopperChest, "Copperchest");
	GameRegistry.registerItem(armorCopperLegs, "CopperLegs");
	GameRegistry.registerItem(armorCopperBoots, "CopperBoots");
	
	GameRegistry.registerItem(armorRubyHelm, "RubyHelm");	
	GameRegistry.registerItem(armorRubyChest, "Rubychest");
	GameRegistry.registerItem(armorRubyLegs, "RubyLegs");
	GameRegistry.registerItem(armorRubyBoots, "RubyBoots");
	
	GameRegistry.registerItem(armorSapphireHelm, "SapphireHelm");	
	GameRegistry.registerItem(armorSapphireChest, "Sapphirechest");
	GameRegistry.registerItem(armorSapphireLegs, "SapphireLegs");
	GameRegistry.registerItem(armorSapphireBoots, "SapphireBoots");
	
	GameRegistry.registerItem(armorEmeraldHelm, "EmeraldHelm");	
	GameRegistry.registerItem(armorEmeraldChest, "Emeraldchest");
	GameRegistry.registerItem(armorEmeraldLegs, "EmeraldLegs");
	GameRegistry.registerItem(armorEmeraldBoots, "EmeraldBoots");
	
	GameRegistry.registerItem(armorObsidianHelm, "ObsidianHelm");	
	GameRegistry.registerItem(armorObsidianChest, "Obsidianchest");
	GameRegistry.registerItem(armorObsidianLegs, "ObsidianLegs");
	GameRegistry.registerItem(armorObsidianBoots, "ObsidianBoots");
	

	
	//OreItems
	GameRegistry.registerItem(copperIngot, "copperBar");
	GameRegistry.registerItem(silverIngot, "silverBar");
	GameRegistry.registerItem(ruby, "ruby");
	GameRegistry.registerItem(sapphire, "sapphire");
	
	//Dusts
	GameRegistry.registerItem(stoneDust, "stoneDust");
	GameRegistry.registerItem(silverDust, "silverDust");
	GameRegistry.registerItem(copperDust, "copperDust");
	GameRegistry.registerItem(ironDust, "ironDust");
	GameRegistry.registerItem(goldDust, "goldDust");
	GameRegistry.registerItem(obsidianDust, "obsidianDust");

	
	//Misc
	GameRegistry.registerItem(ironRod, "ironRod");
	GameRegistry.registerItem(boneShard, "boneShard");
	GameRegistry.registerItem(ricePaper, "ricePaper");
	GameRegistry.registerItem(flour, "flour");
	GameRegistry.registerItem(rottenArrow, "rottenArrow");
	GameRegistry.registerItem(ironNugget, "ironNugget");
	GameRegistry.registerItem(leatherStrip, "leatherStrip");
	GameRegistry.registerItem(grenade, "grenade");
	GameRegistry.registerItem(coloredBed, "coloredBed");

		
	//Plants
	GameRegistry.registerBlock(ricePlant, "ricePlant");
	GameRegistry.registerBlock(tomatoPlant, "tomatoPlant");
	GameRegistry.registerBlock(cottonPlant, "cottonPlant");
	GameRegistry.registerBlock(flaxPlant, "flaxPlant");
	
	
	//Crops
	GameRegistry.registerItem(riceCrop, "riceCrop");
	GameRegistry.registerItem(cotton, "cotton");
	GameRegistry.registerItem(tomato, "tomato");
	GameRegistry.registerItem(flax, "flax");
	
	//Seeds
	GameRegistry.registerItem(tomatoSeeds, "tomatoSeeds");
	GameRegistry.registerItem(cottonSeeds, "cottonSeeds");
	GameRegistry.registerItem(flaxSeeds, "flaxSeeds");

	//food
	GameRegistry.registerItem(riceBowl, "riceBowl");
	GameRegistry.registerItem(sushi, "sushi");

	//Gears
	GameRegistry.registerItem(woodGear, "woodGear");
	GameRegistry.registerItem(stoneGear, "stoneGear");	
	GameRegistry.registerItem(ironGear, "ironGear");
	GameRegistry.registerItem(goldGear, "goldGear");
	GameRegistry.registerItem(diamondGear, "diamondGear");
	
	
		
	
	}
}