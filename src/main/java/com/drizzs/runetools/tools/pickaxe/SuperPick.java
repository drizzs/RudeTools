package com.drizzs.runetools.tools.pickaxe;

import net.minecraft.item.IItemTier;
import net.minecraft.item.PickaxeItem;

public class SuperPick extends PickaxeItem {
    public SuperPick(IItemTier tier, int attackDamageIn, float attackSpeedIn, Properties builder) {
        super(tier, attackDamageIn, attackSpeedIn, builder);
    }
}
