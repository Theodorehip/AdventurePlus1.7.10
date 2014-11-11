package com.millstone.registry;

import com.millstone.handler.RemoveRecipes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeRegistry{
	
	static Item copperIngot = ItemRegistry.copperIngot;
	static Item ruby = ItemRegistry.ruby;
	static Item sapphire = ItemRegistry.sapphire;
	static Item silverIngot = ItemRegistry.silverIngot;
	
	public static void RegisterCrafting(){
		
	//Interactives
	GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.millstoneIdle, 1), new Object[]{"SGS", "IXI", "BBB", 'S', Blocks.stone_slab, 'I', Items.iron_ingot, 'X', BlockRegistry.stoneCutter, 'G', Items.gold_ingot, 'B', Blocks.stonebrick});
	GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.stoneCutter, 1), new Object[]{"CCC", "CSC", "CCC", 'C', Blocks.cobblestone, 'S', ItemRegistry.stoneGear});;

	//Gears
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.woodGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.stick, 'C', Blocks.planks});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.stoneGear, 1), new Object[]{" S ", "SCS", " S ", 'C', Blocks.cobblestone, 'S', Items.stick});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ironGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.iron_ingot, 'C', ItemRegistry.stoneGear});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.goldGear, 1), new Object[]{" S ", "SCS", " S ", 'S', Items.gold_ingot, 'C', ItemRegistry.ironGear});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.diamondGear, 1), new Object[]{" S ", "SCS", " S ", 'C', ItemRegistry.ironGear, 'S', Items.diamond});
	
	//Tools
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperSword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.copperHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', copperIngot});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubySword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubyPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubyAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubyShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.rubyHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', ruby});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphireSword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O',sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphirePickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphireAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphireShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.sapphireHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', sapphire});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldSword, 1), new Object[]{" O ", " O ", " I ", 'I', Items.stick, 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldPickaxe, 1), new Object[]{"OOO", " I ", " I ", 'I', Items.stick, 'O',Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldAxe, 1), new Object[]{" OO", " IO", " I ", 'I', Items.stick, 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldShovel, 1), new Object[]{" O ", " I ", " I ", 'I', Items.stick, 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.emeraldHoe, 1), new Object[]{" OO", " I ", " I ", 'I', Items.stick, 'O', Items.emerald});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.flintHatchet, 1), new Object[]{" O ", "OI ", 'I', Items.stick, 'O', Items.flint});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.bonePickaxe, 1), new Object[]{"OQO", " I ", " I ", 'I', Items.stick, 'Q', Items.bone, 'O',ItemRegistry.boneShard});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.flintKnife, 1), new Object[]{"  I", " I ", 'I', Items.flint});
	GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.boneShard, 1), new Object[]{ItemRegistry.flintKnife, Items.bone});
	
	//Armor
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorCopperHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorCopperChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorCopperLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', copperIngot});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorCopperBoots, 1), new Object[]{"   ", "O O", "O O", 'O', copperIngot});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorRubyHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorRubyChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorRubyLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', ruby});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorRubyBoots, 1), new Object[]{"   ", "O O", "O O", 'O', ruby});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorSapphireHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorSapphireChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorSapphireLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', sapphire});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorSapphireBoots, 1), new Object[]{"   ", "O O", "O O", 'O', sapphire});
	
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEmeraldHelm, 1), new Object[]{"OOO", "O O", "   ", 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEmeraldChest, 1), new Object[]{"O O", "OOO", "OOO", 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEmeraldLegs, 1), new Object[]{"OOO", "O O", "O O", 'O', Items.emerald});
	GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.armorEmeraldBoots, 1), new Object[]{"   ", "O O", "O O", 'O', Items.emerald});
	
	//Unsorted
    GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.lantern,1), new Object[] {"xxx", "xyx", "xxx", 'x', ItemRegistry.ricePaper, 'y', Blocks.torch});
    GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.ricePaper,1), new Object[] {"xxx", 'x', ItemRegistry.riceCrop});
	GameRegistry.addShapedRecipe(new ItemStack(Items.cake, 1), new Object[]{"MMM", "SES", "FFF", 'S', Items.sugar, 'M', Items.milk_bucket, 'E', Items.egg, 'F', ItemRegistry.flour});
	GameRegistry.addShapedRecipe(new ItemStack(Items.cookie, 8), new Object[]{"   ", "FCF", "   ",'F', ItemRegistry.flour, 'C', new ItemStack(Items.dye, 1, 3)});
	
	//Misc
	GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.obsidianBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', ItemRegistry.obsidianDust});
	GameRegistry.addShapedRecipe(new ItemStack(Items.string, 1), new Object[]{"   ", "CCC", "   ", 'C', ItemRegistry.cotton});
	GameRegistry.addShapedRecipe(new ItemStack(Blocks.wool, 1), new Object[]{"   ", "CC ", "CC ", 'C', ItemRegistry.cotton});
    GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.riceBowl,1), new Object[] {"x", "y", 'x', ItemRegistry.riceCrop, 'y', Items.bowl});
    GameRegistry.addShapelessRecipe(new ItemStack(ItemRegistry.sushi,1), new Object[] {new ItemStack(ItemRegistry.riceCrop, 1), Items.fish});
    
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
	
}
	public static void RegisterSmelting(){
		
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.ironDust), new ItemStack(Items.iron_ingot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.goldDust), new ItemStack(Items.gold_ingot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.flour), new ItemStack(Items.bread, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockRegistry.copperOre), new ItemStack(copperIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.copperDust), new ItemStack(copperIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(BlockRegistry.silverOre), new ItemStack(silverIngot, 1), 0.35F);
		GameRegistry.addSmelting(new ItemStack(ItemRegistry.silverDust), new ItemStack(silverIngot, 1), 0.35F);
	}
	public static void RemoveRecipes(){
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
		
		
	}
	
}