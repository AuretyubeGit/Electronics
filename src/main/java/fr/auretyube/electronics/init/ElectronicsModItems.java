package fr.auretyube.electronics.init;

import fr.auretyube.electronics.ElectronicsMod;
import fr.auretyube.electronics.ElectronicsMod.ElectronicsModItemGroup;
import fr.auretyube.electronics.items.SilverItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@ObjectHolder(value = ElectronicsMod.MODID)
@EventBusSubscriber(modid = ElectronicsMod.MODID, bus = Bus.MOD)
public class ElectronicsModItems {
	
	public static final Item SILVER = new SilverItem(new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)).setRegistryName(ElectronicsMod.MODID, "silver");
	
	@SubscribeEvent
	public static final void regsterItems(final RegistryEvent.Register<Item> event) {
		event.getRegistry().register(SILVER);
	}
}