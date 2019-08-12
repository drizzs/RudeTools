package com.drizzs.runetools;

import com.drizzs.runetools.init.RudeBlocks;
import com.drizzs.runetools.util.config.RudeOreConfig;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class RudeOre
{


        public static void setupOreGeneration()
        {
            if(RudeOreConfig.Overworld_Generation.get())
            {
                for(Biome biome : ForgeRegistries.BIOMES)
                {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, RudeBlocks.destituteore.getDefaultState(), RudeOreConfig.Rude_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, RudeBlocks.numbiousore.getDefaultState(), RudeOreConfig.Rude_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RudeBlocks.rudiousore.getDefaultState(), RudeOreConfig.Rude_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE, new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, RudeBlocks.yamiumore.getDefaultState(), RudeOreConfig.Rude_Chance.get()), Placement.COUNT_RANGE, new CountRangeConfig(10, 20, 0, 100)));

                }
            }
        }


}
