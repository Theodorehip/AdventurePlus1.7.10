package com.millstone.registry;

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
}