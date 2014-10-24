package com.millstone;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class MillstoneMaterials {

	//Tool/Armor Materials
	public static ToolMaterial ObsidianMaterial;
	public static ToolMaterial CopperMaterial;
	public static ToolMaterial RubyMaterial;
	public static ToolMaterial SapphireMaterial;

	public static ArmorMaterial ObsidianArmorMaterial;
	public static ArmorMaterial CopperArmorMaterial;
	public static ArmorMaterial RubyArmorMaterial;
	public static ArmorMaterial SapphireArmorMaterial;


	public static void addMaterials(){
		//Tool/Armor Materials
		ObsidianMaterial = EnumHelper.addToolMaterial("ObsidianMaterial" , 3 , 750, 13.0F, 4.0F, 10);
		ToolMaterial CopperMaterial = EnumHelper.addToolMaterial("CopperMaterial" , 2 , 210, 5.0F, 2.0F, 14);
		ToolMaterial RubyMaterial = EnumHelper.addToolMaterial("RubyMaterial" , 3 , 1561, 8.0F, 3.0F, 10);
		ToolMaterial SapphireMaterial = EnumHelper.addToolMaterial("SapphireMaterial" , 3 , 1561, 8.0F, 3.0F, 10);

		ArmorMaterial ObsidianArmorMaterial = EnumHelper.addArmorMaterial("ObsidianArmor", 42, new int[]{3, 7, 7, 3}, 20);
		ArmorMaterial CopperArmorMaterial = EnumHelper.addArmorMaterial("CopperArmor", 13, new int[]{2, 5, 4, 1}, 10);
		ArmorMaterial RubyArmorMaterial = EnumHelper.addArmorMaterial("RubyArmor", 33, new int[]{3, 8, 6, 3}, 10);
		ArmorMaterial SapphireArmorMaterial = EnumHelper.addArmorMaterial("SapphireArmor", 33, new int[]{3, 8, 6, 3}, 10);

	}

}
