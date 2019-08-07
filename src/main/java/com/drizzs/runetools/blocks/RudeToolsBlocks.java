package com.drizzs.runetools.blocks;

import com.drizzs.runetools.init.RudeBlocks;
import com.drizzs.runetools.util.RudeItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;

public class RudeToolsBlocks
{
    public static void init()
    {

        RudeBlocks.numbiousore = registerBlock(new Block((Block.Properties.create(Material.ROCK).hardnessAndResistance(7).sound(SoundType.STONE))), "numbiousore");
        RudeBlocks.destituteore = registerBlock(new Block((Block.Properties.create(Material.ROCK).hardnessAndResistance(9).sound(SoundType.STONE))), "destituteore");
        RudeBlocks.yamiumore = registerBlock(new Block((Block.Properties.create(Material.ROCK).hardnessAndResistance(10).sound(SoundType.STONE))), "yamiumore");
        RudeBlocks.rudiousore = registerBlock(new Block((Block.Properties.create(Material.ROCK).hardnessAndResistance(12).sound(SoundType.STONE))), "rudiousore");

        RudeBlocks.numbiousblock = registerBlock(new Block((Block.Properties.create(Material.IRON).hardnessAndResistance(7).sound(SoundType.METAL))), "numbiousblock");
        RudeBlocks.destituteblock = registerBlock(new Block((Block.Properties.create(Material.IRON).hardnessAndResistance(9).sound(SoundType.METAL))), "destituteblock");
        RudeBlocks.yamiumblock = registerBlock(new Block((Block.Properties.create(Material.IRON).hardnessAndResistance(10).sound(SoundType.METAL))), "yamiumblock");
        RudeBlocks.rudiousblock = registerBlock(new Block((Block.Properties.create(Material.IRON).hardnessAndResistance(12).sound(SoundType.METAL))), "rudiousblock");




    }


    public static Block registerBlock(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(RudeItemGroup.instance));
        block.setRegistryName(name);
        itemBlock.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }

    public static Block registerBlock(Block block, BlockItem itemBlock, String name)
    {
        block.setRegistryName(name);
        ForgeRegistries.BLOCKS.register(block);

        if (itemBlock != null)
        {
            itemBlock.setRegistryName(name);
            ForgeRegistries.ITEMS.register(itemBlock);
        }

        return block;
    }



}
