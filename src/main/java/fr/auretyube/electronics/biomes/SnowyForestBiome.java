package fr.auretyube.electronics.biomes;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;

public class SnowyForestBiome extends Biome {

	public SnowyForestBiome() {
		super(new Biome.Builder()
				.precipitation(RainType.SNOW)
				.category(Category.TAIGA)
				.scale(0.2f)
				.depth(0.2f)
				.downfall(0.8f)
				.temperature(0.3F)
				.waterColor(4159204)
				.waterFogColor(329011)
				.surfaceBuilder(SurfaceBuilder.DEFAULT, SurfaceBuilder.GRASS_DIRT_GRAVEL_CONFIG)
				.parent((String) null));
	    DefaultBiomeFeatures.addCarvers(this);
	    DefaultBiomeFeatures.addStructures(this);
	    DefaultBiomeFeatures.addLakes(this);
	    DefaultBiomeFeatures.addMonsterRooms(this);
	    DefaultBiomeFeatures.addStoneVariants(this);
	    DefaultBiomeFeatures.addOres(this);
	    DefaultBiomeFeatures.addSedimentDisks(this);
	    DefaultBiomeFeatures.addGiantTreeTaigaTrees(this);
	    DefaultBiomeFeatures.addDefaultFlowers(this);
	    DefaultBiomeFeatures.addMushrooms(this);
	    DefaultBiomeFeatures.addReedsAndPumpkins(this);
	    DefaultBiomeFeatures.addSprings(this);
	    DefaultBiomeFeatures.addFreezeTopLayer(this);
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.SHEEP, 12, 4, 4));
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.PIG, 10, 4, 4));
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.CHICKEN, 10, 4, 4));
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.COW, 8, 4, 4));
		this.addSpawn(EntityClassification.CREATURE, new Biome.SpawnListEntry(EntityType.WOLF, 5, 4, 4));
		this.addSpawn(EntityClassification.AMBIENT, new Biome.SpawnListEntry(EntityType.BAT, 10, 8, 8));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SPIDER, 100, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE, 95, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SKELETON, 100, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.CREEPER, 100, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.SLIME, 100, 4, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.ENDERMAN, 10, 1, 4));
		this.addSpawn(EntityClassification.MONSTER, new Biome.SpawnListEntry(EntityType.WITCH, 5, 1, 1));
	}

}