package com.millstone.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;
import com.millstone.registry.ItemRegistry;

public class CopperArmor extends ItemArmor {

	public CopperArmor(ArmorMaterial material, int id, int slot) {
		super(material, id, slot);
		this.setCreativeTab(MillstoneMod.tabMillstoneArmor);

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

		if (itemstack.getItem() == ItemRegistry.armorCopperHelm
				|| itemstack.getItem() == ItemRegistry.armorCopperChest
				|| itemstack.getItem() == ItemRegistry.armorCopperBoots) {

			return References.MODID + ":textures/model/copper_layer_1.png";

		} else if (itemstack.getItem() == ItemRegistry.armorCopperLegs) {

			return References.MODID + ":textures/model/copper_layer_2.png";

		} else
			return null;

	}
}