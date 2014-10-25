package com.millstone;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.millstone.armor.CopperArmor;
import com.millstone.armor.ObsidianArmor;
import com.millstone.armor.RubyArmor;
import com.millstone.armor.SapphireArmor;
import com.millstone.blocks.CopperOre;
import com.millstone.blocks.Cutter;
import com.millstone.blocks.Firerack;
import com.millstone.blocks.Lantern;
import com.millstone.blocks.LavaBrick;
import com.millstone.blocks.Millstone;
import com.millstone.blocks.NetherRubyOre;
import com.millstone.blocks.ObsidianBlock;
import com.millstone.blocks.SapphireOre;
import com.millstone.blocks.SilverOre;
import com.millstone.blocks.crops.CottonPlant;
import com.millstone.blocks.crops.FlaxPlant;
import com.millstone.blocks.crops.RicePlant;
import com.millstone.blocks.crops.TomatoPlant;
import com.millstone.crafting.CraftingHandler;
import com.millstone.creativetab.tabMillstone;
import com.millstone.creativetab.tabMillstoneArmor;
import com.millstone.creativetab.tabMillstoneTools;
import com.millstone.entities.Scarecrow;
import com.millstone.handler.GuiHandler;
import com.millstone.handler.RemoveRecipes;
import com.millstone.items.CopperDust;
import com.millstone.items.CopperIngot;
import com.millstone.items.Cotton;
import com.millstone.items.Flax;
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
import com.millstone.items.Tomato;
import com.millstone.items.riceBowl;
import com.millstone.items.ricePaper;
import com.millstone.items.sushi;
import com.millstone.proxy.CommonProxy;
import com.millstone.tileentity.TileEntityMillstone;
import com.millstone.tools.CopperAxe;
import com.millstone.tools.CopperHoe;
import com.millstone.tools.CopperPickaxe;
import com.millstone.tools.CopperShovel;
import com.millstone.tools.CopperSword;
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
import com.millstone.worldgen.MillstoneModWorldGen;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

//This Class is very organized, Please keep it that way.

//ModID Stuffs
@Mod(modid = MillstoneMod.MODID, version = MillstoneMod.VERSION)
public class MillstoneMod
{
	//ID's and etc
    public static final String MODID = "millstonemod";
    public static final String VERSION = "0.0.3";
   
    //Whenever making a new GUI, do this same thing but put a number higher than the previous ID.
    public static final int guiIDMillstone = 1;
    public static final int guiIDCutter = 2;

	@Instance(MODID)
	public static MillstoneMod instance;
	
	//Millstone CreativeTabs
	public static CreativeTabs tabMillstone = new tabMillstone(CreativeTabs.getNextID(), "tabMillstone");
	public static CreativeTabs tabMillstoneTools = new tabMillstoneTools(CreativeTabs.getNextID(), "tabMillstoneTools");
	public static CreativeTabs tabMillstoneArmor = new tabMillstoneArmor(CreativeTabs.getNextID(), "tabMillstoneArmor");
	
