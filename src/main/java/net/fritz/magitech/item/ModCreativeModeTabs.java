package net.fritz.magitech.item;

import net.fritz.magitech.Magitech;
import net.fritz.magitech.block.ModBlocks;
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
                        output.accept(ModItems.STEEL_INGOT.get());

                        output.accept(ModItems.URANIUM.get());
                        output.accept(ModItems.WIRE_SPOOL.get());
                        output.accept(ModItems.RUBBER.get());
                        output.accept(ModItems.LATEX.get());

                        output.accept(ModItems.TIN_PLATE.get());
                        output.accept(ModItems.BRONZE_PLATE.get());
                        output.accept(ModItems.STEEL_PLATE.get());
                        output.accept(ModItems.IRON_PLATE.get());
                        output.accept(ModItems.GOLD_PLATE.get());
                        output.accept(ModItems.DIAMOND_PLATE.get());
                        output.accept(ModItems.NETHERITE_PLATE.get());

                        output.accept(ModBlocks.STEEL_BLOCK.get());
                        output.accept(ModBlocks.BRONZE_BLOCK.get());
                        output.accept(ModBlocks.URANIUM_BLOCK.get());
                        output.accept(ModBlocks.TIN_BLOCK.get());
                        output.accept(ModBlocks.RAW_TIN_BLOCK.get());
                        output.accept(ModBlocks.TIN_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_TIN_ORE.get());
                        output.accept(ModBlocks.NETHER_URANIUM_ORE.get());

                        output.accept(ModBlocks.OBELISK.get());
                        output.accept(ModItems.ALCHEMICAL_IRON_INGOT.get());
                        output.accept(ModItems.BLOOD_DIAMOND.get());
                        output.accept(ModItems.BASIC_ESSENCE_ORB.get());
                        output.accept(ModItems.ENHANCED_ESSENCE_ORB.get());
                        output.accept(ModItems.ADVANCED_ESSENCE_ORB.get());
                        output.accept(ModItems.MASTER_ESSENCE_ORB.get());
                        output.accept(ModItems.ELDRITCH_ESSENCE_ORB.get());

                        output.accept(ModItems.ALCHEMICAL_IRON_WAND_CAP.get());
                        output.accept(ModItems.DIAMOND_WAND_CAP.get());
                        output.accept(ModItems.IRON_WAND_CAP.get());
                        output.accept(ModItems.GOLD_WAND_CAP.get());
                        output.accept(ModItems.OBSIDIAN_WAND_CAP.get());
                        output.accept(ModItems.BLOOD_DIAMOND_WAND_CAP.get());

                        output.accept(ModItems.DIAMOND_NUGGET.get());
                        output.accept(ModItems.BLOOD_DIAMOND_NUGGET.get());
                        output.accept(ModItems.OBSIDIAN_NUGGET.get());
                        output.accept(ModItems.ALCHEMICAL_IRON_NUGGET.get());
                        output.accept(ModItems.OBSIDIAN_INGOT.get());


                        output.accept(ModItems.BASIC_WAND.get());
                        output.accept(ModItems.APPRENTICE_WAND.get());
                        output.accept(ModItems.ENHANCED_WAND.get());
                        output.accept(ModItems.ADVANCED_WAND.get());
                        output.accept(ModItems.EXPERT_WAND.get());
                        output.accept(ModItems.MASTER_WAND.get());




                        output.accept(ModBlocks.BLOOD_DIAMOND_BLOCK.get());
                        output.accept(ModBlocks.ALCHEMICAL_IRON_BLOCK.get());




                        output.accept(ModBlocks.RUBBER_LOG.get());
                        output.accept(ModBlocks.RUBBER_WOOD.get());
                        output.accept(ModBlocks.STRIPPED_RUBBER_LOG.get());
                        output.accept(ModBlocks.STRIPPED_RUBBER_WOOD.get());
                        output.accept(ModBlocks.RUBBER_PLANKS.get());
                        output.accept(ModBlocks.RUBBER_LEAVES.get());
                        output.accept(ModBlocks.RUBBER_SAPLING.get());
                        output.accept(ModBlocks.RUBBER_BUTTON.get());
                        output.accept(ModBlocks.RUBBER_PRESSURE_PLATE.get());

                        output.accept(ModItems.STEEL_SWORD.get());
                        output.accept(ModItems.STEEL_PICKAXE.get());
                        output.accept(ModItems.STEEL_SHOVEL.get());
                        output.accept(ModItems.STEEL_AXE.get());
                        output.accept(ModItems.STEEL_HOE.get());
                        output.accept(ModItems.STEEL_PAXEL.get());

                        output.accept(ModItems.DIAMOND_PAXEL.get());
                        output.accept(ModItems.GOLD_PAXEL.get());
                        output.accept(ModItems.IRON_PAXEL.get());


                        output.accept(ModItems.TREE_TAP.get());


                        output.accept(ModItems.SMURFBERRIES.get());


                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
