package fr.auretyube.electronics.world.gen;

import fr.auretyube.electronics.init.ElectronicsModBlocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage.Decoration;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class ElectronicsModOreGeneration {
	
	public static void generateOres() {
		for(Biome biome : ForgeRegistries.BIOMES) {
			ConfiguredPlacement<CountRangeConfig> silverOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(24, 0, 0, 38));
			biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ElectronicsModBlocks.SILVER_ORE.getDefaultState(), 10)).withPlacement(silverOreConfig));
			
			ConfiguredPlacement<CountRangeConfig> copperOreConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(16, 0, 0, 38));
			biome.addFeature(Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, ElectronicsModBlocks.COPPER_ORE.getDefaultState(), 10)).withPlacement(copperOreConfig));
		}
	}
	
}