package fr.auretyube.electronics.init;

import fr.auretyube.electronics.ElectronicsMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ElectronicsModBlocks {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			ElectronicsMod.MODID);

	public static final RegistryObject<Block> SILVER_BLOCK = BLOCKS.register("silver_block",
			() -> new Block(Block.Properties.from(Blocks.IRON_BLOCK)));
	public static final RegistryObject<Block> SILVER_ORE = BLOCKS.register("silver_ore",
			() -> new OreBlock(Block.Properties.from(Blocks.IRON_ORE)));
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore",
			() -> new OreBlock(Block.Properties.from(Blocks.IRON_ORE)));

}