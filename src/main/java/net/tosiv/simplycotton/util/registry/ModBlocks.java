package net.tosiv.simplycotton.util.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.tosiv.simplycotton.SimplyCotton;
import net.tosiv.simplycotton.block.CottonCropBlock;

public class ModBlocks {

    public static final CottonCropBlock COTTON_CROP = new CottonCropBlock(FabricBlockSettings
            .of(Material.PLANT)
            .noCollision()
            .ticksRandomly()
            .strength(0.0f, 0.0f)
            .sounds(BlockSoundGroup.CROP));

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(SimplyCotton.MOD_ID, "cotton_crop"), COTTON_CROP);
    }

}
