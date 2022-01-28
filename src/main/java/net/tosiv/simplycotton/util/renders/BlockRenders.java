package net.tosiv.simplycotton.util.renders;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.tosiv.simplycotton.util.registry.ModBlocks;

public class BlockRenders {
    public static void defineRenders()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COTTON_CROP, RenderLayer.getCutoutMipped());
    }
}
