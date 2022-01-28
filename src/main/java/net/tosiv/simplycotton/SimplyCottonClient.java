package net.tosiv.simplycotton;

import net.fabricmc.api.ClientModInitializer;
import net.tosiv.simplycotton.util.renders.BlockRenders;

public class SimplyCottonClient implements ClientModInitializer {
    @Override
    public void onInitializeClient(){
        BlockRenders.defineRenders();
    }
}
