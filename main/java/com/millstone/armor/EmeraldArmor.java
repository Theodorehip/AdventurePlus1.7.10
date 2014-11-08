package com.millstone.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import com.millstone.MillstoneMod;
import com.millstone.lib.References;
import com.millstone.registry.ItemRegistry;

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

		if (itemstack.getItem() == ItemRegistry.armorEmeraldHelm
				|| itemstack.getItem() == ItemRegistry.armorEmeraldChest
				|| itemstack.getItem() == ItemRegistry.armorEmeraldBoots) {

			return References.MODID + ":textures/model/emerald_layer_1.png";

		} else if (itemstack.getItem() == ItemRegistry.armorEmeraldLegs) {

			return References.MODID + ":textures/model/emerald_layer_2.png";

		} else
			return null;

	}
}