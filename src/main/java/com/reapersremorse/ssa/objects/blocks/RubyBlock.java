package com.reapersremorse.ssa.objects.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class RubyBlock extends Block {
    public RubyBlock(){
        super(Block.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f,6.0f)
                .sound(SoundType.METAL)
                .harvestLevel(0)//tool tier 0-3| wood, stone, iron, diamond
                .harvestTool(ToolType.PICKAXE)
                .setLightLevel(value -> 15)
                .setRequiresTool()

        );
    }
}
