//I assume you know how to organize things with packages

package com.millstone;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import com.millstone.blocks.CopperOre;
import com.millstone.blocks.CottonPlant;
import com.millstone.blocks.Cutter;
import com.millstone.blocks.Millstone;
import com.millstone.blocks.ObsidianBlock;
import com.millstone.blocks.lantern;
import com.millstone.blocks.lavaBrick;
import com.millstone.blocks.RicePlant;
import com.millstone.crafting.CraftingHandler;
import com.millstone.creativetab.tabMillstone;
import com.millstone.handler.GuiHandler;
import com.millstone.handler.RemoveRecipes;
import com.millstone.items.CopperDust;
import com.millstone.items.CopperIngot;
import com.millstone.items.Cotton;
import com.millstone.items.Flour;
import com.millstone.items.GoldDust;
import com.millstone.items.IronDust;
import com.millstone.items.ObsidianDust;
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

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

//Just putting it out there, I am very organised with my main class file. Hopefully it might help you get around also. ~Muggles

//ModID Stuffs
@Mod(modid = MillstoneMod.MODID, version = MillstoneMod.VERSION)
public class MillstoneMod
{
	//ID's and etc
    public static final String MODID = "millstonemod";
    public static final String VERSION = "0.0.2";
   
    //Whenever making a new GUI, do this same thing but put a number higher than the previous ID.
    public static final int guiIDMillstone = 1;
    public static final int guiIDCutter = 2;

	@Instance(MODID)
	public static MillstoneMod instance;
	
	//Millstone CreativeTab
	public static CreativeTabs tabMillstone = new tabMillstone(CreativeTabs.getNextID(), "tabMillstone");
	
