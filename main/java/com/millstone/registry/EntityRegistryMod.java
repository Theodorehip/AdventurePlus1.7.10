package com.millstone.registry;

import java.util.Random;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.monster.EntityCreeper;

import com.millstone.MillstoneMod;
import com.millstone.entities.EntityBoar;
import com.millstone.entities.EntityScarecrow;
import com.millstone.handler.ModifyingHandler;
import com.millstone.lib.References;

import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityRegistryMod {
	
	@Instance(References.MODID)
	public static MillstoneMod instance;
	
	
	public static void Register(){
		
    	//Entities
    	registerEntity(EntityScarecrow.class, "Scarecrow", 0xFFCC00, 0x663300); //Doesn't work yet
    	registerEntity(EntityBoar.class, "Boar", 0x522900, 0x4C001F);
    	
    	//EntityList.addMapping(EntityBoar.class, "EntityBoar", 255, 12623485, 15656192);
    	

	}
	
	public static void registerEntity(Class entityClass, String name, int primC, int secoC)
    {
    int entityID = EntityRegistry.findGlobalUniqueEntityId();
    long seed = name.hashCode();
    Random rand = new Random(seed);
    //int primaryColor = rand.nextInt() * 16777215;
    //int secondaryColor = rand.nextInt() * 16777215;
    int primaryColor = primC;
    int secondaryColor = secoC;


    EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
    EntityRegistry.registerModEntity(entityClass, name, entityID, instance, 64, 1, true);
    EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));

    }
	
	

}
