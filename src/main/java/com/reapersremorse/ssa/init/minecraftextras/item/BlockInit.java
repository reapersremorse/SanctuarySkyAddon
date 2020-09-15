package com.reapersremorse.ssa.init.minecraftextras.item;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SanctuarySkyAddon.MOD_ID);


    public static final RegistryObject<Block> SUCROSITE_ORE= BLOCKS.register("sucrosite_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()

            )
    );
    public static final RegistryObject<Block> AKRUTRIUM_ORE= BLOCKS.register("akrutrium_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> BROERIUM_ORE= BLOCKS.register("broerium_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(5)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> BROKIUM_ORE= BLOCKS.register("brokium_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(6)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> CHARKITE_ORE= BLOCKS.register("charkite_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(7)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> GENERITE_ORE= BLOCKS.register("generite_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(8)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> HAGLUM_ORE= BLOCKS.register("haglum_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(9)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> KRETINE_ORE= BLOCKS.register("kretine_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(10)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> MOGLYX_ORE= BLOCKS.register("moglyx_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(11)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> PLAYTRIUM_ORE= BLOCKS.register("playtrium_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(12)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> SPIYTRIUM_ORE= BLOCKS.register("spiytrium_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(13)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> WOFLUOITE_ORE = BLOCKS.register("wofluoite_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(14)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> WOULFITE_ORE= BLOCKS.register("woulfite_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(15)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> QUINTIUM_ORE= BLOCKS.register("quintium_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(16)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> VOIDIUM_ORE= BLOCKS.register("voidium_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(17)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> REAPERITE_ORE= BLOCKS.register("reaperite_ore",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(18)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    /*
    ----------Blocks---------------------------------------------------------------------------------
     */
    public static final RegistryObject<Block> SUCROSITE_BLOCK= BLOCKS.register("sucrosite_block",//white
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()

            )
    );
    public static final RegistryObject<Block> AKRUTRIUM_BLOCK= BLOCKS.register("akrutrium_block",//orange
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(4)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> BROERIUM_BLOCK= BLOCKS.register("broerium_block",//brown
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(5)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> BROKIUM_BLOCK= BLOCKS.register("brokium_block",//light gray
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(6)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> CHARKITE_BLOCK= BLOCKS.register("charkite_block",//black
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(7)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> GENERITE_BLOCK= BLOCKS.register("generite_block",//dark yellow
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(8)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> HAGLUM_BLOCK= BLOCKS.register("haglum_block",//dark green
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(9)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> KRETINE_BLOCK= BLOCKS.register("kretine_block",//yellow
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(10)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> MOGLYX_BLOCK= BLOCKS.register("moglyx_block",//lime green
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(11)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> PLAYTRIUM_BLOCK= BLOCKS.register("playtrium_block",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(12)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> SPIYTRIUM_BLOCK= BLOCKS.register("spiytrium_block",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(13)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> WOFLUOITE_BLOCK = BLOCKS.register("wofluoite_block",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(14)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> WOULFITE_BLOCK= BLOCKS.register("woulfite_block",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(15)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> QUINTIUM_BLOCK= BLOCKS.register("quintium_block",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(16)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> VOIDIUM_BLOCK= BLOCKS.register("voidium_block",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(17)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );
    public static final RegistryObject<Block> REAPERITE_BLOCK= BLOCKS.register("reaperite_block",
            ()-> new Block(Block.Properties.create(Material.IRON)
                    .hardnessAndResistance(2.0f, 10.0f)
                    .harvestLevel(18)
                    .harvestTool(ToolType.PICKAXE)
                    .sound(SoundType.STONE)
                    .slipperiness(0.6f)
                    .speedFactor(0.7f)
                    .noDrops()
                    .setRequiresTool()
            )
    );

    public static final RegistryObject<Block> REAPERITE_STAIRS = BLOCKS.register("reaperite_stairs",
            ()-> {return new StairsBlock(()->BlockInit.REAPERITE_ORE.get().getDefaultState(),Block.Properties.create(Material.SAND,MaterialColor.GOLD));});
}
