package com.millstone.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;
import com.millstone.registry.ItemRegistry;

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

		if (itemstack.getItem() == ItemRegistry.armorObsidianHelm
				|| itemstack.getItem() == ItemRegistry.armorObsidianChest
				|| itemstack.getItem() == ItemRegistry.armorObsidianBoots) {

			return References.MODID + ":textures/model/obsidian_layer_1.png";

		} else if (itemstack.getItem() == ItemRegistry.armorObsidianLegs) {

			return References.MODID + ":textures/model/obsidian_layer_2.png";

		} else
			return null;

	}
}
