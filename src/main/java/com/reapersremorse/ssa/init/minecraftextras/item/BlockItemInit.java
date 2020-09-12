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
    public static final RegistryObject<Item> RUBY_BLOCK_ITEM = BLOCKITEMS.register("ruby_block", ()-> new BlockItemBase(BlockInit.RUBY_BLOCK.get()));
    public static final RegistryObject<Item>RUBY_ORE_ITEM = BLOCKITEMS.register("ruby_ore", ()-> new BlockItemBase(BlockInit.RUBY_ORE.get()));
    public static final RegistryObject<Item>OVEN_ITEM = BLOCKITEMS.register("oven", ()-> new BlockItemBase(BlockInit.OVEN.get()));
}
