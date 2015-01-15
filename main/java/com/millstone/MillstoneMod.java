package com.millstone;

import java.util.Random;

import net.minecraft.block.BlockStone;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.millstone.crafting.CraftingHandler;
import com.millstone.creativetab.tabMillstone;
import com.millstone.creativetab.tabMillstoneArmor;
import com.millstone.creativetab.tabMillstoneDeco;
import com.millstone.creativetab.tabMillstoneFood;
import com.millstone.creativetab.tabMillstoneMaterials;
import com.millstone.creativetab.tabMillstoneMisc;
import com.millstone.creativetab.tabMillstoneTools;
import com.millstone.enchantments.Piercing;
import com.millstone.entities.EntityBoar;
import com.millstone.entities.EntityGrenade;
import com.millstone.entities.EntityScarecrow;
import com.millstone.handler.CustomDropsEvent;
import com.millstone.handler.GuiHandler;
import com.millstone.lib.CommonProxy;
import com.millstone.lib.References;
import com.millstone.registry.BlockRegistry;
import com.millstone.registry.ChestGenRegistry;
import com.millstone.registry.EntityRegistryMod;
import com.millstone.registry.ItemRegistry;
import com.millstone.registry.RecipeRegistry;
import com.millstone.registry.TabsRegistry;
import com.millstone.tileentity.TileEntityMillstone;
import com.millstone.worldgen.MillstoneModWorldGen;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

//This Class is very organized, Please keep it that way.

//ModID Stuffs
@Mod(modid = References.MODID, version = References.VERSION, name = References.Name)
public class MillstoneMod
{
	
	
    //Whenever making a new GUI, do this same thing but put a number higher than the previous ID.
	
	
	
    public static final int guiIDMillstone = 1;
    public static final int guiIDCutter = 2;

	@Instance(References.MODID)
	public static MillstoneMod instance;

	
	//Proxy Stuff
	@SidedProxy(clientSide = References.Client, serverSide = References.Common)
	public static CommonProxy proxy;
	
	//Millstone CreativeTabs
	public static CreativeTabs tabMillstone = new tabMillstone(CreativeTabs.getNextID(), "tabMillstone");
	public static CreativeTabs tabMillstoneTools = new tabMillstoneTools(CreativeTabs.getNextID(), "tabMillstoneTools");
	public static CreativeTabs tabMillstoneArmor = new tabMillstoneArmor(CreativeTabs.getNextID(), "tabMillstoneArmor");
	public static CreativeTabs tabMillstoneMaterials = new tabMillstoneMaterials(CreativeTabs.getNextID(), "tabMillstoneMaterials");
	public static CreativeTabs tabMillstoneFood = new tabMillstoneFood(CreativeTabs.getNextID(), "tabMillstoneFood");
	public static CreativeTabs tabMillstoneMisc = new tabMillstoneMisc(CreativeTabs.getNextID(), "tabMillstoneMisc");
	public static CreativeTabs tabMillstoneDeco = new tabMillstoneDeco(CreativeTabs.getNextID(), "tabMillstoneDeco");

	
	//Used to send some Log INFO/ERROR/STDOUT...
	//public static Logger logger = LogManager.getLogger("MillstoneMod");
    private static final Logger logger = LogManager.getLogger();

	//Misc
  
    
	//WorldGen
	MillstoneModWorldGen eventWorldGen = new MillstoneModWorldGen();
	
	
    //Enchantment
	//Doesn't work yet
    public static final Enchantment Piercing = new Piercing(199, 5);
	
    
    @EventHandler
    public void preinit(FMLInitializationEvent event)
    {  
    	logger.info("Initializing MillstoneMod" + References.VERSION);
    	
    	//Events
    	MinecraftForge.EVENT_BUS.register(new CustomDropsEvent());
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {   	
    	
    	
    	//Game Registry
		logger.info("Registering Items, Blocks, and Entities");
		
    	ItemRegistry.Register();
    	BlockRegistry.Register();
    	EntityRegistryMod.Register();
		
		//Spawn ores
		logger.info("World Generation");
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		
		//testing generating random chest
		//needs spawnrate tweak
		ChestGenRegistry.RegisterGeneration();

		TabsRegistry.RemoveCreativeTab();
		
		logger.info("Registering Recipes Stuffs");
		RecipeRegistry.RemoveRecipes();
		RecipeRegistry.RegisterCrafting();
	    RecipeRegistry.RegisterSmelting();
		
	    
		logger.info("Stuffs");
		//Tile Entity Registry
		GameRegistry.registerTileEntity(TileEntityMillstone.class, "tileEntityMillstone");
		EntityRegistry.registerModEntity(EntityGrenade.class, "Grenade", 4, this, 80, 3, true);


    	//Register your GUI handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		MinecraftForge.addGrassSeed(new ItemStack(ItemRegistry.cottonSeeds), 1);
		
		
		//Register your renderer in your proxy.
		proxy.registerRenderThings();
		
		logger.info("Mod loaded");

    }  

    
    /*
    @SubscribeEvent
    public void on(BlockEvent.HarvestDropsEvent event){
    	
    		if (event.block.isEqualTo(Blocks.bookshelf, null)){
    			
    		}
    	}
    */
}
