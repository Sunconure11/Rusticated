package net.mcs3.elixiremporium.world.level.material;

import net.mcs3.elixiremporium.ElixirEmporium;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.FlowingFluid;

public class ModFluids {
    private static String MOD_ID = ElixirEmporium.MOD_ID;

    public static FlowingFluid SOURCE_OLIVE_OIL;
    public static FlowingFluid FLOWING_OLIVE_OIL;
    public static FlowingFluid SOURCE_IRONBERRY_JUICE;
    public static FlowingFluid FLOWING_IRONBERRY_JUICE;

    public static Block OLIVE_OIL_BLOCK;
    public static Block IRONBERRY_JUICE_BLOCK;

    public static Item OLIVE_OIL_BUCKET;
    public static Item IRONBERRY_JUICE_BUCKET;



    public static void init() {
        SOURCE_OLIVE_OIL = Registry.register(Registry.FLUID, setResource("olive_oil"), new OliveOilFluid.Source());
        SOURCE_IRONBERRY_JUICE = Registry.register(Registry.FLUID, setResource("ironberry_juice"), new IronberryFluid.Source());

        FLOWING_OLIVE_OIL = Registry.register(Registry.FLUID, setResource("flowing_olive_oil"), new OliveOilFluid.Flowing());
        FLOWING_IRONBERRY_JUICE = Registry.register(Registry.FLUID, setResource("flowing_ironberry_juice"), new IronberryFluid.Flowing());

        OLIVE_OIL_BLOCK = Registry.register(Registry.BLOCK, setResource("olive_oil_block"), new LiquidBlock(ModFluids.SOURCE_OLIVE_OIL, BlockBehaviour.Properties.copy(Blocks.WATER)));
        IRONBERRY_JUICE_BLOCK = Registry.register(Registry.BLOCK, setResource("ironberry_juice_block"), new LiquidBlock(ModFluids.SOURCE_IRONBERRY_JUICE, BlockBehaviour.Properties.copy(Blocks.WATER)));

        OLIVE_OIL_BUCKET = Registry.register(Registry.ITEM, setResource("olive_oil_bucket"), new BucketItem(ModFluids.SOURCE_OLIVE_OIL, new Item.Properties().tab(ElixirEmporium.ITEMGROUPAG).craftRemainder(Items.BUCKET).stacksTo(1)));
        IRONBERRY_JUICE_BUCKET = Registry.register(Registry.ITEM, setResource("ironberry_juice_bucket"), new BucketItem(ModFluids.SOURCE_IRONBERRY_JUICE, new Item.Properties().tab(ElixirEmporium.ITEMGROUPAG).craftRemainder(Items.BUCKET).stacksTo(1)));
    }

    private static ResourceLocation setResource(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

}
