package com.drizzs.runetools.tools;

import com.drizzs.runetools.init.RudeItems;
import com.drizzs.runetools.init.RudeMaterials;
import com.drizzs.runetools.tools.axe.*;
import com.drizzs.runetools.tools.pickaxe.*;
import com.drizzs.runetools.tools.shovel.*;
import com.drizzs.runetools.util.RudeItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class RudeTools
{
    public static void init()
    {
        RudeItems.numbiouspick = new NumbiousPick(RudeMaterials.numbious, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("numbiouspick"));
        RudeItems.numbiousaxe = new NumbiousAxe(RudeMaterials.numbious, 6.0f, 6, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("numbiousaxe"));
        RudeItems.numbiousshovel = new NumbiousShovel(RudeMaterials.numbious, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("numbiousshovel"));
        RudeItems.destitutepick = new DestitutePick(RudeMaterials.destitute, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("destitutepick"));
        RudeItems.destituteaxe = new DestituteAxe(RudeMaterials.destitute, 0, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("destituteaxe"));
        RudeItems.destituteshovel = new DestituteShovel(RudeMaterials.destitute, -1.0f, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("destituteshovel"));
        RudeItems.yamiumpick = new YamiumPick(RudeMaterials.yamium, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("yamiumpick"));
        RudeItems.yamiumaxe = new YamiumAxe(RudeMaterials.yamium, -2, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("yamiumaxe"));
        RudeItems.yamiumshovel = new YamiumShovel(RudeMaterials.yamium, -3.0f, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("yamiumshovel"));
        RudeItems.rudiouspick = new RudiousPick(RudeMaterials.rudious, 0, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("rudiouspick"));
        RudeItems.rudiousaxe = new RudiousAxe(RudeMaterials.rudious, -1.0f, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("rudiousaxe"));
        RudeItems.rudiousshovel = new RudiousShovel(RudeMaterials.rudious, 6.0f, 8, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("rudiousshovel"));
        RudeItems.megapick = new MegaPick(RudeMaterials.mega, -2, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("megapick"));
        RudeItems.megaaxe = new MegaAxe(RudeMaterials.mega, -3.0f, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("megaaxe"));
        RudeItems.megashovel = new MegaShovel(RudeMaterials.mega, 0, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("megashovel"));
        RudeItems.supermegapick = new SuperPick(RudeMaterials.supermega, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("superpick"));
        RudeItems.supermegaaxe = new SuperAxe(RudeMaterials.supermega, 6.0f, 7, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("superaxe"));
        RudeItems.supermegashovel = new SuperShovel(RudeMaterials.supermega, -2, 6.0f, new Item.Properties().group(RudeItemGroup.instance)).setRegistryName(location("supershovel"));


    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation("rudetools", name);
    }
}
