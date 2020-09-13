package com.reapersremorse.ssa.init.minecraftextras.item;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import net.minecraft.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FoodInit {
    public static DeferredRegister<Item> FOODITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,SanctuarySkyAddon.MOD_ID);

    //foods
    //public static final RegistryObject<PoisonApple> POISON_APPLE = FOODITEMS.register("poison_apple", PoisonApple::new);
}
