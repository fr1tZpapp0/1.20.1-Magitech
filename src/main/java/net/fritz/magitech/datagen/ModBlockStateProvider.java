package net.fritz.magitech.datagen;

import net.fritz.magitech.Magitech;
import net.fritz.magitech.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Magitech.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BRONZE_BLOCK);
        blockWithItem(ModBlocks.URANIUM_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
        blockWithItem(ModBlocks.TIN_BLOCK);
        blockWithItem(ModBlocks.RAW_TIN_BLOCK);
        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);
        blockWithItem(ModBlocks.NETHER_URANIUM_ORE);


        blockWithItem(ModBlocks.OBELISK);
        blockWithItem(ModBlocks.RITUAL_STONE);
        blockWithItem(ModBlocks.ALCHEMICAL_IRON_BLOCK);
        blockWithItem(ModBlocks.BLOOD_DIAMOND_BLOCK);

        logBlock(((RotatedPillarBlock) ModBlocks.RUBBER_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.RUBBER_WOOD.get()), blockTexture(ModBlocks.RUBBER_LOG.get()), blockTexture(ModBlocks.RUBBER_LOG.get()));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_RUBBER_LOG.get(), new ResourceLocation(Magitech.MOD_ID, "block/stripped_rubber_log"),
                new ResourceLocation(Magitech.MOD_ID, "block/stripped_rubber_log_top"));

        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_RUBBER_WOOD.get(), new ResourceLocation(Magitech.MOD_ID, "block/stripped_rubber_log"),
                new ResourceLocation(Magitech.MOD_ID, "block/stripped_rubber_log"));


        blockItem(ModBlocks.RUBBER_LOG);
        blockItem(ModBlocks.RUBBER_WOOD);
        blockItem(ModBlocks.STRIPPED_RUBBER_LOG);
        blockItem(ModBlocks.STRIPPED_RUBBER_WOOD);

        blockWithItem(ModBlocks.RUBBER_PLANKS);

        leavesBlock(ModBlocks.RUBBER_LEAVES);
        saplingBlock(ModBlocks.RUBBER_SAPLING);


        stairsBlock((StairBlock) ModBlocks.RUBBER_STAIRS.get(), blockTexture(ModBlocks.RUBBER_PLANKS.get()));
        slabBlock((SlabBlock) ModBlocks.RUBBER_SLAB.get(), blockTexture(ModBlocks.RUBBER_PLANKS.get()), blockTexture(ModBlocks.RUBBER_PLANKS.get()));
        buttonBlock((ButtonBlock) ModBlocks.RUBBER_BUTTON.get(), blockTexture(ModBlocks.RUBBER_PLANKS.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.RUBBER_PRESSURE_PLATE.get(), blockTexture(ModBlocks.RUBBER_PLANKS.get()));

        blockItem(ModBlocks.RUBBER_STAIRS);
        blockItem(ModBlocks.RUBBER_SLAB);
        blockItem(ModBlocks.RUBBER_PRESSURE_PLATE);




    }


    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().cubeAll(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(),
                        blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }



    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("magitech:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("magitech:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }



}
