package com.reapersremorse.ssa.world.gen;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.init.minecraftextras.item.BlockInit;
import com.reapersremorse.ssa.init.minecraftextras.item.ItemInit;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = SanctuarySkyAddon.MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class SSAOreGen {

    public static OreFeatureConfig.FillerBlockType END_STONE = OreFeatureConfig.FillerBlockType.create("END_STONE",
            "end_stone", new BlockMatcher(Blocks.END_STONE));

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            //Nether Generation
            if (biome.getCategory() == Biome.Category.NETHER) {
                //genOre(biome, 12, 5, 5, 80, OreFeatureConfig.FillerBlockType.NETHERRACK, BlockInit.RUBY_ORE.get().getDefaultState(), 4);
                //End Generation
            } else if (biome.getCategory() == Biome.Category.THEEND) {
                //genOre(biome, 18, 3, 5, 80, END_STONE, BlockInit.RUBY_ORE.get().getDefaultState(), 12);
                //World Generation
            } else {
                genOre(biome, 15, 8, 5, 256, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SUCROSITE_ORE.get().getDefaultState(), 8);
                genOre(biome, 15, 8, 0, 128, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.AKRUTRIUM_ORE.get().getDefaultState(), 8);
                genOre(biome, 15, 8, 0, 64, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.BROERIUM_ORE.get().getDefaultState(), 7);
                genOre(biome, 15, 8, 0, 54, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.BROKIUM_ORE.get().getDefaultState(), 7);
                genOre(biome, 15, 8, 0, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.CHARKITE_ORE.get().getDefaultState(), 6);
                genOre(biome, 15, 8, 0, 45, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.GENERITE_ORE.get().getDefaultState(), 6);
                genOre(biome, 15, 8, 0, 40, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.HAGLUM_ORE.get().getDefaultState(), 5);
                genOre(biome, 15, 8, 0, 35, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.KRETINE_ORE.get().getDefaultState(), 5);
                genOre(biome, 15, 8, 0, 30, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.MOGLYX_ORE.get().getDefaultState(), 4);
                genOre(biome, 15, 8, 0, 25, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.PLAYTRIUM_ORE.get().getDefaultState(), 4);
                genOre(biome, 15, 8, 0, 20, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.SPIYTRIUM_ORE.get().getDefaultState(), 3);
                genOre(biome, 15, 8, 0, 15, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.WOFLUOITE_ORE.get().getDefaultState(), 3);
                genOre(biome, 15, 8, 0, 10, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.WOULFITE_ORE.get().getDefaultState(), 2);
                genOre(biome, 15, 3, 0, 8, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.QUINTIUM_ORE.get().getDefaultState(), 2);
                genOre(biome, 15, 3, 0, 8, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.VOIDIUM_ORE.get().getDefaultState(), 1);
                genOre(biome, 15, 3, 0, 8, OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.REAPERITE_ORE.get().getDefaultState(), 1);
            }
        }
    }

    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size) {
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));
    }
}
