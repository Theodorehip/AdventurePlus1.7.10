package com.millstone.armor;

import com.millstone.MillstoneMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class CopperArmor extends ItemArmor {

	public CopperArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(MillstoneMod.tabMillstone);

		if(slot == 0){
			this.setTextureName("millstonemod:copper_helmet");
		}
		else if(slot == 1){
			this.setTextureName("millstonemod:copper_chestplate");
		}
		else if(slot == 2){
			this.setTextureName("millstonemod:copper_leggings");
		}
		else if(slot == 3){
			this.setTextureName("millstonemod:copper_boots");
		}
		
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {

		if (itemstack.getItem() == MillstoneMod.armorCopperHelm
				|| itemstack.getItem() == MillstoneMod.armorCopperChest
				|| itemstack.getItem() == MillstoneMod.armorCopperBoots) {

			return MillstoneMod.MODID + ":textures/model/copper_layer_1.png";

		} else if (itemstack.getItem() == MillstoneMod.armorCopperLegs) {

			return MillstoneMod.MODID + ":textures/model/copper_layer_2.png";

		} else
			return null;

	}
}