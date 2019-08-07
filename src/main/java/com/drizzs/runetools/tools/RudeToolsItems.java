package com.drizzs.runetools.tools;

import com.drizzs.runetools.init.RudeItems;
import com.drizzs.runetools.init.RudeMaterials;
import com.drizzs.runetools.tools.axe.*;
import com.drizzs.runetools.tools.pickaxe.*;
import com.drizzs.runetools.tools.shovel.*;
import com.drizzs.runetools.util.RudeItemGroup;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class RudeToolsItems
{
    public static void init()
    {
        RudeItems.numbiouspick = registerItem(new NumbiousPick(RudeMaterials.numbious, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"numbiouspick");
        RudeItems.numbiousaxe = registerItem(new NumbiousAxe(RudeMaterials.numbious, 6.0f, 6, new Item.Properties().group(RudeItemGroup.instance)),"numbiousaxe");
        RudeItems.numbiousshovel = registerItem(new NumbiousShovel(RudeMaterials.numbious, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"numbiousshovel");
        RudeItems.destitutepick = registerItem(new DestitutePick(RudeMaterials.destitute, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"destitutepick");
        RudeItems.destituteaxe = registerItem(new DestituteAxe(RudeMaterials.destitute, 0, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"destituteaxe");
        RudeItems.destituteshovel = registerItem(new DestituteShovel(RudeMaterials.destitute, -1.0f, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"destituteshovel");
        RudeItems.yamiumpick = registerItem(new YamiumPick(RudeMaterials.yamium, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"yamiumpick");
        RudeItems.yamiumaxe = registerItem(new YamiumAxe(RudeMaterials.yamium, -2, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"yamiumaxe");
        RudeItems.yamiumshovel = registerItem(new YamiumShovel(RudeMaterials.yamium, -3.0f, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"yamiumshovel");
        RudeItems.rudiouspick = registerItem(new RudiousPick(RudeMaterials.rudious, 0, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"rudiouspick");
        RudeItems.rudiousaxe = registerItem(new RudiousAxe(RudeMaterials.rudious, -1.0f, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"rudiousaxe");
        RudeItems.rudiousshovel = registerItem(new RudiousShovel(RudeMaterials.rudious, 6.0f, 8, new Item.Properties().group(RudeItemGroup.instance)),"rudiousshovel");
        RudeItems.megapick = registerItem(new MegaPick(RudeMaterials.mega, -2, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"megapick");
        RudeItems.megaaxe = registerItem(new MegaAxe(RudeMaterials.mega, -3.0f, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"megaaxe");
        RudeItems.megashovel = registerItem(new MegaShovel(RudeMaterials.mega, 0, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"megashovel");
        RudeItems.supermegapick = registerItem(new SuperPick(RudeMaterials.supermega, 4, 6.0f, new Item.Properties().group(RudeItemGroup.instance)),"superpick");
        RudeItems.supermegaaxe = registerItem(new SuperAxe(RudeMaterials.supermega, 6.0f, 7, new Item.Properties().group(RudeItemGroup.instance)),"superaxe");
        RudeItems.supermegashovel = registerItem(new SuperShovel(RudeMaterials.supermega, -2, 6.0f, new Item.Properties().group(RudeItemGroup.instance)), "supershovel");

        RudeItems.destitute_ingot = registerItem(new Item(new Item.Properties()), "numbious_ingot");
        RudeItems.numbious_ingot = registerItem(new Item(new Item.Properties()), "destitute_ingot");
        RudeItems.rudious_ingot = registerItem(new Item(new Item.Properties()), "rudious_ingot");
        RudeItems.yamium_ingot = registerItem(new Item(new Item.Properties()), "yamium_ingot");
        RudeItems.mega_ingot = registerItem(new Item(new Item.Properties()), "mega_ingot");
        RudeItems.rude_icon = registerItem(new Item(new Item.Properties()), "rude_icon");
    }

    public static Item registerItem(Item item, String name)
    {
        item.setRegistryName(name);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }

    public static ResourceLocation location(String name)
    {
        return new ResourceLocation("rudetools", name);
    }
}
