package com.millstone.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.millstone.MillstoneItems;
import com.millstone.MillstoneMod;

public class ObsidianArmor extends ItemArmor {

	public ObsidianArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(MillstoneMod.tabMillstoneArmor);

		if(slot == 0){
			this.setTextureName("millstonemod:obsidian_helmet");
		}
		else if(slot == 1){
			this.setTextureName("millstonemod:obsidian_chestplate");
		}
		else if(slot == 2){
			this.setTextureName("millstonemod:obsidian_leggings");
		}
		else if(slot == 3){
			this.setTextureName("millstonemod:obsidian_boots");
		}
		
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {

		if (itemstack.getItem() == MillstoneItems.armorObsidianHelm
				|| itemstack.getItem() == MillstoneItems.armorObsidianChest
				|| itemstack.getItem() == MillstoneItems.armorObsidianBoots) {

			return MillstoneMod.MODID + ":textures/model/obsidian_layer_1.png";

		} else if (itemstack.getItem() == MillstoneItems.armorObsidianLegs) {

			return MillstoneMod.MODID + ":textures/model/obsidian_layer_2.png";

		} else
			return null;

	}
}
