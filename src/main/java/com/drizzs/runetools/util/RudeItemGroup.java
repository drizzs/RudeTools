package com.drizzs.runetools.util;

import com.drizzs.runetools.init.RudeItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class RudeItemGroup extends ItemGroup {

    public static final RudeItemGroup instance = new RudeItemGroup(ItemGroup.GROUPS.length, "rudetools");

    private RudeItemGroup(int index, String label)
    {
        super(index, label);
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(RudeItems.rude_icon);
    }


}