	//Proxy Stuff
	@SidedProxy(clientSide = "com.millstone.proxy.ClientProxy", serverSide = "com.millstone.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	public static ToolMaterial ObsidianMaterial = EnumHelper.addToolMaterial("ObsidianMaterial" , 3 , 750, 13.0F, 4.0F, 10);
	
	//WorldGen
	
	MillstoneModWorldGen eventWorldGen = new MillstoneModWorldGen();
	
	
	//Create the millstone. You need the idle and active.
	public static Block millstoneIdle = new Millstone(false).setBlockName("millstoneIdle").setCreativeTab(tabMillstone).setHardness(5F);
	public static Block millstoneActive = new Millstone(true).setBlockName("millstoneActive").setHardness(5F);;
	public static Block stoneCutter = new Cutter().setBlockName("stoneCutter").setCreativeTab(tabMillstone).setHardness(5F);
	public static Block obsidianBlock = new ObsidianBlock(Material.rock).setBlockName("obsidianBlock");
	public static Block copperOre = new CopperOre(Material.rock).setBlockName("copperOre");
	
	public static Block lantern = new lantern(Material.glass).setHardness(0.3F).setLightLevel(1.0F).setBlockName("lantern").setBlockTextureName("lantern");
	
	public static Block lavaBrick  = new lavaBrick(Material.rock).setBlockName("lavaBrick").setBlockTextureName(MODID + ":" + "lavaBrick");

	public static Item woodGear = new com.millstone.items.ItemGear().setMaxDamage(500).setTextureName(MODID + ":" + "woodGear").setUnlocalizedName("woodGear");
	public static Item stoneGear = new com.millstone.items.ItemGear().setMaxDamage(1320).setTextureName(MODID + ":" + "stoneGear").setUnlocalizedName("stoneGear");
	public static Item ironGear = new com.millstone.items.ItemGear().setMaxDamage(2500).setTextureName(MODID + ":" + "ironGear").setUnlocalizedName("ironGear");
	public static Item goldGear = new com.millstone.items.ItemGear().setMaxDamage(240).setTextureName(MODID + ":" + "goldGear").setUnlocalizedName("goldGear");
	public static Item diamondGear = new com.millstone.items.ItemGear().setMaxDamage(15612).setTextureName(MODID + ":" + "diamondGear").setUnlocalizedName("diamondGear");
	
	//Tools
	public static Item obsidianSword = new ObsidianSword(ObsidianMaterial).setUnlocalizedName("obsidianSword");
	public static Item obsidianPickaxe = new ObsidianPickaxe(ObsidianMaterial).setUnlocalizedName("obsidianPickaxe");
	public static Item obsidianShovel = new ObsidianShovel(ObsidianMaterial).setUnlocalizedName("obsidianShovel");
	public static Item obsidianAxe = new ObsidianAxe(ObsidianMaterial).setUnlocalizedName("obsidianAxe");
	public static Item obsidianHoe = new ObsidianHoe(ObsidianMaterial).setUnlocalizedName("obsidianHoe");

	
	public static Item stoneDust = new StoneDust();
	public static Item goldDust = new GoldDust();
	public static Item ironDust = new IronDust();
	public static Item obsidianDust = new ObsidianDust();
	public static Item copperDust = new CopperDust();
	public static Item copperIngot = new CopperIngot();

	public static Item flour = new Flour();
	public static Item ricePaper = new ricePaper();
	
	//Food
	public static ItemFood riceBowl = new riceBowl(3, 0.4F, false);
	public static ItemFood sushi = new sushi(6, 0.7F, false);
	
	
    public static Block cottonPlant = new CottonPlant().setBlockName("cottonPlant");
    public static Item cottonSeeds = new ItemSeeds(cottonPlant, Blocks.farmland).setUnlocalizedName("cottonSeeds").setTextureName(MODID + ":cottonSeeds").setCreativeTab(MillstoneMod.tabMillstone);
    public static Item cotton = new Cotton();
    
    public static Block ricePlant = new RicePlant().setBlockName("Rice").setBlockTextureName(MODID + ":ricePlant");
    public static Item riceCrop = new ItemSeeds(ricePlant, Blocks.farmland).setUnlocalizedName("riceCrop").setTextureName(MODID + ":riceCrop");
	
    @EventHandler
    public void init(FMLInitializationEvent event)
    {   	
    	//Game and Lang reg,
	
		//Register the millstone and millstone active, but only add a name to the active millstone.
		GameRegistry.registerBlock(millstoneIdle, "millstoneIdle");
		GameRegistry.registerBlock(millstoneActive, "millstoneActive");
		GameRegistry.registerBlock(obsidianBlock, "obsidianBlock");
		GameRegistry.registerBlock(stoneCutter, "stoneCutter");
		GameRegistry.registerBlock(lantern, "lantern");
		GameRegistry.registerBlock(ricePlant, "ricePlant");
		GameRegistry.registerBlock(lavaBrick, "lavaBrick");
		
		GameRegistry.registerItem(woodGear, "woodGear");
		GameRegistry.registerItem(stoneGear, "stoneGear");	
		GameRegistry.registerItem(ironGear, "ironGear");
		GameRegistry.registerItem(goldGear, "goldGear");
		GameRegistry.registerItem(diamondGear, "diamondGear");
		GameRegistry.registerItem(flour, "flour");
		GameRegistry.registerItem(stoneDust, "stoneDust");
		GameRegistry.registerItem(obsidianDust, "obsidianDust");
		GameRegistry.registerItem(goldDust, "goldDust");
		GameRegistry.registerItem(ironDust, "ironDust");
		GameRegistry.registerItem(obsidianSword, "obsidianSword");
		GameRegistry.registerItem(obsidianHoe, "obsidianHoe");
		GameRegistry.registerItem(obsidianAxe, "obsidianAxe");
		GameRegistry.registerItem(obsidianPickaxe, "obsidianPickaxe");
		GameRegistry.registerItem(obsidianShovel, "obsidianShovel");
		GameRegistry.registerItem(riceCrop, "riceCrop");
		GameRegistry.registerItem(riceBowl, "riceBowl");
		GameRegistry.registerItem(sushi, "sushi");
		GameRegistry.registerItem(ricePaper, "ricePaper");
		GameRegistry.registerItem(copperDust, "copperDust");
		GameRegistry.registerItem(copperIngot, "copperBar");
		
		//spawn ores
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
	    *Let me explain recipes. So the "stonegear, 1" in the itemstack is basically the item you want to create, and the 1 for
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
		GameRegistry.addShapedRecipe(new ItemStack(obsidianSword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.iron_ingot, 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.iron_ingot, 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.iron_ingot, 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.iron_ingot, 'O', obsidianBlock});
		GameRegistry.addShapedRecipe(new ItemStack(obsidianHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.iron_ingot, 'O', obsidianBlock});
		
		
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
		
		//Tile Entity Registry
		GameRegistry.registerTileEntity(TileEntityMillstone.class, "tileEntityMillstone");


    	//Register your GUI handler
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
		FMLCommonHandler.instance().bus().register(new CraftingHandler());
		
		MinecraftForge.addGrassSeed(new ItemStack(cottonSeeds), 1);
		
		//Register your renderer in your proxy.
		proxy.registerRenderThings();
    }  

    
   
}
