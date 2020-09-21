package fr.auretyube.electronics.init;

import fr.auretyube.electronics.ElectronicsMod;
import fr.auretyube.electronics.ElectronicsMod.ElectronicsModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(ElectronicsMod.MODID)
@EventBusSubscriber(modid = ElectronicsMod.MODID, bus = Bus.MOD)
public class ElectronicsModBlocks {
	
	public static final Block SILVER_BLOCK = new Block(Block.Properties.from(Blocks.IRON_BLOCK)).setRegistryName(ElectronicsMod.MODID, "silver_block");
	public static final Block SILVER_ORE = new OreBlock(Block.Properties.from(Blocks.IRON_ORE)).setRegistryName(ElectronicsMod.MODID, "silver_ore");
	public static final Block COPPER_ORE = new OreBlock(Block.Properties.from(Blocks.IRON_ORE)).setRegistryName(ElectronicsMod.MODID, "copper_ore");
	
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		event.getRegistry().register(SILVER_BLOCK);
		event.getRegistry().register(SILVER_ORE);
		event.getRegistry().register(COPPER_ORE);
	}
	
	@SubscribeEvent
	public static void registerBlockItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(new BlockItem(SILVER_BLOCK, new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)).setRegistryName(SILVER_BLOCK.getRegistryName()));
		event.getRegistry().register(new BlockItem(SILVER_ORE, new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)).setRegistryName(SILVER_ORE.getRegistryName()));
		event.getRegistry().register(new BlockItem(COPPER_ORE, new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)).setRegistryName(COPPER_ORE.getRegistryName()));
	}
	
}