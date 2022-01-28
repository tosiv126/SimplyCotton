package net.tosiv.simplycotton.util.registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.tosiv.simplycotton.SimplyCotton;
import net.tosiv.simplycotton.item.CottonCropItem;
import net.tosiv.simplycotton.item.CottonSeedsItem;

public class ModItems {


    //Seeds
    public static final CottonSeedsItem COTTON_SEEDS = new CottonSeedsItem(ModBlocks.COTTON_CROP, (new Item.Settings().group(SimplyCotton.COTTON_GROUP)));

    //Crop Items
    public static final CottonCropItem COTTON_BALL = new CottonCropItem((new Item.Settings().group(SimplyCotton.COTTON_GROUP)));

    public static void registerItems() {

        Registry.register(Registry.ITEM, new Identifier(SimplyCotton.MOD_ID, "cotton_seeds"), COTTON_SEEDS);

        Registry.register(Registry.ITEM, new Identifier(SimplyCotton.MOD_ID, "cotton_ball"), COTTON_BALL);
    }
}
