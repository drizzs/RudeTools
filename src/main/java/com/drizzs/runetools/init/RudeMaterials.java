package com.drizzs.runetools.init;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum RudeMaterials implements IItemTier
{
    numbious(10.0f, 9.0f, 1500, 3, 25, RudeItems.numbious_ingot),
    destitute(12.0f, 12.0f, 3000, 3, 25, RudeItems.destitute_ingot),
    rudious(15.0f, 15.0f, 6000, 4, 40, RudeItems.rudious_ingot),
    yamium(17.0f, 17.0f, 10000, 4, 40, RudeItems.yamium_ingot),
    mega(20.0f, 20.0f, 20000, 5, 50, RudeItems.mega_ingot),
    supermega(25f, 25.0f, 1, 5, 50, null);
    private float attackDamage, efficiency;
    private int durability, harvestLevel, enchantability;
    private Item repairMaterial;

    private RudeMaterials(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial)
    {
        this.attackDamage = attackDamage;
        this.efficiency = efficiency;
        this.durability = durability;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public float getAttackDamage()
    {
        return this.attackDamage;
    }

    @Override
    public float getEfficiency()
    {
        return this.efficiency;
    }

    @Override
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Override
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    @Override
    public int getMaxUses()
    {
        return this.durability;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(this.repairMaterial);
    }

}
