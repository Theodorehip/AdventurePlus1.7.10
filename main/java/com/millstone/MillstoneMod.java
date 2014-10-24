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
