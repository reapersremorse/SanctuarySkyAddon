package com.reapersremorse.ssa.init.minecraftextras.item;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.objects.blocks.Oven;
import com.reapersremorse.ssa.objects.blocks.RubyBlock;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SanctuarySkyAddon.MOD_ID);


    //blocks
    public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block>OVEN = BLOCKS.register("oven", Oven::new);

    //ores
    public static final RegistryObject<Block>RUBY_ORE = BLOCKS.register("ruby_ore", RubyBlock::new);
}
