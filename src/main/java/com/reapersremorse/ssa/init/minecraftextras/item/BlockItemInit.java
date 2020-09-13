package com.reapersremorse.ssa.init.minecraftextras.item;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.objects.blocks.BlockItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockItemInit {
    public static DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SanctuarySkyAddon.MOD_ID);


    //blockItems
    public static final RegistryObject<Item> SUCROSITE_ORE = BLOCKITEMS.register("sucrosite_ore",
            ()->new BlockItemBase(BlockInit.SUCROSITE_ORE.get()));
    public static final RegistryObject<Item> AKRUTRIUM_ORE = BLOCKITEMS.register("akrutrium_ore",
            ()->new BlockItemBase(BlockInit.AKRUTRIUM_ORE.get()));
    public static final RegistryObject<Item> BROERIUM_ORE = BLOCKITEMS.register("broerium_ore",
            ()->new BlockItemBase(BlockInit.BROERIUM_ORE.get()));
    public static final RegistryObject<Item> BROKIUM_ORE = BLOCKITEMS.register("brokium_ore",
            ()->new BlockItemBase(BlockInit.BROKIUM_ORE.get()));
    public static final RegistryObject<Item> CHARKITE_ORE = BLOCKITEMS.register("charkite_ore",
            ()->new BlockItemBase(BlockInit.CHARKITE_ORE.get()));
    public static final RegistryObject<Item> GENERITE_ORE = BLOCKITEMS.register("generite_ore",
            ()->new BlockItemBase(BlockInit.GENERITE_ORE.get()));
    public static final RegistryObject<Item> HAGLUM_ORE = BLOCKITEMS.register("haglum_ore",
            ()->new BlockItemBase(BlockInit.HAGLUM_ORE.get()));
    public static final RegistryObject<Item> KRETINE_ORE = BLOCKITEMS.register("kretine_ore",
            ()->new BlockItemBase(BlockInit.KRETINE_ORE.get()));
    public static final RegistryObject<Item> MOGLYX_ORE = BLOCKITEMS.register("moglyx_ore",
            ()->new BlockItemBase(BlockInit.MOGLYX_ORE.get()));
    public static final RegistryObject<Item> PLAYTRIUM_ORE = BLOCKITEMS.register("playtrium_ore",
            ()->new BlockItemBase(BlockInit.PLAYTRIUM_ORE.get()));
    public static final RegistryObject<Item> SPIYTRIUM_ORE = BLOCKITEMS.register("spiytrium_ore",
            ()->new BlockItemBase(BlockInit.SPIYTRIUM_ORE.get()));
    public static final RegistryObject<Item> WOFLUOITE_ORE = BLOCKITEMS.register("wofluoite_ore",
            ()->new BlockItemBase(BlockInit.WOFLUOITE_ORE.get()));
    public static final RegistryObject<Item> WOULFITE_ORE = BLOCKITEMS.register("woulfite_ore",
            ()->new BlockItemBase(BlockInit.WOULFITE_ORE.get()));
    public static final RegistryObject<Item> QUINTIUM_ORE = BLOCKITEMS.register("quintium_ore",
            ()->new BlockItemBase(BlockInit.QUINTIUM_ORE.get()));
    public static final RegistryObject<Item> VOIDIUM_ORE = BLOCKITEMS.register("voidium_ore",
            ()->new BlockItemBase(BlockInit.VOIDIUM_ORE.get()));
    public static final RegistryObject<Item> REAPERITE_ORE = BLOCKITEMS.register("reaperite_ore",
            ()->new BlockItemBase(BlockInit.REAPERITE_ORE.get()));


}
