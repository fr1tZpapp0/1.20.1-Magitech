package net.fritz.magitech.datagen.loot;

import net.fritz.magitech.block.ModBlocks;
import net.fritz.magitech.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.TIN_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_TIN_BLOCK.get());
        this.dropSelf(ModBlocks.URANIUM_BLOCK.get());
        this.dropSelf(ModBlocks.STEEL_BLOCK.get());
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());

        this.dropSelf(ModBlocks.OBELISK.get());
        this.dropSelf(ModBlocks.ALCHEMICAL_IRON_BLOCK.get());
        this.dropSelf(ModBlocks.BLOOD_DIAMOND_BLOCK.get());

        this.dropSelf(ModBlocks.RUBBER_WOOD.get());
        this.dropSelf(ModBlocks.RUBBER_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_RUBBER_WOOD.get());
        this.dropSelf(ModBlocks.STRIPPED_RUBBER_LOG.get());
        this.dropSelf(ModBlocks.RUBBER_PLANKS.get());
        this.dropSelf(ModBlocks.RUBBER_SAPLING.get());

        this.add(ModBlocks.RUBBER_LEAVES.get(), block -> createLeavesDrops(block, ModBlocks.RUBBER_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.TIN_ORE.get(), block -> createOreDrop(ModBlocks.TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.DEEPSLATE_TIN_ORE.get(), block -> createOreDrop(ModBlocks.DEEPSLATE_TIN_ORE.get(), ModItems.RAW_TIN.get()));
        this.add(ModBlocks.NETHER_URANIUM_ORE.get(), block -> createOreDrop(ModBlocks.NETHER_URANIUM_ORE.get(), ModItems.URANIUM.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
