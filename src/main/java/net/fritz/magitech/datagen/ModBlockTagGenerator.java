package net.fritz.magitech.datagen;

import net.fritz.magitech.Magitech;
import net.fritz.magitech.block.ModBlocks;
import net.fritz.magitech.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Magitech.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.BRONZE_BLOCK.get(),
                ModBlocks.STEEL_BLOCK.get(),
                ModBlocks.BRONZE_BLOCK.get(),
                ModBlocks.URANIUM_BLOCK.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.TIN_ORE.get(),
                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.DEEPSLATE_TIN_ORE.get(),
                ModBlocks.NETHER_URANIUM_ORE.get(),

                ModBlocks.OBELISK.get(),
                ModBlocks.RITUAL_STONE.get(),
                ModBlocks.ALCHEMICAL_IRON_BLOCK.get(),
                ModBlocks.BLOOD_DIAMOND_BLOCK.get()
        );

        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
          ModBlocks.RUBBER_STAIRS.get(),
          ModBlocks.RUBBER_SLAB.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                ModBlocks.BRONZE_BLOCK.get(),
                ModBlocks.STEEL_BLOCK.get(),
                ModBlocks.BRONZE_BLOCK.get(),
                ModBlocks.RAW_TIN_BLOCK.get(),
                ModBlocks.TIN_BLOCK.get(),
                ModBlocks.TIN_ORE.get(),
                ModBlocks.DEEPSLATE_TIN_ORE.get(),
                ModBlocks.ALCHEMICAL_IRON_BLOCK.get(),
                ModBlocks.RITUAL_STONE.get()
        );

        this.tag(ModTags.Blocks.PAXEL_MINEABLE).addTags(
                BlockTags.MINEABLE_WITH_PICKAXE,
                BlockTags.MINEABLE_WITH_AXE,
                BlockTags.MINEABLE_WITH_SHOVEL);

        this.tag(ModTags.Blocks.NEEDS_STEEL_TOOL).add(
                ModBlocks.URANIUM_BLOCK.get(),
                ModBlocks.NETHER_URANIUM_ORE.get()
        );


        this.tag(BlockTags.LOGS_THAT_BURN).add(
                ModBlocks.RUBBER_LOG.get(),
                ModBlocks.RUBBER_WOOD.get(),
                ModBlocks.STRIPPED_RUBBER_LOG.get(),
                ModBlocks.STRIPPED_RUBBER_WOOD.get()
                );

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.RUBBER_PLANKS.get());


        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                ModBlocks.OBELISK.get(),
                ModBlocks.BLOOD_DIAMOND_BLOCK.get()
        );


    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
