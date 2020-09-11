package com.reapersremorse.ssa.util;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import com.reapersremorse.ssa.armor.SSAArmorMaterial;
import com.reapersremorse.ssa.blocks.BlockItemBase;
import com.reapersremorse.ssa.blocks.RubyBlock;
import com.reapersremorse.ssa.items.ItemBase;
import com.reapersremorse.ssa.items.PoisonApple;
import com.reapersremorse.ssa.tools.SSAItemTier;
import net.minecraft.block.Block;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    //public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, SanctuarySkyAddon.MOD_ID);
    public static DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SanctuarySkyAddon.MOD_ID);
    public static DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SanctuarySkyAddon.MOD_ID);

    //init
    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items only
    public static final RegistryObject<Item>RUBY = ITEMS.register("ruby", ItemBase::new);

    //foods
    public static final RegistryObject<PoisonApple>POISON_APPLE = ITEMS.register("poison_apple", PoisonApple::new);


    //blocks
    public static final RegistryObject<Block>RUBY_BLOCK = BLOCKS.register("ruby_block", RubyBlock::new);
    public static final RegistryObject<Block>OVEN = BLOCKS.register("oven", RubyBlock::new);

    //ores
    public static final RegistryObject<Block>RUBY_ORE = BLOCKS.register("ruby_ore", RubyBlock::new);

    //blockItems
    public static final RegistryObject<Item>RUBY_BLOCK_ITEM = ITEMS.register("ruby_block", ()-> new BlockItemBase(RUBY_BLOCK.get()));
    public static final RegistryObject<Item>RUBY_ORE_ITEM = ITEMS.register("ruby_ore", ()-> new BlockItemBase(RUBY_ORE.get()));
    public static final RegistryObject<Item>OVEN_ITEM = ITEMS.register("oven", ()-> new BlockItemBase(OVEN.get()));


    //tools
    public static final RegistryObject<SwordItem> RUBY_SWORD = ITEMS.register("ruby_sword",()->
            new SwordItem(SSAItemTier.RUBY,2,0.0F,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<PickaxeItem> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe",()->
            new PickaxeItem(SSAItemTier.RUBY,2,0.0F,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<AxeItem> RUBY_AXE = ITEMS.register("ruby_axe",()->
            new AxeItem(SSAItemTier.RUBY,2,0.0F,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<ShovelItem> RUBY_SHOVEL = ITEMS.register("ruby_shovel",()->
            new ShovelItem(SSAItemTier.RUBY,2,0.0F,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<HoeItem> RUBY_HOE = ITEMS.register("ruby_hoe",()->
            new HoeItem(SSAItemTier.RUBY,2,0.0F,new Item.Properties().group(SanctuarySkyAddon.TAB)));

    //armor
    public static final RegistryObject<ArmorItem> RUBY_HELMET = ITEMS.register("ruby_helmet",()->
            new ArmorItem(SSAArmorMaterial.RUBY, EquipmentSlotType.HEAD,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_CHESTPLATE= ITEMS.register("ruby_chestplate",()->
            new ArmorItem(SSAArmorMaterial.RUBY, EquipmentSlotType.CHEST,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_LEGGINGS= ITEMS.register("ruby_leggings",()->
            new ArmorItem(SSAArmorMaterial.RUBY, EquipmentSlotType.LEGS,new Item.Properties().group(SanctuarySkyAddon.TAB)));
    public static final RegistryObject<ArmorItem> RUBY_BOOTS= ITEMS.register("ruby_boots",()->
            new ArmorItem(SSAArmorMaterial.RUBY, EquipmentSlotType.FEET,new Item.Properties().group(SanctuarySkyAddon.TAB)));
}
