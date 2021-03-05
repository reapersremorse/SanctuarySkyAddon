package com.reapersremorse.ssa;

import com.reapersremorse.ssa.init.minecraftextras.item.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
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
    public static final String MOD_VERSION = "1.0.0";
    public static final String FORGE_VERSION = "net.minecraftforge:forge:1.16.1-32.0.108";
    public static final String MAPPING = "20200707-1.16.1";
    //public static final String JEI_VERSION = "";
    //public static final String SILENTS_LIB_VERSION = "";
    //public static final String

    public SanctuarySkyAddon() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        BlockInit.BLOCKS.register(modEventBus);
        BlockItemInit.BLOCKITEMS.register(modEventBus);
        //items
        ItemInit.ITEMS.register(modEventBus);
        FoodInit.FOODITEMS.register(modEventBus);
        ArmorInit.ARMORITEMS.register(modEventBus);
        ToolInit.TOOLITEMS.register(modEventBus);

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
