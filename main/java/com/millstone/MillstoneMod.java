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
	
	
	//Create the millstone. You need the idle and active.
	public static Block millstoneIdle = new Millstone(false).setBlockName("millstoneIdle").setCreativeTab(tabMillstone).setHardness(5F);
	public static Block millstoneActive = new Millstone(true).setBlockName("millstoneActive").setHardness(5F);;
	public static Block stoneCutter = new Cutter().setBlockName("stoneCutter").setCreativeTab(tabMillstone).setHardness(5F);

	
	//Gears
	public static Item woodGear = new com.millstone.items.ItemGear().setMaxDamage(500).setTextureName(MODID + ":" + "woodGear").setUnlocalizedName("woodGear");
	public static Item stoneGear = new com.millstone.items.ItemGear().setMaxDamage(1320).setTextureName(MODID + ":" + "stoneGear").setUnlocalizedName("stoneGear");
	public static Item ironGear = new com.millstone.items.ItemGear().setMaxDamage(2500).setTextureName(MODID + ":" + "ironGear").setUnlocalizedName("ironGear");
	public static Item goldGear = new com.millstone.items.ItemGear().setMaxDamage(240).setTextureName(MODID + ":" + "goldGear").setUnlocalizedName("goldGear");
	public static Item diamondGear = new com.millstone.items.ItemGear().setMaxDamage(15612).setTextureName(MODID + ":" + "diamondGear").setUnlocalizedName("diamondGear");

	
	
	public static Item rottenArrow = new rottenArrow();
	
    
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
		//InteractiveBlocks
		GameRegistry.registerBlock(millstoneIdle, "millstoneIdle");
		GameRegistry.registerBlock(millstoneActive, "millstoneActive");
		GameRegistry.registerBlock(stoneCutter, "stoneCutter");

		
		//Gears
		GameRegistry.registerItem(woodGear, "woodGear");
		GameRegistry.registerItem(stoneGear, "stoneGear");	
		GameRegistry.registerItem(ironGear, "ironGear");
		GameRegistry.registerItem(goldGear, "goldGear");
		GameRegistry.registerItem(diamondGear, "diamondGear");

		GameRegistry.registerItem(rottenArrow, "rottenArrow");
		
		//Spawn ores
		GameRegistry.registerWorldGenerator(eventWorldGen, 0);
		
		//testing generating random chest
		//needs spawnrate tweak
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianPickaxe, 0 , 1, 4, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianAxe, 0, 1, 4, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianHoe, 0, 1, 4, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianSword, 0, 1, 4, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.obsidianShovel, 0, 1, 4, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.armorObsidianHelm, 0, 1, 4, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.armorObsidianChest, 0, 1, 4, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.armorObsidianLegs, 0, 1, 4, 50));
		ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(ItemRegistry.armorObsidianBoots, 0, 1, 4, 50));

		RecipeRegistry.RegisterCrafting();
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
		
		//getting rid of wooden tools
		RemoveRecipes.removeRecipes(Items.wooden_axe);
		RemoveRecipes.removeRecipes(Items.wooden_pickaxe);
		RemoveRecipes.removeRecipes(Items.wooden_shovel);
		RemoveRecipes.removeRecipes(Items.wooden_sword);
		RemoveRecipes.removeRecipes(Items.wooden_hoe);
		
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
			
		GameRegistry.addShapedRecipe(new ItemStack(millstoneIdle, 1), new Object[]{"SGS", "IXI", "BBB", 'S', Blocks.stone_slab, 'I', Items.iron_ingot, 'X', stoneCutter, 'G', Items.gold_ingot, 'B', Blocks.stonebrick});
		GameRegistry.addShapedRecipe(new ItemStack(stoneCutter, 1), new Object[]{"CCC", "CSC", "CCC", 'C', Blocks.cobblestone, 'S', stoneGear});;

		
		GameRegistry.addShapedRecipe(new ItemStack(woodGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.stick, 'C', Blocks.planks});
		GameRegistry.addShapedRecipe(new ItemStack(stoneGear, 1), new Object[]{" S ", "SCS", " S ", 'C', Blocks.cobblestone, 'S', Items.stick});
		GameRegistry.addShapedRecipe(new ItemStack(ironGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.iron_ingot, 'C', stoneGear});
		GameRegistry.addShapedRecipe(new ItemStack(goldGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.gold_ingot, 'C', ironGear});
		GameRegistry.addShapedRecipe(new ItemStack(diamondGear, 1), new Object[]{" S ", "SCS", " S ", 'C', ironGear, 'S', Items.diamond});
		

		
		
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
