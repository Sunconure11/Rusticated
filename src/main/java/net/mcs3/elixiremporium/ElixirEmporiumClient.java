package net.mcs3.elixiremporium;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.TooltipComponentCallback;
import net.mcs3.elixiremporium.client.ModColorProviders;
import net.mcs3.elixiremporium.client.screens.inventory.CondenserScreen;
import net.mcs3.elixiremporium.init.ModBlocks;
import net.mcs3.elixiremporium.network.ModNetworkSync;
import net.mcs3.elixiremporium.world.inventory.ModMenuTypes;
import net.mcs3.elixiremporium.world.level.block.entity.ModBlockEntityTypes;
import net.mcs3.elixiremporium.world.level.block.storage.liquid_barrel.LiquidBarrelRenderer;
import net.mcs3.elixiremporium.world.level.block.storage.pot.GlazedPotRenderer;
import net.mcs3.elixiremporium.world.level.block.storage.pot.PotRenderer;
import net.mcs3.elixiremporium.world.level.block.storage.pot.PotToolTipData;
import net.mcs3.elixiremporium.world.level.block.storage.pot.client.PotTooltipComponent;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.RenderType;

public class ElixirEmporiumClient implements ClientModInitializer
{

    @Override
    public void onInitializeClient()
    {
        registerRenderTypes();
        ModColorProviders.registerBlockColorProviders();
        ModColorProviders.registerItemColorProviders();
        ModNetworkSync.registerS2CPackets();
        registerScreenTypes();
        setupTooltips();
    }

    private static void registerRenderTypes()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHANDELIER_IRON, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHANDELIER_GOLD, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_GOLD, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_COPPER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_EXPOSED_COPPER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_WEATHERED_COPPER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_OXIDIZED_COPPER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_WAXED_COPPER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_WAXED_EXPOSED_COPPER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_WAXED_WEATHERED_COPPER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAIN_WAXED_OXIDIZED_COPPER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BARREL, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.LIQUID_BARREL, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.UNFIRED_JAR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIRED_JAR, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.FIRED_POT, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRON_LATTICE, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRONWOOD_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_IRONWOOD_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.IRONWOOD_LEAVES, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OLIVE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.POTTED_OLIVE_SAPLING, RenderType.cutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.OLIVE_LEAVES, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ROPE, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAPE_STEM, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GRAPE_LEAVES, RenderType.cutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ALOE_VERA, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLOOD_ORCHID, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CHAMOMILE, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CLOUD_LILY, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COHOSH, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HORSETAIL, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WIND_THISTLE, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.NIGHTSHROOM, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_SPORED_ASBESTOS, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CORE_ROOT, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GINSENG, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.MARSHMALLOW, RenderType.cutoutMipped());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.CONDENSER, RenderType.cutoutMipped());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RETORT, RenderType.cutoutMipped());


        BlockEntityRendererRegistry.register(ModBlockEntityTypes.LIQUID_BARREL_CONTAINER, LiquidBarrelRenderer::new);

        PotRenderer.register(ModBlockEntityTypes.POT_CONTAINER);
        GlazedPotRenderer.register(ModBlockEntityTypes.GLAZED_POT_0_CONTAINER);
        GlazedPotRenderer.register(ModBlockEntityTypes.GLAZED_POT_1_CONTAINER);
        GlazedPotRenderer.register(ModBlockEntityTypes.GLAZED_POT_2_CONTAINER);
        GlazedPotRenderer.register(ModBlockEntityTypes.GLAZED_POT_3_CONTAINER);
        GlazedPotRenderer.register(ModBlockEntityTypes.GLAZED_POT_4_CONTAINER);

    }

    private static void registerScreenTypes()
    {
        MenuScreens.register(ModMenuTypes.CONDENSER_MENU_TYPE, CondenserScreen::new);
    }

    private static void setupTooltips()
    {
        TooltipComponentCallback.EVENT.register(data -> {
            if (data instanceof PotToolTipData potToolTipData) {
                return new PotTooltipComponent(potToolTipData);
            } return null;
        });
    }
}
