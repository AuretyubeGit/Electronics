package fr.auretyube.electronics;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.auretyube.electronics.init.ElectronicsModBlocks;
import fr.auretyube.electronics.init.ElectronicsModItems;
import fr.auretyube.electronics.world.gen.ElectronicsModOreGeneration;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(ElectronicsMod.MODID)
@EventBusSubscriber(modid = ElectronicsMod.MODID, bus = Bus.MOD)
public class ElectronicsMod {
	
	public static final String MODID = "electronics";
	public static final Logger LOGGER = LogManager.getLogger("electronics");
	public static ElectronicsMod INSTANCE;
	
	public ElectronicsMod() {
		final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		eventBus.addListener(this::setup);
		eventBus.addListener(this::doClientStuff);
		INSTANCE = this;
		
		ElectronicsModItems.ITEMS.register(eventBus);
		ElectronicsModBlocks.BLOCKS.register(eventBus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
	
	@SubscribeEvent
	public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		ElectronicsModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
					final Item.Properties properties = new Item.Properties().group(ElectronicsModItemGroup.INSTANCE);
					final BlockItem blockItem = new BlockItem(block, properties);
					blockItem.setRegistryName(block.getRegistryName());
					registry.register(blockItem);
				});

	}

	private void setup(final FMLCommonSetupEvent event) {
		
	}

	private void doClientStuff(final FMLClientSetupEvent event) {
		
	}

	@SubscribeEvent
	public void onServerStarting(FMLServerStartingEvent event) {
		
	}
	
	@SubscribeEvent
	public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
		ElectronicsModOreGeneration.generateOres();
	}
	
	public static class ElectronicsModItemGroup extends ItemGroup {
		
		public static final ElectronicsModItemGroup INSTANCE = new ElectronicsModItemGroup(ItemGroup.GROUPS.length, "electronicsmodtab");
		
		private ElectronicsModItemGroup(int index, String label) {
			super(index, label);
		}

		@Override
		public ItemStack createIcon() {
			return new ItemStack(ElectronicsModItems.SSD.get());
		}
		
	}
}
