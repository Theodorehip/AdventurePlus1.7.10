package com.millstone.armor;

import com.millstone.MillstoneMod;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class SapphireArmor extends ItemArmor {

	public SapphireArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(MillstoneMod.tabMillstoneArmor);

		if(slot == 0){
			this.setTextureName("millstonemod:sapphire_helmet");
		}
		else if(slot == 1){
			this.setTextureName("millstonemod:sapphire_chestplate");
		}
		else if(slot == 2){
			this.setTextureName("millstonemod:sapphire_leggings");
		}
		else if(slot == 3){
			this.setTextureName("millstonemod:sapphire_boots");
		}
		
	}

	public String getArmorTexture(ItemStack itemstack, Entity entity, int slot,
			String type) {

		if (itemstack.getItem() == MillstoneMod.armorSapphireHelm
				|| itemstack.getItem() == MillstoneMod.armorSapphireChest
				|| itemstack.getItem() == MillstoneMod.armorSapphireBoots) {

			return MillstoneMod.MODID + ":textures/model/sapphire_layer_1.png";

		} else if (itemstack.getItem() == MillstoneMod.armorSapphireLegs) {

			return MillstoneMod.MODID + ":textures/model/sapphire_layer_2.png";

		} else
			return null;

	}
}