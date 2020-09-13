package com.reapersremorse.ssa.init.minecraftextras.item;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.objects.blocks.BlockItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockItemInit {
    public static DeferredRegister<Item> BLOCKITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SanctuarySkyAddon.MOD_ID);


    //blockItemOres
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
    /*
    -----------------BlockItems------------------------------------------------------------------------
     */

    public static final RegistryObject<Item> SUCROSITE_BLOCK = BLOCKITEMS.register("sucrosite_block",
            ()->new BlockItemBase(BlockInit.SUCROSITE_BLOCK.get()));
    public static final RegistryObject<Item> AKRUTRIUM_BLOCK = BLOCKITEMS.register("akrutrium_block",
            ()->new BlockItemBase(BlockInit.AKRUTRIUM_BLOCK.get()));
    public static final RegistryObject<Item> BROERIUM_BLOCK = BLOCKITEMS.register("broerium_block",
            ()->new BlockItemBase(BlockInit.BROERIUM_BLOCK.get()));
    public static final RegistryObject<Item> BROKIUM_BLOCK = BLOCKITEMS.register("brokium_block",
            ()->new BlockItemBase(BlockInit.BROKIUM_BLOCK.get()));
    public static final RegistryObject<Item> CHARKITE_BLOCK = BLOCKITEMS.register("charkite_block",
            ()->new BlockItemBase(BlockInit.CHARKITE_BLOCK.get()));
    public static final RegistryObject<Item> GENERITE_BLOCK = BLOCKITEMS.register("generite_block",
            ()->new BlockItemBase(BlockInit.GENERITE_BLOCK.get()));
    public static final RegistryObject<Item> HAGLUM_BLOCK = BLOCKITEMS.register("haglum_block",
            ()->new BlockItemBase(BlockInit.HAGLUM_BLOCK.get()));
    public static final RegistryObject<Item> KRETINE_BLOCK = BLOCKITEMS.register("kretine_block",
            ()->new BlockItemBase(BlockInit.KRETINE_BLOCK.get()));
    public static final RegistryObject<Item> MOGLYX_BLOCK = BLOCKITEMS.register("moglyx_block",
            ()->new BlockItemBase(BlockInit.MOGLYX_BLOCK.get()));
    public static final RegistryObject<Item> PLAYTRIUM_BLOCK = BLOCKITEMS.register("playtrium_block",
            ()->new BlockItemBase(BlockInit.PLAYTRIUM_BLOCK.get()));
    public static final RegistryObject<Item> SPIYTRIUM_BLOCK = BLOCKITEMS.register("spiytrium_block",
            ()->new BlockItemBase(BlockInit.SPIYTRIUM_BLOCK.get()));
    public static final RegistryObject<Item> WOFLUOITE_BLOCK = BLOCKITEMS.register("wofluoite_block",
            ()->new BlockItemBase(BlockInit.WOFLUOITE_BLOCK.get()));
    public static final RegistryObject<Item> WOULFITE_BLOCK = BLOCKITEMS.register("woulfite_block",
            ()->new BlockItemBase(BlockInit.WOULFITE_BLOCK.get()));
    public static final RegistryObject<Item> QUINTIUM_BLOCK = BLOCKITEMS.register("quintium_block",
            ()->new BlockItemBase(BlockInit.QUINTIUM_BLOCK.get()));
    public static final RegistryObject<Item> VOIDIUM_BLOCK = BLOCKITEMS.register("voidium_block",
            ()->new BlockItemBase(BlockInit.VOIDIUM_BLOCK.get()));
    public static final RegistryObject<Item> REAPERITE_BLOCK = BLOCKITEMS.register("reaperite_block",
            ()->new BlockItemBase(BlockInit.REAPERITE_BLOCK.get()));


}
