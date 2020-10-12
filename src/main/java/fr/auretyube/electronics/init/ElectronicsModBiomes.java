package fr.auretyube.electronics.init;

import fr.auretyube.electronics.ElectronicsMod;
import fr.auretyube.electronics.biomes.SnowyForestBiome;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ElectronicsModBiomes {
	
	public static final DeferredRegister<Biome> BIOMES = new DeferredRegister<>(ForgeRegistries.BIOMES, ElectronicsMod.MODID);
	
	public static final RegistryObject<Biome> SNOWY_FOREST = BIOMES.register("snowy_forest", () -> new SnowyForestBiome()); 
	
	public static void registerBiomes() {
		registerBiome(SNOWY_FOREST.get(), BiomeDictionary.Type.FOREST, BiomeDictionary.Type.SNOWY, BiomeDictionary.Type.OVERWORLD);
	}
	
	protected static void registerBiome(Biome biome, BiomeDictionary.Type... types) {
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
		BiomeManager.addBiome(BiomeManager.BiomeType.ICY, new BiomeManager.BiomeEntry(SNOWY_FOREST.get(), 100));
	}
	
}