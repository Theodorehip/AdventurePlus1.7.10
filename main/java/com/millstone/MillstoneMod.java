package com.millstone;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityList;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.millstone.armor.CopperArmor;
import com.millstone.armor.EmeraldArmor;
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
import com.millstone.enchantments.Piercing;
import com.millstone.entities.Scarecrow;
import com.millstone.handler.CustomDropsEvent;
import com.millstone.handler.GuiHandler;
import com.millstone.handler.RemoveRecipes;
import com.millstone.items.BoneShard;
import com.millstone.items.CopperDust;
import com.millstone.items.CopperIngot;
import com.millstone.items.Cotton;
import com.millstone.items.Flax;
import com.millstone.items.Flour;
import com.millstone.items.GoldDust;
import com.millstone.items.IronDust;
import com.millstone.items.IronRod;
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
import com.millstone.proxy.CommonProxy;
import com.millstone.registry.BlockRegistry;
import com.millstone.registry.ChestGenRegistry;
import com.millstone.registry.ItemRegistry;
import com.millstone.registry.RecipeRegistry;
import com.millstone.tileentity.TileEntityMillstone;
import com.millstone.tools.BonePickaxe;
import com.millstone.tools.CopperAxe;
import com.millstone.tools.CopperHoe;
import com.millstone.tools.CopperPickaxe;
import com.millstone.tools.CopperShovel;
import com.millstone.tools.CopperSword;
import com.millstone.tools.EmeraldAxe;
import com.millstone.tools.EmeraldHoe;
import com.millstone.tools.EmeraldPickaxe;
import com.millstone.tools.EmeraldShovel;
import com.millstone.tools.EmeraldSword;
import com.millstone.tools.FlintHatchet;
import com.millstone.tools.FlintKnife;
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
