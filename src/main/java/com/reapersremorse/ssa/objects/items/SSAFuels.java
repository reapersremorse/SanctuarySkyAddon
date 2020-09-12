package com.reapersremorse.ssa.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SSAFuels extends Item {
    public SSAFuels(Properties properties){
        super(properties);
    }
    @Override
    public int getBurnTime(ItemStack itemStack) {
        return 600;
    }
}
