package com.millstone.armor;

import com.millstone.MillstoneMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class RubyArmor extends ItemArmor {

	public RubyArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(MillstoneMod.tabMillstoneArmor);

		if(slot == 0){
			this.setTextureName("millstonemod:ruby_helmet");
		}
		else if(slot == 1){
			this.setTextureName("millstonemod:ruby_chestplate");
		}
		else if(slot == 2){
			this.setTextureName("millstonemod:ruby_leggings");
		}
		else if(slot == 3){
			this.setTextureName("millstonemod:ruby_boots");
		}
		
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {

		if (itemstack.getItem() == MillstoneMod.armorRubyHelm
				|| itemstack.getItem() == MillstoneMod.armorRubyChest
				|| itemstack.getItem() == MillstoneMod.armorRubyBoots) {

			return MillstoneMod.MODID + ":textures/model/ruby_layer_1.png";

		} else if (itemstack.getItem() == MillstoneMod.armorRubyLegs) {

			return MillstoneMod.MODID + ":textures/model/ruby_layer_2.png";

		} else
			return null;

	}
}
