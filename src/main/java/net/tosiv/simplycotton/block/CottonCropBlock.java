package net.tosiv.simplycotton.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.tosiv.simplycotton.util.registry.ModItems;

public class CottonCropBlock extends CropBlock {
    public CottonCropBlock(Block.Settings builder)
    {
        super(builder);
    }

    @Environment(EnvType.CLIENT)
    protected ItemConvertible getSeedsItem()
    {
        return ModItems.COTTON_SEEDS;
    }

}