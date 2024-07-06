package net.fritz.magitech.item;

import net.fritz.magitech.Magitech;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Magitech.MOD_ID);

    // ===== BEGIN CREATING ITEMS =====

    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BLEND = ITEMS.register("bronze_blend", () -> new Item(new Item.Properties()));

    // ===== END CREATING ITEMS =====

    public static void register (IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
