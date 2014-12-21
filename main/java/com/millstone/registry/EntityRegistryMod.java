package com.millstone.registry;

import java.util.Random;

import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

import com.millstone.MillstoneMod;
import com.millstone.entities.EntityBoar;
import com.millstone.entities.EntityScarecrow;
import com.millstone.lib.References;

import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.registry.EntityRegistry;

public class EntityRegistryMod {
	
	@Instance(References.MODID)
	public static MillstoneMod instance;
	
	
	public static void Register(){
		
    	//Entities
		//Add 0x if you are using Hexadecimal                 \/        \/
    	registerEntity(EntityScarecrow.class, "Scarecrow", 0xFFCC00, 0x663300); //Doesn't work yet
    	registerEntity(EntityBoar.class, "Boar", 0x522900, 0x4C001F);	
    	
    	
    	
    	//AddSpawn
    	/**
    	 * Par0: Entity to Spawn
    	 * Par1: Probability of Spawn
    	 * Par2: min amt of entity to spawn in a group
    	 * Par3: max amt of entity to spawn in a group
    	 * Par4: Creature Type, how you want it to spawn (shade, anywhere, water == monster, creature, waterCreature respectively) 
    	 * Par6: Biomes where the Entity will spawn
    	 */
		EntityRegistry.addSpawn(EntityBoar.class, 4, 1, 4, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.plains, BiomeGenBase.swampland);

		//List (I think) of all biomes 
		//BiomeGenBase.beach, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.jungleHills, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.swampland
    	

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
