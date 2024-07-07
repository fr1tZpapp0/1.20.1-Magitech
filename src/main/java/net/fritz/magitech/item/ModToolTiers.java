package net.fritz.magitech.item;

import net.fritz.magitech.Magitech;
import net.fritz.magitech.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier STEEL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1225, 7f, 2.5f, 18, ModTags.Blocks.NEEDS_STEEL_TOOL,
                    () -> Ingredient.of(ModItems.STEEL_INGOT.get())),
            new ResourceLocation(Magitech.MOD_ID, "steel"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));


}
