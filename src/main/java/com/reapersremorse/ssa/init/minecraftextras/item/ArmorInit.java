package com.reapersremorse.ssa.init.minecraftextras.item;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.util.enums.SSAArmorMaterial;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ArmorInit {
    public static DeferredRegister<Item> ARMORITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SanctuarySkyAddon.MOD_ID);

    //armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ARMORITEMS.register("ruby_helmet",()->
            new ArmorItem(SSAArmorMaterial.RUBY, EquipmentSlotType.HEAD,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE= ARMORITEMS.register("ruby_chestplate",()->
            new ArmorItem(SSAArmorMaterial.RUBY, EquipmentSlotType.CHEST,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS= ARMORITEMS.register("ruby_leggings",()->
            new ArmorItem(SSAArmorMaterial.RUBY, EquipmentSlotType.LEGS,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS= ARMORITEMS.register("ruby_boots",()->
            new ArmorItem(SSAArmorMaterial.RUBY, EquipmentSlotType.FEET,new Item.Properties().group(SanctuarySkyAddon.TAB)));



}
