package com.millstone.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;

import com.millstone.MillstoneMod;

public class EmeraldArmor extends ItemArmor {

	public EmeraldArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(MillstoneMod.tabMillstoneArmor);

		if(slot == 0){
			this.setTextureName("millstonemod:Emerald_helmet");
		}
		else if(slot == 1){
			this.setTextureName("millstonemod:Emerald_chestplate");
		}
		else if(slot == 2){
			this.setTextureName("millstonemod:Emerald_leggings");
		}
		else if(slot == 3){
			this.setTextureName("millstonemod:Emerald_boots");
		}
		
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {

		if (itemstack.getItem() == MillstoneMod.armorEmeraldHelm
				|| itemstack.getItem() == MillstoneMod.armorEmeraldChest
				|| itemstack.getItem() == MillstoneMod.armorEmeraldBoots) {

			return MillstoneMod.MODID + ":textures/model/emerald_layer_1.png";

		} else if (itemstack.getItem() == MillstoneMod.armorEmeraldLegs) {

			return MillstoneMod.MODID + ":textures/model/emerald_layer_2.png";

		} else
			return null;

	}
}