package com.reapersremorse.ssa.armor;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum SSAArmorMaterial implements IArmorMaterial {
//ENUMNAME(name, damage factor (helm,legs,chest,boots), )
    RUBY(SanctuarySkyAddon.MOD_ID+":ruby", 33, new int[]{5,7,8,4}, 33,
        SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 5.0f, () -> {return Ingredient.fromItems(RegistryHandler.RUBY.get());},0);

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{11,16,15,13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;
    private final float knockbackResistance;

    SSAArmorMaterial(
            String name,
            int maxDamageFactor,
            int[] damageReductionAmountArray,
            int enchantability,
            SoundEvent soundEvent,
            float toughness,
            Supplier<Ingredient> repairMaterial,
            float knockbackResistance

    ){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
        this.knockbackResistance = knockbackResistance;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()]*this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
            return this.knockbackResistance;
    }

}
