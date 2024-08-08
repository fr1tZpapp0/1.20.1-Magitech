package net.fritz.magitech.item;

import net.fritz.magitech.Magitech;
import net.fritz.magitech.item.custom.PaxelItem;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Magitech.MOD_ID);

    // ===== BEGIN ITEMS =====


    // TECH ITEMS
    public static final RegistryObject<Item> RAW_TIN = ITEMS.register("raw_tin", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TIN_INGOT = ITEMS.register("tin_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_BLEND = ITEMS.register("bronze_blend", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TIN_PLATE = ITEMS.register("tin_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZE_PLATE = ITEMS.register("bronze_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_PLATE = ITEMS.register("steel_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_PLATE = ITEMS.register("iron_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_PLATE = ITEMS.register("gold_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_PLATE = ITEMS.register("diamond_plate", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_PLATE = ITEMS.register("netherite_plate", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> URANIUM = ITEMS.register("uranium", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WIRE_SPOOL = ITEMS.register("wire_spool", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBBER = ITEMS.register("rubber", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LATEX = ITEMS.register("latex", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TREE_TAP = ITEMS.register("tree_tap",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static final RegistryObject<Item> STEEL_SWORD = ITEMS.register("steel_sword",
            () -> new SwordItem(ModToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_PICKAXE = ITEMS.register("steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_SHOVEL = ITEMS.register("steel_shovel",
            () -> new ShovelItem(ModToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_AXE = ITEMS.register("steel_axe",
            () -> new AxeItem(ModToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> STEEL_HOE = ITEMS.register("steel_hoe",
            () -> new HoeItem(ModToolTiers.STEEL, 2, 3, new Item.Properties()));


    public static final RegistryObject<Item> STEEL_PAXEL = ITEMS.register("steel_paxel",
            () -> new PaxelItem(ModToolTiers.STEEL, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_PAXEL = ITEMS.register("diamond_paxel",
            () -> new PaxelItem(Tiers.DIAMOND, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> GOLD_PAXEL = ITEMS.register("gold_paxel",
            () -> new PaxelItem(Tiers.GOLD, 2, 3, new Item.Properties()));

    public static final RegistryObject<Item> IRON_PAXEL = ITEMS.register("iron_paxel",
            () -> new PaxelItem(Tiers.IRON, 2, 3, new Item.Properties()));



    // MAGICAL ITEMS
    public static final RegistryObject<Item> ALCHEMICAL_IRON_INGOT = ITEMS.register("alchemical_iron_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_DIAMOND = ITEMS.register("blood_diamond", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> IRON_WAND_CAP = ITEMS.register("iron_wand_cap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_WAND_CAP = ITEMS.register("gold_wand_cap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_WAND_CAP = ITEMS.register("diamond_wand_cap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALCHEMICAL_IRON_WAND_CAP = ITEMS.register("alchemical_iron_wand_cap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_DIAMOND_WAND_CAP = ITEMS.register("blood_diamond_wand_cap", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_WAND_CAP = ITEMS.register("obsidian_wand_cap", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_NUGGET = ITEMS.register("diamond_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALCHEMICAL_IRON_NUGGET = ITEMS.register("alchemical_iron_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_DIAMOND_NUGGET = ITEMS.register("blood_diamond_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> OBSIDIAN_NUGGET = ITEMS.register("obsidian_nugget", () -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> BASIC_ESSENCE_ORB = ITEMS.register("basic_essence_orb",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ENHANCED_ESSENCE_ORB = ITEMS.register("enhanced_essence_orb",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_ESSENCE_ORB = ITEMS.register("advanced_essence_orb",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MASTER_ESSENCE_ORB = ITEMS.register("master_essence_orb",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ELDRITCH_ESSENCE_ORB = ITEMS.register("eldritch_essence_orb",
            () -> new Item(new Item.Properties().stacksTo(1)));



    public static final RegistryObject<Item> BASIC_WAND = ITEMS.register("basic_wand",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> APPRENTICE_WAND = ITEMS.register("apprentice_wand",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ENHANCED_WAND = ITEMS.register("enhanced_wand",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ADVANCED_WAND = ITEMS.register("advanced_wand",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EXPERT_WAND = ITEMS.register("expert_wand",
            () -> new Item(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MASTER_WAND = ITEMS.register("master_wand",
            () -> new Item(new Item.Properties().stacksTo(1)));


    public static final RegistryObject<Item> NECRONOMICON = ITEMS.register("necronomicon", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SACRIFICIAL_KNIFE = ITEMS.register("sacrificial_knife", () ->
            new SwordItem(Tiers.IRON, 1, 2, new Item.Properties()));
    public static final RegistryObject<Item> LILITHS_DAGGER = ITEMS.register("liliths_dagger", () ->
            new SwordItem(Tiers.DIAMOND, 3, 2, new Item.Properties()));
    public static final RegistryObject<Item> BLOOD_VIAL = ITEMS.register("blood_vial", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMOKEY_QUARTZ = ITEMS.register("smokey_quartz", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VILLAGER_FLESH = ITEMS.register("villager_flesh", () -> new Item(new Item.Properties()));


    // FOODS
    public static final RegistryObject<Item> SMURFBERRIES = ITEMS.register("smurfberries",
            () -> new Item(new Item.Properties().food(ModFoodProperties.SMURFBERRIES)));




    // ===== END ITEMS =====

    public static void register (IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
