package com.reapersremorse.ssa.init.minecraftextras.item;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.objects.items.ItemBase;
import com.reapersremorse.ssa.objects.items.SSAFuels;
import net.minecraft.item.*;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SanctuarySkyAddon.MOD_ID);
    //items only
    //public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", ItemBase::new);
    //public static final RegistryObject<Item> HOOKER = ITEMS.register("hooker",SSAFuels::new);
    //foods
    //public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item",() -> new Item(new Item.Properties().group(SanctuarySkyAddon.TAB).food(new Food.Builder().hunger(6).saturation(1.2f).setAlwaysEdible().meat().effect(new EffectInstance(Effects.ABSORPTION, 6000, 5), 0.7f).build())));
    //public static final RegistryObject<Item> FUEL = ITEMS.register("fuel", ()->new SSAFuels(new Item.Properties().group(SanctuarySkyAddon.TAB),false,1600,"Hookers Be hookers",true));



}