	//Proxy Stuff
	@SidedProxy(clientSide = "com.millstone.proxy.ClientProxy", serverSide = "com.millstone.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	
	//Tool/Armor Materials
	public static ToolMaterial ObsidianMaterial = EnumHelper.addToolMaterial("ObsidianMaterial" , 3 , 750, 13.0F, 4.0F, 10);
	public static ToolMaterial CopperMaterial = EnumHelper.addToolMaterial("CopperMaterial" , 2 , 210, 5.0F, 2.0F, 14);
	public static ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("RubyMaterial" , 3 , 1561, 8.0F, 3.0F, 10);
	public static ToolMaterial SapphireMaterial = EnumHelper.addToolMaterial("SapphireMaterial" , 3 , 1561, 8.0F, 3.0F, 10);

	public static ArmorMaterial ObsidianArmorMaterial = EnumHelper.addArmorMaterial("ObsidianArmor", 42, new int[]{4, 10, 4, 2}, 20);
	public static ArmorMaterial CopperArmorMaterial = EnumHelper.addArmorMaterial("CopperArmor", 13, new int[]{2, 5, 4, 1}, 10);
	public static ArmorMaterial RubyArmorMaterial = EnumHelper.addArmorMaterial("RubyArmor", 33, new int[]{3, 8, 6, 3}, 10);
	public static ArmorMaterial SapphireArmorMaterial = EnumHelper.addArmorMaterial("SapphireArmor", 33, new int[]{3, 8, 6, 3}, 10);
	
	//WorldGen
	MillstoneModWorldGen eventWorldGen = new MillstoneModWorldGen();
	
	
	//Create the millstone. You need the idle and active.
	public static Block millstoneIdle = new Millstone(false).setBlockName("millstoneIdle").setCreativeTab(tabMillstone).setHardness(5F);
	public static Block millstoneActive = new Millstone(true).setBlockName("millstoneActive").setHardness(5F);;
	public static Block stoneCutter = new Cutter().setBlockName("stoneCutter").setCreativeTab(tabMillstone).setHardness(5F);
	public static Block obsidianBlock = new ObsidianBlock(Material.rock).setBlockName("obsidianBlock");
	public static Block copperOre = new CopperOre(Material.rock).setBlockName("copperOre");
	public static Block netherRubyOre = new NetherRubyOre(Material.rock).setBlockName("netherRubyOre");
	public static Block sapphireOre = new SapphireOre(Material.rock).setBlockName("sapphireOre");
	public static Block silverOre = new SilverOre(Material.rock).setBlockName("silverOre");
	
	public static Block lantern = new Lantern(Material.glass).setHardness(0.3F).setLightLevel(1.0F).setBlockName("lantern").setBlockTextureName("lantern");
	
	public static Block lavaBrick  = new LavaBrick(Material.rock).setBlockName("lavaBrick").setBlockTextureName(MODID + ":" + "lavaBrick");
	public static Block Firerack  = new Firerack(Material.rock).setBlockName("Firerack").setBlockTextureName(MODID + ":" + "Firerack");

	
	public static Item woodGear = new com.millstone.items.ItemGear().setMaxDamage(500).setTextureName(MODID + ":" + "woodGear").setUnlocalizedName("woodGear");
	public static Item stoneGear = new com.millstone.items.ItemGear().setMaxDamage(1320).setTextureName(MODID + ":" + "stoneGear").setUnlocalizedName("stoneGear");
	public static Item ironGear = new com.millstone.items.ItemGear().setMaxDamage(2500).setTextureName(MODID + ":" + "ironGear").setUnlocalizedName("ironGear");
	public static Item goldGear = new com.millstone.items.ItemGear().setMaxDamage(240).setTextureName(MODID + ":" + "goldGear").setUnlocalizedName("goldGear");
	public static Item diamondGear = new com.millstone.items.ItemGear().setMaxDamage(15612).setTextureName(MODID + ":" + "diamondGear").setUnlocalizedName("diamondGear");
	

	//Tools
	public static Item obsidianPickaxe = new ObsidianPickaxe(ObsidianMaterial).setUnlocalizedName("obsidianPickaxe");
	public static Item obsidianShovel = new ObsidianShovel(ObsidianMaterial).setUnlocalizedName("obsidianShovel");
	public static Item obsidianAxe = new ObsidianAxe(ObsidianMaterial).setUnlocalizedName("obsidianAxe");
	public static Item obsidianHoe = new ObsidianHoe(ObsidianMaterial).setUnlocalizedName("obsidianHoe");
	public static Item obsidianSword = new ObsidianSword(ObsidianMaterial).setUnlocalizedName("obsidianSword");
	
	public static Item copperPickaxe = new CopperPickaxe(CopperMaterial).setUnlocalizedName("copperPickaxe");
	public static Item copperShovel = new CopperShovel(CopperMaterial).setUnlocalizedName("copperShovel");
	public static Item copperAxe = new CopperAxe(CopperMaterial).setUnlocalizedName("copperAxe");
	public static Item copperHoe = new CopperHoe(CopperMaterial).setUnlocalizedName("copperHoe");
	public static Item copperSword = new CopperSword(CopperMaterial).setUnlocalizedName("copperSword");	
	
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
	
	//Armor
	public static int armorObsidianHelmID;
	public static int armorObsidianChestID;
	public static int armorObsidianLegsID;
	public static int armorObsidianBootsID;
	
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

	public static Item armorObsidianHelm = new ObsidianArmor(ObsidianArmorMaterial, armorObsidianHelmID, 0).setUnlocalizedName("ObsidianHelm");
	public static Item armorObsidianChest = new ObsidianArmor(ObsidianArmorMaterial, armorObsidianChestID, 1).setUnlocalizedName("ObsidianChest");
	public static Item armorObsidianLegs = new ObsidianArmor(ObsidianArmorMaterial, armorObsidianLegsID, 2).setUnlocalizedName("ObsidianLegs");
	public static Item armorObsidianBoots = new ObsidianArmor(ObsidianArmorMaterial, armorObsidianBootsID, 3).setUnlocalizedName("ObsidianBoots");
	
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

	
	public static Item stoneDust = new StoneDust();
	public static Item goldDust = new GoldDust();
	public static Item ironDust = new IronDust();
	public static Item obsidianDust = new ObsidianDust();
	public static Item copperDust = new CopperDust();
	public static Item copperIngot = new CopperIngot();
	public static Item ruby = new Ruby();
	public static Item sapphire = new Sapphire();
	public static Item silverDust = new SilverDust();
	public static Item silverIngot = new SilverIngot();
	public static Item ironRod = new IronRod();

	public static Item flour = new Flour();
	public static Item ricePaper = new ricePaper();
	
	//Food
	public static ItemFood riceBowl = new riceBowl(3, 0.4F, false);
	public static ItemFood sushi = new sushi(6, 0.7F, false);
	
	
	//Crops
    public static Block tomatoPlant = new TomatoPlant().setBlockName("tomatoPlant");
    public static Item tomatoSeeds = new ItemSeeds(tomatoPlant, Blocks.farmland).setUnlocalizedName("tomatoSeeds").setTextureName(MODID + ":tomatoSeeds").setCreativeTab(MillstoneMod.tabMillstone);
    public static Item tomato = new Tomato(2, 2, false);
	
    public static Block cottonPlant = new CottonPlant().setBlockName("cottonPlant");
    public static Item cottonSeeds = new ItemSeeds(cottonPlant, Blocks.farmland).setUnlocalizedName("cottonSeeds").setTextureName(MODID + ":cottonSeeds").setCreativeTab(MillstoneMod.tabMillstone);
    public static Item cotton = new Cotton();
    
    public static Block flaxPlant = new FlaxPlant().setBlockName("flaxPlant");
    public static Item flaxSeeds = new ItemSeeds(flaxPlant, Blocks.farmland).setUnlocalizedName("flaxSeeds").setTextureName(MODID + ":flaxSeeds").setCreativeTab(MillstoneMod.tabMillstone);
    public static Item flax = new Flax();
    
    public static Block ricePlant = new RicePlant().setBlockName("ricePlant");
    public static Item riceCrop = new ItemSeeds(ricePlant, Blocks.farmland).setUnlocalizedName("riceCrop").setTextureName(MODID + ":riceCrop").setCreativeTab(MillstoneMod.tabMillstone);
	
    @EventHandler
    public void preinit(FMLInitializationEvent event)
    {  
    	registerEntity(Scarecrow.class, "Scarecrow");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {   	
    	//Game Registry
	
		//InteractiveBlocks
		GameRegistry.registerBlock(millstoneIdle, "millstoneIdle");
		GameRegistry.registerBlock(millstoneActive, "millstoneActive");
		GameRegistry.registerBlock(stoneCutter, "stoneCutter");
		
		//Ores
		GameRegistry.registerBlock(copperOre, "copperOre");
		GameRegistry.registerBlock(sapphireOre, "sapphireOre");
		GameRegistry.registerBlock(netherRubyOre, "netherRubyOre");
		GameRegistry.registerBlock(silverOre, "silverOre");
		
		//NonOreSpawningBlocks
		GameRegistry.registerBlock(lavaBrick, "lavaBrick");
		GameRegistry.registerBlock(Firerack, "Firerack");
		
		//Craftable
		GameRegistry.registerBlock(obsidianBlock, "obsidianBlock");
		GameRegistry.registerBlock(lantern, "lantern");
		
		//Plants
		GameRegistry.registerBlock(ricePlant, "ricePlant");
		GameRegistry.registerBlock(tomatoPlant, "tomatoPlant");
		GameRegistry.registerBlock(cottonPlant, "cottonPlant");
		GameRegistry.registerBlock(flaxPlant, "flaxPlant");

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
		
		GameRegistry.registerItem(copperSword, "copperSword");
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
		
		//Armors
		GameRegistry.registerItem(armorObsidianHelm, "ObsidianHelm");	
		GameRegistry.registerItem(armorObsidianChest, "Obsidianchest");
		GameRegistry.registerItem(armorObsidianLegs, "ObsidianLegs");
		GameRegistry.registerItem(armorObsidianBoots, "ObsidianBoots");
		
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
		
		//Crops
		GameRegistry.registerItem(riceCrop, "riceCrop");
		GameRegistry.registerItem(cotton, "cotton");
		GameRegistry.registerItem(tomato, "tomato");
		GameRegistry.registerItem(flax, "flax");
		
		//Seeds
		GameRegistry.registerItem(tomatoSeeds, "tomatoSeeds");
		GameRegistry.registerItem(cottonSeeds, "cottonSeeds");
		GameRegistry.registerItem(flaxSeeds, "flaxSeeds");

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
		
		//Spawn ores
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		
		//Remove Recipes
		RemoveRecipes.removeRecipes(Items.sugar);
		RemoveRecipes.removeRecipes(Items.cookie);
		RemoveRecipes.removeRecipes(Items.cake);
		RemoveRecipes.removeRecipes(Items.dye);
		RemoveRecipes.removeRecipes(Items.blaze_powder);
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.brick_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_slab));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_brick_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_pressure_plate));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_button));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.cobblestone_wall));

		//Experimenting with recipes
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.planks));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.acacia_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.sandstone_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.stone_brick_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.oak_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.birch_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.jungle_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.dark_oak_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.brick_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.spruce_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.quartz_stairs));
		RemoveRecipes.removeRecipes(Item.getItemFromBlock(Blocks.nether_brick_stairs));
		
		//Logs to Planks reduction
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 0), new Object[] {new ItemStack(Blocks.log, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 1), new Object[] {new ItemStack(Blocks.log, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 2), new Object[] {new ItemStack(Blocks.log, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 3), new Object[] {new ItemStack(Blocks.log, 1, 3)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 4), new Object[] {new ItemStack(Blocks.log2, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 2, 5), new Object[] {new ItemStack(Blocks.log2, 1, 1)});
        
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.oak_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 0)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.birch_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 2)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.spruce_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 1)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.jungle_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 3)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.acacia_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 4)});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.dark_oak_stairs, 8), new Object[] {"#  ", "## ", "###", '#', new ItemStack(Blocks.planks, 1, 5)});  
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.cobblestone});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.brick_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.brick_block});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.stone_brick_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.stonebrick});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.nether_brick_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.nether_brick});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.sandstone_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.sandstone});
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.quartz_stairs, 8), new Object[] {"#  ", "## ", "###", '#', Blocks.quartz_block});
		
        //Experimenting with recipes
		
		/**
		* Let me explain recipes. So the "stonegear, 1" in the itemstack is basically the item you want to create, and the 1 for
		*how many. Simple. Now, where you see the " S ", "S S", " S ", 'S', Blocks.stone" is where it gets trickier. Each "" represents
		*one row in the crafting grid. The first "" is the top row, second "" middle, third "" bottom. Now, you put any letter you want 
		*in there, such as S in the order you want to craft your recipe. If you want to leave a space blank, simply put a space there.
		*Make sure there is only 3 characters in each "" for the recipe to work. Now, the 'S', Blocks.stone part is basically defining what
		*the letter(s) you put in your recipe are. For example, its registering the S (caps are important) as the Stone. For a recipe with
		*multiple characters such as "SIS", "ISI", "SIS", you would do (after the 3 "" 's) 'S', Blocks.stone (or whatever you want to use), 
		*'I', Items.iron_ingot
		*Hopefully I didn't make this too confusing*/
			
		GameRegistry.addShapedRecipe(new ItemStack(millstoneIdle, 1), new Object[]{"SGS", "IXI", "BBB", 'S', Blocks.stone_slab, 'I', Items.iron_ingot, 'X', stoneCutter, 'G', Items.gold_ingot, 'B', Blocks.stonebrick});
		GameRegistry.addShapedRecipe(new ItemStack(stoneCutter, 1), new Object[]{"CCC", "CSC", "CCC", 'C', Blocks.cobblestone, 'S', stoneGear});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', obsidianDust});
		GameRegistry.addShapedRecipe(new ItemStack(Items.cake, 1), new Object[]{"MMM", "SES", "FFF", 'S', Items.sugar, 'M', Items.milk_bucket, 'E', Items.egg, 'F', flour});
		GameRegistry.addShapedRecipe(new ItemStack(Items.cookie, 8), new Object[]{"   ", "FCF", "   ",'F', flour, 'C', new ItemStack(Items.dye, 1, 3)});
		GameRegistry.addShapedRecipe(new ItemStack(Items.string, 1), new Object[]{"   ", "CCC", "   ", 'C', cotton});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1), new Object[]{"   ", "CC ", "CC ", 'C', cotton});
		
		GameRegistry.addShapedRecipe(new ItemStack(woodGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.stick, 'C', Blocks.planks});
		GameRegistry.addShapedRecipe(new ItemStack(stoneGear, 1), new Object[]{" S ", "SCS", " S ", 'C', Blocks.cobblestone, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ironGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.iron_ingot, 'C', stoneGear});
		GameRegistry.addShapedRecipe(new ItemStack(goldGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.gold_ingot, 'C', ironGear});
		GameRegistry.addShapedRecipe(new ItemStack(diamondGear, 1), new Object[]{" S ", "SCS", " S ", 'C', ironGear, 'S', Items.diamond});
		
		//Tools
		GameRegistry.addShapedRecipe(new ItemStack(obsidianSword, 1), new Object[]{" O ", " O ", " I ", 'I', ironRod, 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', ironRod, 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianAxe, 1), new Object[]{" OO", " IO", " I ", 'I', ironRod, 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianShovel, 1), new Object[]{" O ", " I ", " I ", 'I', ironRod, 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianHoe, 1), new Object[]{" OO", " I ", " I ", 'I', ironRod, 'O', obsidianBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(copperSword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', copperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(copperPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(copperAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', copperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(copperShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(copperHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
		
		GameRegistry.addShapedRecipe(new ItemStack(rubySword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', ruby});
		GameRegistry.addShapedRecipe(new ItemStack(rubyPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O', ruby});
		GameRegistry.addShapedRecipe(new ItemStack(rubyAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', ruby});
		GameRegistry.addShapedRecipe(new ItemStack(rubyShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', ruby});
		GameRegistry.addShapedRecipe(new ItemStack(rubyHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', ruby});
		
		GameRegistry.addShapedRecipe(new ItemStack(sapphireSword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', sapphire});
		GameRegistry.addShapedRecipe(new ItemStack(sapphirePickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O', sapphire});
		GameRegistry.addShapedRecipe(new ItemStack(sapphireAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', sapphire});
		GameRegistry.addShapedRecipe(new ItemStack(sapphireShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', sapphire});
		GameRegistry.addShapedRecipe(new ItemStack(sapphireHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', sapphire});
				
		//Armor
		GameRegistry.addShapedRecipe(new ItemStack(armorObsidianHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(armorObsidianChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(armorObsidianLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(armorObsidianBoots, 1), new Object[]{"   ", "O O", "O O", 'O', obsidianBlock});
		
		GameRegistry.addShapedRecipe(new ItemStack(armorCopperHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', copperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(armorCopperChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', copperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(armorCopperLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', copperIngot});
		GameRegistry.addShapedRecipe(new ItemStack(armorCopperBoots, 1), new Object[]{"   ", "O O", "O O", 'O', copperIngot});
		
		GameRegistry.addShapedRecipe(new ItemStack(armorRubyHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', ruby});
		GameRegistry.addShapedRecipe(new ItemStack(armorRubyChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', ruby});
		GameRegistry.addShapedRecipe(new ItemStack(armorRubyLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', ruby});
		GameRegistry.addShapedRecipe(new ItemStack(armorRubyBoots, 1), new Object[]{"   ", "O O", "O O", 'O', ruby});
		
		GameRegistry.addShapedRecipe(new ItemStack(armorSapphireHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', sapphire});
		GameRegistry.addShapedRecipe(new ItemStack(armorSapphireChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', sapphire});
		GameRegistry.addShapedRecipe(new ItemStack(armorSapphireLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', sapphire});
		GameRegistry.addShapedRecipe(new ItemStack(armorSapphireBoots, 1), new Object[]{"   ", "O O", "O O", 'O', sapphire});
		
        GameRegistry.addShapedRecipe(new ItemStack(riceBowl,1), new Object[] {"x", "y", 'x', riceCrop, 'y', Items.bowl});
        GameRegistry.addShapedRecipe(new ItemStack(lantern,1), new Object[] {"xxx", "xyx", "xxx", 'x', ricePaper, 'y', Blocks.torch});
        GameRegistry.addShapedRecipe(new ItemStack(ricePaper,1), new Object[] {"xxx", 'x', riceCrop});
        GameRegistry.addShapelessRecipe(new ItemStack(sushi,1), new Object[] {new ItemStack(riceCrop, 1), Items.fish});
		
		
		//making dyes craftable from other dyes, need this because i got rid of all dye recipes  //WIP
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 9), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 15)});
		GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 14), new Object[] {new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 10), new Object[] {new ItemStack(Items.dye, 1, 2), new ItemStack(Items.dye, 1, 15)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 8), new Object[] {new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 7), new Object[] {new ItemStack(Items.dye, 1, 8), new ItemStack(Items.dye, 1, 15)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 7), new Object[] {new ItemStack(Items.dye, 1, 0), new ItemStack(Items.dye, 1, 15), new ItemStack(Items.dye, 1, 15)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 12), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 15)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 6), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 2)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 5), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 13), new Object[] {new ItemStack(Items.dye, 1, 5), new ItemStack(Items.dye, 1, 9)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 13), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 9)});
	    GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 4, 13), new Object[] {new ItemStack(Items.dye, 1, 4), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 15)});
	    GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 2), new ItemStack(Blocks.cactus, 1), 0.35F);
			
		
		GameRegistry.addSmelting(new ItemStack(ironDust), new ItemStack(Items.iron_ingot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(goldDust), new ItemStack(Items.gold_ingot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(flour), new ItemStack(Items.bread, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(copperOre), new ItemStack(copperIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(copperDust), new ItemStack(copperIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(silverOre), new ItemStack(silverIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(silverDust), new ItemStack(silverIngot, 1), 0.35F);
		
		//Tile Entity Registry
		GameRegistry.registerTileEntity(TileEntityMillstone.class, "tileEntityMillstone");


    	//Register your GUI handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		MinecraftForge.addGrassSeed(new ItemStack(cottonSeeds), 1);
		
		
		//Register your renderer in your proxy.
		proxy.registerRenderThings();
		
    }  
    
    
    
    public static void registerEntity(Class entityClass, String name)
    {
    int entityID = EntityRegistry.findGlobalUniqueEntityId();
    long seed = name.hashCode();
    Random rand = new Random(seed);
    int primaryColor = rand.nextInt() * 16777215;
    int secondaryColor = rand.nextInt() * 16777215;

    EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
    EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
    EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));

    }

    
   
}
