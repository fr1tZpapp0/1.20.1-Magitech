package net.fritz.magitech.datagen;

import net.fritz.magitech.Magitech;
import net.fritz.magitech.block.ModBlocks;
import net.fritz.magitech.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
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

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BRONZE_BLEND.get())
                .requires(ModItems.RAW_TIN.get())
                .requires(Items.RAW_COPPER)
                .unlockedBy("has_raw_copper", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.RAW_COPPER).build()))
                .save(consumer);

        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.TIN_BLOCK.get(), ModItems.TIN_INGOT.get(), "has_tin_ingot", ModItems.TIN_INGOT.get());
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.STEEL_BLOCK.get(), ModItems.STEEL_INGOT.get(), "has_steel_ingot", ModItems.STEEL_INGOT.get());
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.URANIUM_BLOCK.get(), ModItems.URANIUM.get(), "has_uranium", ModItems.URANIUM.get());
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK.get(), ModItems.BRONZE_INGOT.get(), "has_bronze_ingot", ModItems.BRONZE_INGOT.get());
        nineToBlock(consumer, RecipeCategory.MISC, ModBlocks.RAW_TIN_BLOCK.get(), ModItems.RAW_TIN.get(), "has_raw_tin", ModItems.RAW_TIN.get());

        blockToNine(consumer, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), ModBlocks.TIN_BLOCK.get(), "has_tin_block", ModBlocks.TIN_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), ModBlocks.BRONZE_BLOCK.get(), "has_bronze_block", ModBlocks.BRONZE_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.STEEL_INGOT.get(), ModBlocks.STEEL_BLOCK.get(), "has_steel_block", ModBlocks.STEEL_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.URANIUM.get(), ModBlocks.URANIUM_BLOCK.get(), "has_uranium_block", ModBlocks.URANIUM_BLOCK.get());
        blockToNine(consumer, RecipeCategory.MISC, ModItems.RAW_TIN.get(), ModBlocks.RAW_TIN_BLOCK.get(), "has_raw_tin_block", ModBlocks.RAW_TIN_BLOCK.get());

        oreSmelting(consumer, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 200, "tin");
        oreBlasting(consumer, TIN_SMELTABLES, RecipeCategory.MISC, ModItems.TIN_INGOT.get(), 0.25f, 100, "tin");

        oreSmelting(consumer, List.of(ModItems.BRONZE_BLEND.get()), RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.25f, 200, "bronze");
        oreBlasting(consumer, List.of(ModItems.BRONZE_BLEND.get()), RecipeCategory.MISC, ModItems.BRONZE_INGOT.get(), 0.25f, 100, "bronze");
    }



    private static void nineToBlock(Consumer<FinishedRecipe> consumer,
                                     RecipeCategory category, ItemLike output, ItemLike input, String criteriaName, ItemLike criteriaItemLike) {
        ShapedRecipeBuilder.shaped(category, output)
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', input)
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

