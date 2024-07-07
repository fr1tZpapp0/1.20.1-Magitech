package net.fritz.magitech.datagen;

import net.fritz.magitech.Magitech;
import net.fritz.magitech.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Magitech.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.BRONZE_BLEND);
        simpleItem(ModItems.BRONZE_INGOT);
        simpleItem(ModItems.BRONZE_PLATE);

        simpleItem(ModItems.RAW_TIN);
        simpleItem(ModItems.TIN_INGOT);
        simpleItem(ModItems.TIN_PLATE);

        simpleItem(ModItems.STEEL_INGOT);
        simpleItem(ModItems.STEEL_PLATE);

        simpleItem(ModItems.DIAMOND_PLATE);
        simpleItem(ModItems.GOLD_PLATE);
        simpleItem(ModItems.IRON_PLATE);
        simpleItem(ModItems.NETHERITE_PLATE);

        simpleItem(ModItems.URANIUM);
        simpleItem(ModItems.RUBBER);
        simpleItem(ModItems.WIRE_SPOOL);

        handheldItem(ModItems.STEEL_SWORD);
        handheldItem(ModItems.STEEL_PICKAXE);
        handheldItem(ModItems.STEEL_SHOVEL);
        handheldItem(ModItems.STEEL_AXE);
        handheldItem(ModItems.STEEL_HOE);

    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/generated"))
                .texture("layer0", new ResourceLocation(Magitech.MOD_ID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), new ResourceLocation("item/handheld"))
                .texture("layer0", new ResourceLocation(Magitech.MOD_ID, "item/" + item.getId().getPath()));
    }

}
