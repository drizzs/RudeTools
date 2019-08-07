package com.drizzs.runetools.tools.axe;

import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;

public class SuperAxe extends AxeItem
{

    public SuperAxe(IItemTier tier, float attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
