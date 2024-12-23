package net.rbellodog.testmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.rbellodog.testmod.block.ModBlocks;

public class TestModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Set the render layer for transparent blocks
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OAK_GRAPE_LEAVES, RenderLayer.getCutout());
    }
}
