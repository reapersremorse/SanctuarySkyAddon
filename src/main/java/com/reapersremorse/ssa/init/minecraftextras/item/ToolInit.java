package com.reapersremorse.ssa.init.minecraftextras.item;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.util.enums.SSAItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;



public class ToolInit {
    public static DeferredRegister<Item> TOOLITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SanctuarySkyAddon.MOD_ID);

    public static int MaxInt = 2147483647;
    public static int MinInt = -2147483648;
    public static float MaxFloat = 3.4028235E38f;

    //tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = TOOLITEMS.register("ruby_sword",()-> new SwordItem(SSAItemTier.RUBY,MaxInt,MaxFloat,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = TOOLITEMS.register("ruby_pickaxe",()-> new PickaxeItem(SSAItemTier.RUBY,MaxInt,MaxFloat,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = TOOLITEMS.register("ruby_axe",()-> new AxeItem(SSAItemTier.RUBY,MaxInt,MaxFloat,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = TOOLITEMS.register("ruby_shovel",()-> new ShovelItem(SSAItemTier.RUBY,MaxInt,MaxFloat,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = TOOLITEMS.register("ruby_hoe",()-> new HoeItem(SSAItemTier.RUBY,MaxInt,MaxFloat,new Item.Properties().group(SanctuarySkyAddon.TAB)));



}
