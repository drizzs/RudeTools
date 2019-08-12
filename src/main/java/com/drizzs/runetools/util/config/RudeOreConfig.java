package com.drizzs.runetools.util.config;

import com.drizzs.runetools.init.RudeBlocks;
import net.minecraftforge.common.ForgeConfigSpec;

public class RudeOreConfig
{
    public static ForgeConfigSpec.IntValue Rude_Chance;
    public static ForgeConfigSpec.BooleanValue Overworld_Generation;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client)
    {
        server.comment("RudeOre Config");

        Rude_Chance = server
                .comment("Maximum number of ore veins of the Rude Ore that can spawn in one chunk.")
                .defineInRange("oregen.Rude_Chance", 20, 1, 1000000);

        Overworld_Generation = server
                .comment("Decide if you want Rude Ores to spawn in the overworld")
                .define("oregen.Overworld_Generation", true);
    }
}
