package net.fritz.magitech.item;

import net.fritz.magitech.Magitech;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Magitech.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MAGITECH_TAB = CREATIVE_MODE_TABS.register("magitech_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_BLEND.get()))
                    .title(Component.translatable("creativetab.magitech_tab"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.RAW_TIN.get());
                        output.accept(ModItems.TIN_INGOT.get());
                        output.accept(ModItems.BRONZE_BLEND.get());
                        output.accept(ModItems.BRONZE_INGOT.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
