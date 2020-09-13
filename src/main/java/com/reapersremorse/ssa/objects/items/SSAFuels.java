package com.reapersremorse.ssa.objects.items;

import com.reapersremorse.ssa.util.helpers.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class SSAFuels extends Item {

    private final Properties properties;
    private final boolean glow;
    private final int burnTime;
    private final String toolTip;

    public SSAFuels(Properties properties,boolean glow,int burnTime,String toolTip) {

        super(properties);
        this.properties = properties;
        this.glow = glow;
        this.burnTime = burnTime;
        this.toolTip = toolTip;
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
        if (KeyboardHelper.isHoldingShift()) {
            tooltip.add(new StringTextComponent(toolTip));
        } else {
            tooltip.add(new StringTextComponent("Hold" + "\u00A7e" + " Shift " + "\u00A77" + "for more information!"));
        }
        super.addInformation(stack, worldIn, tooltip, flagIn);
    }

    public Properties getProperties() {
        return properties;
    }
}
