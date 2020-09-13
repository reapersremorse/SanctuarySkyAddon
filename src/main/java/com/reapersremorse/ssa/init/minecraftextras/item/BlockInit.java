package com.reapersremorse.ssa.init.minecraftextras.item;

import com.mojang.realmsclient.client.Request;
import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.objects.blocks.BlockBase;
import com.reapersremorse.ssa.objects.blocks.Oven;
import com.reapersremorse.ssa.objects.blocks.RubyBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SanctuarySkyAddon.MOD_ID);


    //blocks
    //public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    //public static final RegistryObject<Block>OVEN = BLOCKS.register("oven", Oven::new);

    //ores
    //public static final RegistryObject<Block>RUBY_ORE = BLOCKS.register("ruby_ore", RubyBlock::new);
    public static final RegistryObject<Block>TEST_BLOCK = BLOCKS.register("test_block", ()-> {new BlockBase(new AbstractBlock.Properties());
}
