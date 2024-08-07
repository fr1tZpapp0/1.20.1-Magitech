package net.fritz.magitech.datagen;

import net.fritz.magitech.Magitech;
import net.fritz.magitech.block.ModBlocks;
import net.fritz.magitech.item.ModItems;
import net.fritz.magitech.util.ModTags;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> TIN_SMELTABLES = List.of(
            ModItems.RAW_TIN.get(),
            ModBlocks.TIN_ORE.get(),
            ModBlocks.DEEPSLATE_TIN_ORE.get()
    );

    private static final List<ItemLike> RUBBER_TO_LATEX = List.of(
            ModBlocks.RUBBER_LOG.get(),
            ModBlocks.RUBBER_WOOD.get()
    );



    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.WIRE_SPOOL.get(), 3)
                .pattern("AAA")
                .pattern("BBB")
                .pattern("AAA")
                .define('A', Items.COPPER_INGOT)
                .define('B', ModItems.RUBBER.get())
                .unlockedBy("has_tin_ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TIN_INGOT.get()).build()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BASIC_ESSENCE_ORB.get())
                .pattern("BBB")
                .pattern("BNB")
                .pattern("BBB")
                .define('N', Items.NETHER_STAR)
                .define('B', ModItems.BLOOD_DIAMOND.get())
                .unlockedBy("has_blood_diamond", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BLOOD_DIAMOND.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENHANCED_ESSENCE_ORB.get())
                .pattern("BBB")
                .pattern("BNB")
                .pattern("BBB")
                .define('N', ModItems.BASIC_ESSENCE_ORB.get())
                .define('B', Items.GOLD_INGOT)
                .unlockedBy("has_basic_essence_orb", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.BASIC_ESSENCE_ORB.get()).build()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ADVANCED_ESSENCE_ORB.get())
                .pattern("BBB")
                .pattern("BNB")
                .pattern("BBB")
                .define('N', ModItems.ENHANCED_ESSENCE_ORB.get())
                .define('B', Items.DIAMOND)
                .unlockedBy("has_enhanced_essence_orb", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ENHANCED_ESSENCE_ORB.get()).build()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MASTER_ESSENCE_ORB.get())
                .pattern("BBB")
                .pattern("BNB")
                .pattern("BBB")
                .define('N', ModItems.ADVANCED_ESSENCE_ORB.get())
                .define('B', Items.EMERALD)
                .unlockedBy("has_advanced_essence_orb", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ADVANCED_ESSENCE_ORB.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ELDRITCH_ESSENCE_ORB.get())
                .pattern("IBI")
                .pattern("BNB")
                .pattern("ISI")
                .define('N', ModItems.MASTER_ESSENCE_ORB.get())
                .define('B', ModItems.BLOOD_DIAMOND.get())
                .define('I', ModItems.ALCHEMICAL_IRON_INGOT.get())
                .define('S', Items.ECHO_SHARD)
                .unlockedBy("has_master_essence_orb", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.MASTER_ESSENCE_ORB.get()).build()))
                .save(consumer);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.TREE_TAP.get())
                        .pattern(" P ")
                        .pattern("PPP")
                        .pattern("P  ")
                        .define('P', ItemTags.PLANKS)
                        .unlockedBy("has_planks", inventoryTrigger(ItemPredicate.Builder.item()
                                .of(ItemTags.PLANKS).build()))
                        .save(consumer);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BASIC_WAND.get())
                .pattern("  C")
                .pattern(" S ")
                .pattern("C  ")
                .define('S', Items.STICK)
                .define('C', ModItems.IRON_WAND_CAP.get())
                .unlockedBy("has_iron_wand_cap", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.IRON_WAND_CAP.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.APPRENTICE_WAND.get())
                .pattern("  C")
                .pattern(" S ")
                .pattern("C  ")
                .define('S', ModItems.BASIC_WAND.get())
                .define('C', ModItems.GOLD_WAND_CAP.get())
                .unlockedBy("has_gold_wand_cap", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.GOLD_WAND_CAP.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ENHANCED_WAND.get())
                .pattern("  C")
                .pattern(" S ")
                .pattern("C  ")
                .define('S', ModItems.APPRENTICE_WAND.get())
                .define('C', ModItems.DIAMOND_WAND_CAP.get())
                .unlockedBy("has_diamond_wand_cap", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.DIAMOND_WAND_CAP.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.ADVANCED_WAND.get())
                .pattern("  C")
                .pattern(" S ")
                .pattern("C  ")
                .define('S', ModItems.ENHANCED_WAND.get())
                .define('C', ModItems.ALCHEMICAL_IRON_WAND_CAP.get())
                .unlockedBy("has_diamond_wand_cap", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.DIAMOND_WAND_CAP.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.EXPERT_WAND.get())
                .pattern("  C")
                .pattern(" S ")
                .pattern("C  ")
                .define('S', ModItems.ADVANCED_WAND.get())
                .define('C', ModItems.BLOOD_DIAMOND_WAND_CAP.get())
                .unlockedBy("has_diamond_wand_cap", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.DIAMOND_WAND_CAP.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.MASTER_WAND.get())
                .pattern("ICI")
                .pattern("BSB")
                .pattern("ICI")
                .define('S', ModItems.EXPERT_WAND.get())
                .define('C', ModItems.OBSIDIAN_WAND_CAP.get())
                .define('I', ModItems.ALCHEMICAL_IRON_INGOT.get())
                .define('B', ModItems.BLOOD_DIAMOND.get())
                .unlockedBy("has_diamond_wand_cap", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.DIAMOND_WAND_CAP.get()).build()))
                .save(consumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBBER_PRESSURE_PLATE.get())
                .pattern("PP")
                .define('P', ModBlocks.RUBBER_PLANKS.get())
                .unlockedBy("has_rubber_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RUBBER_PLANKS.get()).build()))
                .save(consumer);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.RUBBER_BUTTON.get())
                .requires(ModBlocks.RUBBER_PLANKS.get())
                .unlockedBy("has_rubber_planks", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.RUBBER_PLANKS.get()).build()))
                .save(consumer);




        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_BLEND.get())
                .requires(ModItems.RAW_TIN.get())
                .requires(Items.RAW_COPPER)
                .unlockedBy("has_raw_copper", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.RAW_COPPER).build()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.LATEX.get())
                .requires(ModItems.TREE_TAP.get())
                .requires(ModBlocks.RUBBER_LOG.get())
                .unlockedBy("has_tree_tap", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TREE_TAP.get()).build()))
                .save(consumer);


        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get(), ModItems.TIN_INGOT.get(), "has_tin_ingot", ModItems.TIN_INGOT.get(), "tin_ingot_to_block");
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get(), ModItems.STEEL_INGOT.get(), "has_steel_ingot", ModItems.STEEL_INGOT.get(),"steel_ingot_to_block");
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get(), ModItems.URANIUM.get(), "has_uranium", ModItems.URANIUM.get(), "uranium_ingot_to_block");
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get(), ModItems.BRONZE_INGOT.get(), "has_bronze_ingot", ModItems.BRONZE_INGOT.get(), "bronze_ingot_to_block");
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get(), ModItems.RAW_TIN.get(), "has_raw_tin", ModItems.RAW_TIN.get(), "raw_tin_to_block");

        blockToNine(consumer, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), ModBlocks.TIN_BLOCK.get(), "has_tin_block", ModBlocks.TIN_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), ModBlocks.BRONZE_BLOCK.get(), "has_bronze_block", ModBlocks.BRONZE_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), ModBlocks.STEEL_BLOCK.get(), "has_steel_block", ModBlocks.STEEL_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.URANIUM.get(), ModBlocks.URANIUM_BLOCK.get(), "has_uranium_block", ModBlocks.URANIUM_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.RAW_TIN.get(), ModBlocks.RAW_TIN_BLOCK.get(), "has_raw_tin_block", ModBlocks.RAW_TIN_BLOCK.get());



        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.ALCHEMICAL_IRON_BLOCK.get(), ModItems.ALCHEMICAL_IRON_INGOT.get(), "has_alchemical_iron_ingot", ModItems.ALCHEMICAL_IRON_INGOT.get(), "alchemical_iron_ingot_to_block");
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.BLOOD_DIAMOND_BLOCK.get(), ModItems.BLOOD_DIAMOND.get(), "has_blood_diamond", ModItems.BLOOD_DIAMOND.get(), "blood_diamond_to_block");
        blockToNine(consumer, RecipeCategory.MISC, ModItems.ALCHEMICAL_IRON_INGOT.get(), ModBlocks.ALCHEMICAL_IRON_BLOCK.get(), "has_alchemical_iron_block", ModBlocks.ALCHEMICAL_IRON_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.BLOOD_DIAMOND.get(), ModBlocks.BLOOD_DIAMOND_BLOCK.get(), "has_blood_diamond_block", ModBlocks.BLOOD_DIAMOND_BLOCK.get());



        blockToNine(consumer, RecipeCategory.MISC, ModItems.DIAMOND_NUGGET.get(), Items.DIAMOND, "has_diamond", Items.DIAMOND);
        blockToNine(consumer, RecipeCategory.MISC, ModItems.OBSIDIAN_NUGGET.get(), ModItems.OBSIDIAN_INGOT.get(), "has_obsidian_ingot", ModItems.OBSIDIAN_INGOT.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.BLOOD_DIAMOND_NUGGET.get(), ModItems.BLOOD_DIAMOND.get(), "has_blood_diamond", ModItems.BLOOD_DIAMOND.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.ALCHEMICAL_IRON_NUGGET.get(), ModItems.ALCHEMICAL_IRON_INGOT.get(), "has_alchemical_iron_ingot", ModItems.ALCHEMICAL_IRON_INGOT.get());

        nineToBlock(consumer, RecipeCategory.MISC, Items.DIAMOND, ModItems.DIAMOND_NUGGET.get(), "has_diamond_nugget", ModItems.DIAMOND_NUGGET.get(), "diamond_nugget_to_ingot");
        nineToBlock(consumer, RecipeCategory.MISC, ModItems.OBSIDIAN_INGOT.get(), ModItems.OBSIDIAN_NUGGET.get(), "has_obsidian_nugget", ModItems.OBSIDIAN_NUGGET.get(), "obsidian_nugget_to_ingot");
        nineToBlock(consumer, RecipeCategory.MISC, ModItems.BLOOD_DIAMOND.get(), ModItems.BLOOD_DIAMOND_NUGGET.get(), "has_blood_diamond_nugget", ModItems.BLOOD_DIAMOND_NUGGET.get(), "blood_diamond_nugget_to_ingot");
        nineToBlock(consumer, RecipeCategory.MISC, ModItems.ALCHEMICAL_IRON_INGOT.get(), ModItems.ALCHEMICAL_IRON_NUGGET.get(), "has_alchemical_iron_nugget", ModItems.ALCHEMICAL_IRON_NUGGET.get(), "alchemical_iron_ingot_nugget_to_ingot");

        oreSmelting(consumer, List.of(Blocks.OBSIDIAN), RecipeCategory.MISC, ModItems.OBSIDIAN_INGOT.get(), 0.25f, 200, "obsidian_ingot");

        wandCapCrafter(consumer, RecipeCategory.MISC, ModItems.IRON_WAND_CAP.get(), Items.IRON_NUGGET, "has_iron_nugget", Items.IRON_NUGGET);
        wandCapCrafter(consumer, RecipeCategory.MISC, ModItems.GOLD_WAND_CAP.get(), Items.GOLD_NUGGET, "has_gold_nugget", Items.GOLD_NUGGET);
        wandCapCrafter(consumer, RecipeCategory.MISC, ModItems.DIAMOND_WAND_CAP.get(), ModItems.DIAMOND_NUGGET.get(), "has_diamond_nugget", ModItems.DIAMOND_NUGGET.get());
        wandCapCrafter(consumer, RecipeCategory.MISC, ModItems.BLOOD_DIAMOND_WAND_CAP.get(), ModItems.BLOOD_DIAMOND_NUGGET.get(), "has_blood_diamond_nugget", ModItems.BLOOD_DIAMOND_NUGGET.get());
        wandCapCrafter(consumer, RecipeCategory.MISC, ModItems.ALCHEMICAL_IRON_WAND_CAP.get(), ModItems.ALCHEMICAL_IRON_NUGGET.get(), "has_alchemical_iron_nugget", ModItems.ALCHEMICAL_IRON_NUGGET.get());
        wandCapCrafter(consumer, RecipeCategory.MISC, ModItems.OBSIDIAN_WAND_CAP.get(), ModItems.OBSIDIAN_NUGGET.get(), "has_obsidian_nugget", ModItems.OBSIDIAN_NUGGET.get());




        slabCrafter(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_SLAB.get(), ModBlocks.RUBBER_PLANKS.get(), "has_rubber_planks", ModBlocks.RUBBER_PLANKS.get());
        stairCrafter(consumer, RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_STAIRS.get(), ModBlocks.RUBBER_PLANKS.get(), "has_rubber_planks", ModBlocks.RUBBER_PLANKS.get());


        oreSmelting(consumer, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 200, "tin");
        oreBlasting(consumer, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 100, "tin");
        oreSmelting(consumer, List.of(ModItems.BRONZE_BLEND.get()), RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.25f, 200, "bronze");
        oreBlasting(consumer, List.of(ModItems.BRONZE_BLEND.get()), RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.25f, 100, "bronze");
        oreSmelting(consumer, List.of(Items.SLIME_BALL), RecipeCategory.MISC, ModItems.RUBBER.get(), 0.25f, 200, "rubber");
        oreSmelting(consumer, List.of(ModItems.LATEX.get()), RecipeCategory.MISC, ModItems.RUBBER.get(), 0.25f, 200, "rubber");
        oreSmelting(consumer, List.of(Items.IRON_INGOT), RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 200, "steel");
        oreBlasting(consumer, List.of(Items.IRON_INGOT), RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), 0.25f, 100, "steel");
        oreSmelting(consumer, List.of(ModBlocks.NETHER_URANIUM_ORE.get()), RecipeCategory.MISC, ModItems.URANIUM.get(), 0.25f, 200, "uranium");
        oreBlasting(consumer, List.of(ModBlocks.NETHER_URANIUM_ORE.get()), RecipeCategory.MISC, ModItems.URANIUM.get(), 0.25f, 100, "uranium");


        swordCrafting(consumer, RecipeCategory.TOOLS, ModItems.STEEL_SWORD.get(), ModItems.STEEL_INGOT.get(), "has_steel_ingot", ModItems.STEEL_INGOT.get());
        pickaxeCrafting(consumer, RecipeCategory.TOOLS, ModItems.STEEL_PICKAXE.get(), ModItems.STEEL_INGOT.get(), "has_steel_ingot", ModItems.STEEL_INGOT.get());
        shovelCrafting(consumer, RecipeCategory.TOOLS, ModItems.STEEL_SHOVEL.get(), ModItems.STEEL_INGOT.get(), "has_steel_ingot", ModItems.STEEL_INGOT.get());
        axeCrafting(consumer, RecipeCategory.TOOLS, ModItems.STEEL_AXE.get(), ModItems.STEEL_INGOT.get(), "has_steel_ingot", ModItems.STEEL_INGOT.get());
        hoeCrafting(consumer, RecipeCategory.TOOLS, ModItems.STEEL_HOE.get(), ModItems.STEEL_INGOT.get(), "has_steel_ingot", ModItems.STEEL_INGOT.get());

        paxelCrafting(consumer, RecipeCategory.TOOLS, ModItems.STEEL_PAXEL.get(), ModItems.STEEL_AXE.get(), ModItems.STEEL_SHOVEL.get(), ModItems.STEEL_PICKAXE.get(), "has_steel_ingot", ModItems.STEEL_INGOT.get());
        paxelCrafting(consumer, RecipeCategory.TOOLS, ModItems.DIAMOND_PAXEL.get(), Items.DIAMOND_AXE, Items.DIAMOND_SHOVEL, Items.DIAMOND_PICKAXE, "has_diamond", Items.DIAMOND);
        paxelCrafting(consumer, RecipeCategory.TOOLS, ModItems.GOLD_PAXEL.get(), Items.GOLDEN_AXE, Items.GOLDEN_SHOVEL, Items.GOLDEN_PICKAXE, "has_gold_ingot", Items.GOLD_INGOT);
        paxelCrafting(consumer, RecipeCategory.TOOLS, ModItems.IRON_PAXEL.get(), Items.IRON_AXE, Items.IRON_SHOVEL, Items.IRON_PICKAXE, "has_iron_ingot", Items.IRON_INGOT);



    }



    private static void nineToBlock(Consumer<FinishedRecipe> consumer,
                                     RecipeCategory category, ItemLike output, ItemLike input, String criteriaName, ItemLike criteriaItemLike, String secondary) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', input)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer, secondary);
    }

    private static void swordCrafting(Consumer<FinishedRecipe> consumer, RecipeCategory category,
                                   ItemLike output, ItemLike material, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("A")
                .pattern("A")
                .pattern("S")
                .define('A', material)
                .define('S', Items.STICK)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }

    private static void pickaxeCrafting(Consumer<FinishedRecipe> consumer, RecipeCategory category,
                                      ItemLike output, ItemLike material, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AAA")
                .pattern(" S ")
                .pattern(" S ")
                .define('A', material)
                .define('S', Items.STICK)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }

    private static void paxelCrafting(Consumer<FinishedRecipe> consumer, RecipeCategory category,
                                        ItemLike output, ItemLike axeMat, ItemLike shovelMat, ItemLike pickaxeMat, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("ASP")
                .pattern(" T ")
                .pattern(" T ")
                .define('A', axeMat)
                .define('S', shovelMat)
                .define('P', pickaxeMat)
                .define('T', Items.STICK)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }



    private static void axeCrafting(Consumer<FinishedRecipe> consumer, RecipeCategory category,
                                      ItemLike output, ItemLike material, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AA")
                .pattern("AS")
                .pattern(" S")
                .define('A', material)
                .define('S', Items.STICK)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }


    private static void shovelCrafting(Consumer<FinishedRecipe> consumer, RecipeCategory category,
                                    ItemLike output, ItemLike material, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("A")
                .pattern("S")
                .pattern("S")
                .define('A', material)
                .define('S', Items.STICK)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }

    private static void hoeCrafting(Consumer<FinishedRecipe> consumer, RecipeCategory category,
                                    ItemLike output, ItemLike material, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AA")
                .pattern(" S")
                .pattern(" S")
                .define('A', material)
                .define('S', Items.STICK)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }


    private static void stairCrafter(Consumer<FinishedRecipe> consumer,
                                    RecipeCategory category, ItemLike output, ItemLike input, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("A  ")
                .pattern("AA ")
                .pattern("AAA")
                .define('A', input)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }

    private static void slabCrafter(Consumer<FinishedRecipe> consumer,
                                     RecipeCategory category, ItemLike output, ItemLike input, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AAA")
                .define('A', input)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }


    private static void wandCapCrafter(Consumer<FinishedRecipe> consumer, RecipeCategory category,
                                        ItemLike output, ItemLike nugget, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AAA")
                .pattern("A A")
                .define('A', nugget)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }



    private static void blockToNine(Consumer<FinishedRecipe> consumer, RecipeCategory category,
                                    ItemLike output, ItemLike input, String criteriaName, ItemLike criteriaItemLike) {
        ShapelessRecipeBuilder.shapeless(category, output, 9)
                .requires(input)
                .unlockedBy(criteriaName, inventoryTrigger(ItemPredicate.Builder.item()
                        .of(criteriaItemLike).build()))
                .save(consumer);
    }


    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory,
                                      ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory,
                                      ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe>
            pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        Iterator var9 = pIngredients.iterator();

        while (var9.hasNext()) {
            ItemLike itemlike = (ItemLike) var9.next();
            SimpleCookingRecipeBuilder.generic(Ingredient.of(new ItemLike[]{itemlike}), pCategory, pResult, pExperience, pCookingTime,
                    pCookingSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer, Magitech.MOD_ID + ":" + (pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }




}

