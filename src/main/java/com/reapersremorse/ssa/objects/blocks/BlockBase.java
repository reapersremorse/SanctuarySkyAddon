package com.reapersremorse.ssa.objects.blocks;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class BlockBase extends Block{

    //private final Properties properties;

    public BlockBase(Properties properties) {
        super(properties);
        //this.properties = properties;
        new Item.Properties().group(SanctuarySkyAddon.TAB);

    }

}
