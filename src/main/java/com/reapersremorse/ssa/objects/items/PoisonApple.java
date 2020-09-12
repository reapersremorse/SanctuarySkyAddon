package com.reapersremorse.ssa.objects.items;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;

import static net.minecraft.potion.Effects.NAUSEA;
import static net.minecraft.potion.Effects.POISON;

public class PoisonApple extends Item {

    public PoisonApple() {
        super(new Item.Properties()
                .group(SanctuarySkyAddon.TAB)
                .maxStackSize(16)
                .food(new Food.Builder()
                        .hunger(20)
                        .saturation(100)
                        .setAlwaysEdible()
                        //.effect(new EffectInstance(Effects.NAUSEA,100,1),0.2f)
                        //.effect(new EffectInstance(Effects.POISON,100,2),0.2f)
                        .effect(()-> new EffectInstance(NAUSEA,100,1),0.0f)
                        .effect(()-> new EffectInstance(POISON,100,2),0.0f)
                        .build()
                )


        );
    }
}
