package net.tosiv.simplycotton.item;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.tosiv.simplycotton.SimplyCotton;

import java.util.List;

public class CottonCropItem extends Item
{
    public CottonCropItem(Settings properties)
    {
        super(properties);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext context) {
        super.appendTooltip(stack, world, tooltip, context);
        if (SimplyCotton.config.shouldRenderToolTip()) {
            tooltip.add((new TranslatableText("item.simplycotton.cotton.line1").formatted(Formatting.GREEN)));
        }
    }
}