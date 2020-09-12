package com.reapersremorse.ssa.objects.items;

import com.reapersremorse.ssa.SanctuarySkyAddon;
import net.minecraft.item.Item;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(SanctuarySkyAddon.TAB));
    }
}
