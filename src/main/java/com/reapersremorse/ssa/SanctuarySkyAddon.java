package com.reapersremorse.ssa;

import com.reapersremorse.ssa.init.minecraftextras.item.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod("ssa")
public class SanctuarySkyAddon
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "ssa";

    public SanctuarySkyAddon() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        //minecraft extras inits
        //blocks
        BlockInit.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BlockItemInit.BLOCKITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        //items
        ItemInit.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        FoodInit.FOODITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ArmorInit.ARMORITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ToolInit.TOOLITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

       MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event){
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }

    //custom creative tab with a custom tab icon
    public static final ItemGroup TAB = new ItemGroup("ssa") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ItemInit.RUBY.get());
        }
    };

}
