package com.reapersremorse.ssa.util.enums;

import com.reapersremorse.ssa.init.minecraftextras.item.ItemInit;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum SSAItemTier implements IItemTier {


    //ENUM NAME(harvest level, max uses/ effeciency/base attack damage/enchantability/repair material)
    RUBY(3, 800, 7.0F, 3.0F, 12, () -> {
        return Ingredient.fromItems(ItemInit.RUBY.get());
    });


    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    SSAItemTier(int harvestLevel,int maxUses,float efficiency,float attackDamage,int enchantability,Supplier<Ingredient> repairMaterial){
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
