package com.reapersremorse.ssa.objects.items;

import com.reapersremorse.ssa.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

import static net.minecraft.util.text.TextFormatting.*;

public class SSAFuels extends Item {

    private final Properties properties;
    private final boolean glow;
    private final int burnTime;
    private final String toolTip;
    //private final boolean containerItem;
    public SSAFuels(
            Properties properties,
            boolean glow,
            int burnTime,
            String toolTip//,
            //boolean containerItem
    ) {

        super(properties);
        this.properties = properties;
        this.glow = glow;
        this.burnTime = burnTime;
        this.toolTip = toolTip;
        //this.containerItem = containerItem;
    }
    @Override
    public boolean hasEffect(ItemStack stack) {
        return glow;
    }
    @Override
    public int getBurnTime(ItemStack itemStack) {
        return burnTime;
    }
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        String BURN = "Burn time: ";
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent(GOLD +toolTip));
            if (burnTime > 1){tooltip.add(new StringTextComponent(DARK_RED+"Burn time: "+RED+ Integer.toString(burnTime)));}else {tooltip.add(new StringTextComponent(YELLOW+BURN+"Not a fuel"));}

        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }


    public Properties getProperties() {
        return properties;
    }
}