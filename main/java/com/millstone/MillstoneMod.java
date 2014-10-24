//I assume you know how to organize things with packages

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

import com.millstone.blocks.CopperOre;
import com.millstone.blocks.CottonPlant;
import com.millstone.blocks.Cutter;
import com.millstone.blocks.Firerack;
import com.millstone.blocks.Millstone;
import com.millstone.blocks.NetherRubyOre;
import com.millstone.blocks.ObsidianBlock;
import com.millstone.blocks.RicePlant;
import com.millstone.blocks.SapphireOre;
import com.millstone.blocks.SilverOre;
import com.millstone.blocks.lantern;
import com.millstone.blocks.lavaBrick;
import com.millstone.crafting.CraftingHandler;
import com.millstone.crafting.RecipeRemover;
import com.millstone.creativetab.tabMillstone;
import com.millstone.creativetab.tabMillstoneArmor;
import com.millstone.entities.Scarecrow;
import com.millstone.handler.GuiHandler;
import com.millstone.handler.RemoveRecipes;
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
import com.millstone.proxy.CommonProxy;
import com.millstone.tileentity.TileEntityMillstone;
import com.millstone.tools.ObsidianAxe;
import com.millstone.tools.ObsidianHoe;
import com.millstone.tools.ObsidianPickaxe;
import com.millstone.tools.ObsidianShovel;
import com.millstone.tools.ObsidianSword;
import com.millstone.worldgen.MillstoneModWorldGen;
import com.millstone.armor.ObsidianArmor;
<<<<<<< HEAD
=======
import com.millstone.armor.RubyArmor;
import com.millstone.armor.SapphireArmor;
import com.millstone.creativetab.tabMillstoneTools;
>>>>>>> origin/master

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

//Just putting it out there, I am very organized with my main class file. Hopefully it might help you get around also. ~Muggles

//ModID Stuffs
@Mod(modid = MillstoneMod.MODID, version = MillstoneMod.VERSION)
public class MillstoneMod
{
	//ID's and etc
	public static final String MODID = "millstonemod";
	public static final String VERSION = "0.0.3";

<<<<<<< HEAD
=======
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
	
	public static Block lantern = new lantern(Material.glass).setHardness(0.3F).setLightLevel(1.0F).setBlockName("lantern").setBlockTextureName("lantern");
	
	public static Block lavaBrick  = new lavaBrick(Material.rock).setBlockName("lavaBrick").setBlockTextureName(MODID + ":" + "lavaBrick");
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
>>>>>>> origin/master
	public static int armorObsidianHelmID;
	public static int armorObsidianChestID;
	public static int armorObsidianLegsID;
	public static int armorObsidianBootsID;

	//Whenever making a new GUI, do this same thing but put a number higher than the previous ID.
	public static final int guiIDMillstone = 1;
	public static final int guiIDCutter = 2;

	@Instance(MODID)
	public static MillstoneMod instance;

	public static CreativeTabs tabMillstone = new tabMillstone(CreativeTabs.getNextID(), "tabMillstone");

	@SidedProxy(clientSide = "com.millstone.proxy.ClientProxy", serverSide = "com.millstone.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	MillstoneModWorldGen eventWorldGen = new MillstoneModWorldGen();

	@EventHandler
	public void preinit(FMLInitializationEvent event)
	{  
		MillstoneMaterials.addMaterials();
		
		MillstoneItems.registerItems();
		MillstoneBlocks.registerBlocks();
		
		registerEntity(Scarecrow.class, "Scarecrow");
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{   	
		//Game Registry

		MillstoneItems.addItems();
		MillstoneBlocks.addBlocks();
		
		RecipeRemover.removeListedRecipes();
		MillstoneCrafting.addCraftingRecipes();
		
		//Spawn ores
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);

		//Tile Entity Registry
		GameRegistry.registerTileEntity(TileEntityMillstone.class, "tileEntityMillstone");

		//Register your GUI handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		FMLCommonHandler.instance().bus().register(new CraftingHandler());

		//Seeds
		MinecraftForge.addGrassSeed(new ItemStack(MillstoneItems.cottonSeeds), 1);

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
