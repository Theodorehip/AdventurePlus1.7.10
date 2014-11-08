package com.millstone;

import java.util.Random;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityList;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

import com.millstone.crafting.CraftingHandler;
import com.millstone.creativetab.tabMillstone;
import com.millstone.creativetab.tabMillstoneArmor;
import com.millstone.creativetab.tabMillstoneTools;
import com.millstone.enchantments.Piercing;
import com.millstone.entities.Scarecrow;
import com.millstone.handler.CustomDropsEvent;
import com.millstone.handler.GuiHandler;
import com.millstone.lib.CommonProxy;
import com.millstone.lib.References;
import com.millstone.registry.BlockRegistry;
import com.millstone.registry.ChestGenRegistry;
import com.millstone.registry.ItemRegistry;
import com.millstone.registry.RecipeRegistry;
import com.millstone.tileentity.TileEntityMillstone;
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
@Mod(modid = References.MODID, version = References.VERSION)
public class MillstoneMod
{
   
    //Whenever making a new GUI, do this same thing but put a number higher than the previous ID.
    public static final int guiIDMillstone = 1;
    public static final int guiIDCutter = 2;

	@Instance(References.MODID)
	public static MillstoneMod instance;
	
	//Millstone CreativeTabs
	public static CreativeTabs tabMillstone = new tabMillstone(CreativeTabs.getNextID(), "tabMillstone");
	public static CreativeTabs tabMillstoneTools = new tabMillstoneTools(CreativeTabs.getNextID(), "tabMillstoneTools");
	public static CreativeTabs tabMillstoneArmor = new tabMillstoneArmor(CreativeTabs.getNextID(), "tabMillstoneArmor");
	
	//Proxy Stuff
	@SidedProxy(clientSide = References.Client, serverSide = References.Common)
	public static CommonProxy proxy;
	

	//WorldGen
	MillstoneModWorldGen eventWorldGen = new MillstoneModWorldGen();
    
    //Enchantment
    public static final Enchantment Piercing = new Piercing(199, 5);
    
    @EventHandler
    public void preinit(FMLInitializationEvent event)
    {  
    	//Entities
    	registerEntity(Scarecrow.class, "Scarecrow");
    	
    	//Events
    	MinecraftForge.EVENT_BUS.register(new CustomDropsEvent());
    }
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {   	
    	//Game Registry
    	ItemRegistry.Register();
    	BlockRegistry.Register();
		
		//Spawn ores
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		
		//testing generating random chest
		//needs spawnrate tweak
		ChestGenRegistry.RegisterGeneration();
		RecipeRegistry.RegisterCrafting();
		RecipeRegistry.RemoveRecipes();
	    RecipeRegistry.RegisterSmelting();
		
		//Tile Entity Registry
		GameRegistry.registerTileEntity(TileEntityMillstone.class, "tileEntityMillstone");


    	//Register your GUI handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		MinecraftForge.addGrassSeed(new ItemStack(ItemRegistry.cottonSeeds), 1);
		
		
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
