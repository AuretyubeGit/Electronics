package fr.auretyube.electronics.init;

import fr.auretyube.electronics.ElectronicsMod;
import fr.auretyube.electronics.ElectronicsMod.ElectronicsModItemGroup;
import fr.auretyube.electronics.items.CopperItem;
import fr.auretyube.electronics.items.SilverItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ElectronicsModItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			ElectronicsMod.MODID);

	public static final RegistryObject<Item> SILVER = ITEMS.register("silver",
			() -> new SilverItem(new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)));
	public static final RegistryObject<Item> COPPER = ITEMS.register("copper",
			() -> new CopperItem(new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)));
	public static final RegistryObject<Item> SILVER_WAFER = ITEMS.register("silver_wafer",
			() -> new Item(new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)));
	public static final RegistryObject<Item> COPPER_PLATE = ITEMS.register("copper_plate",
			() -> new Item(new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)));
	public static final RegistryObject<Item> PRINTED_CIRCUIT = ITEMS.register("printed_circuit",
			() -> new Item(new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)));
	public static final RegistryObject<Item> SSD = ITEMS.register("ssd",
			() -> new Item(new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)));
	public static final RegistryObject<Item> PROCESSOR = ITEMS.register("processor",
			() -> new Item(new Item.Properties().group(ElectronicsModItemGroup.INSTANCE)));

}