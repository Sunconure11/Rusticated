package net.mcs3.elixiremporium.data.models;

import com.google.common.collect.Maps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.mcs3.elixiremporium.ElixirEmporium;
import net.mcs3.elixiremporium.init.ModBlocks;
import net.mcs3.elixiremporium.init.ModItems;
import net.mcs3.elixiremporium.world.level.block.LatticeBlock;
import net.mcs3.elixiremporium.world.level.block.RopeBlock;
import net.mcs3.elixiremporium.world.level.block.TiedStakeBlock;
import net.mcs3.elixiremporium.world.level.block.crop.GrapeLeavesBlock;
import net.mcs3.elixiremporium.world.level.block.crop.GrapeStemBlock;
import net.minecraft.client.model.Model;
import net.minecraft.core.Direction;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.*;
import net.minecraft.data.models.model.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.Property;
import org.checkerframework.checker.units.qual.C;


import java.util.Map;
import java.util.Optional;


public class BlockStateGenerator extends FabricModelProvider
{
    public static String MOD_ID = ElixirEmporium.MOD_ID;
    private final Map<Model, ResourceLocation> knownModels = Maps.newHashMap();

    public static final ModelTemplate PLANK_BASE = createVanillaModel("planks", TextureSlot.ALL);
    public static final ModelTemplate STAIRS = createVanillaModel("stairs", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate STAIRS_INNER = createVanillaModel("inner_stairs", "_inner", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate STAIRS_OUTER = createVanillaModel("outer_stairs", "_outer", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate SLAB = createVanillaModel("slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate SLAB_TOP = createVanillaModel("slab_top", "_top", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate COLORED_COBBLE = createModdedModel("template_colored_stone", TextureSlot.ALL);
    public static final ModelTemplate COLORED_SLAB = createModdedModel("template_colored_slab", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate COLORED_SLAB_TOP = createModdedModel("template_colored_slab_top", "_top", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate COLORED_STAIRS = createModdedModel("template_colored_stairs", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate COLORED_STAIRS_INNER = createModdedModel("template_colored_inner_stairs", "_inner", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate COLORED_STAIRS_OUTER = createModdedModel("template_colored_outer_stairs", "_outer", TextureSlot.BOTTOM, TextureSlot.TOP, TextureSlot.SIDE);
    public static final ModelTemplate COLORED_WALL_POST = createModdedModel("template_colored_wall_post","_post", TextureSlot.WALL);
    public static final ModelTemplate COLORED_WALL_SIDE = createModdedModel("template_colored_wall_side","_side", TextureSlot.WALL);
    public static final ModelTemplate COLORED_WALL_SIDE_TALL = createModdedModel("template_colored_wall_side_tall","_side_tall", TextureSlot.WALL);
    public static final ModelTemplate COLORED_WALL_INVENTORY = createModdedModel("template_colored_wall_inventory", "_inventory", TextureSlot.WALL);
    public static final ModelTemplate PATH_0 = createPathModel("path_0", "_0", TextureSlot.PARTICLE, TextureSlot.TEXTURE);
    public static final ModelTemplate PATH_1 = createModdedModel("path_1", "_1", TextureSlot.PARTICLE, TextureSlot.TEXTURE);
    public static final ModelTemplate PATH_2 = createModdedModel("path_2", "_2", TextureSlot.PARTICLE, TextureSlot.TEXTURE);
    public static final ModelTemplate PATH_3 = createModdedModel("path_3", "_3", TextureSlot.PARTICLE, TextureSlot.TEXTURE);
    public static final ModelTemplate CHANDELIER = createModdedModel("chandelier", TextureSlot.ALL);
    public static final ModelTemplate CHAIN = createModdedModel("chain", TextureSlot.PARTICLE, TextureSlot.ALL);
    public static final ModelTemplate ROPE = createModdedModel("template_rope", TextureSlot.PARTICLE, TextureSlot.ALL);
    public static final ModelTemplate BARREL = createModdedModel("barrel_base", TextureSlot.PARTICLE, TextureSlot.TOP,TextureSlot.BOTTOM);
    public static final ModelTemplate LIQUID_BARREL = createModdedModel("liquid_barrel_base", TextureSlot.PARTICLE, TextureSlot.TOP,TextureSlot.BOTTOM);
    public static final ModelTemplate JAR = createModdedModel("jar_base", TextureSlot.TEXTURE, TextureSlot.PARTICLE);
    public static final ModelTemplate POT = createModdedModel("pot_base", TextureSlot.TEXTURE, TextureSlot.PARTICLE);
    public static final ModelTemplate LATTICE_BASE = createModdedModel("template_lattice_base", TextureSlot.SIDE, TextureSlot.PARTICLE);
    public static final ModelTemplate LATTICE_BAR = createModdedModel("template_lattice_bar", "_bar", TextureSlot.SIDE, TextureSlot.PARTICLE);
    public static final ModelTemplate LATTICE_LEAVES_BASE = createModdedModel("template_lattice_leaves_base","_leaves_base", TextureSlot.TEXTURE, TextureSlot.PARTICLE);
    public static final ModelTemplate LATTICE_LEAVES_BAR = createModdedModel("template_lattice_leaves_bar", "_leaves_bar", TextureSlot.TEXTURE, TextureSlot.PARTICLE);
    public static final ModelTemplate LATTICE_INVENTORY = createModdedModel("template_lattice_inventory", "_inventory", TextureSlot.SIDE, TextureSlot.PARTICLE);
    public static final ModelTemplate FRAMED_CROSS = createModdedModel("template_framed_wall_cross", TextureSlot.TEXTURE, TextureSlot.PARTICLE);
    public static final ModelTemplate FRAMED_RT_DIAG = createModdedModel("template_framed_wall_rt_diag", TextureSlot.TEXTURE, TextureSlot.PARTICLE);
    public static final ModelTemplate FRAMED_LEFT_DIAG = createModdedModel("template_framed_wall_left_diag", TextureSlot.TEXTURE, TextureSlot.PARTICLE);
    public static final ModelTemplate FRAMED_WALL = createModdedModel("template_framed_wall", TextureSlot.TEXTURE, TextureSlot.PARTICLE);
    public static final ModelTemplate FERTILE_SOIL = createVanillaModel("template_farmland", TextureSlot.DIRT, TextureSlot.TOP);





    public BlockStateGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator)
    {
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_WHITE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_ORANGE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_MAGENTA);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_LIGHT_BLUE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_YELLOW);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_LIME);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_PINK);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_GRAY);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_LIGHT_GRAY);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_CYAN);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_PURPLE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_BLUE);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_BROWN);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_GREEN);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_RED);
        blockStateModelGenerator.createTrivialCube(ModBlocks.PAINTED_PLANKS_BLACK);

        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_WHITE, ModBlocks.PAINTED_PLANKS_WHITE);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_ORANGE, ModBlocks.PAINTED_PLANKS_ORANGE);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_MAGENTA, ModBlocks.PAINTED_PLANKS_MAGENTA);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_LIGHT_BLUE, ModBlocks.PAINTED_PLANKS_LIGHT_BLUE);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_YELLOW, ModBlocks.PAINTED_PLANKS_YELLOW);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_LIME, ModBlocks.PAINTED_PLANKS_LIME);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_PINK, ModBlocks.PAINTED_PLANKS_PINK);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_GRAY, ModBlocks.PAINTED_PLANKS_GRAY);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_LIGHT_GRAY, ModBlocks.PAINTED_PLANKS_LIGHT_GRAY);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_CYAN, ModBlocks.PAINTED_PLANKS_CYAN);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_PURPLE, ModBlocks.PAINTED_PLANKS_PURPLE);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_BLUE, ModBlocks.PAINTED_PLANKS_BLUE);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_BROWN, ModBlocks.PAINTED_PLANKS_BROWN);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_GREEN, ModBlocks.PAINTED_PLANKS_GREEN);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_RED, ModBlocks.PAINTED_PLANKS_RED);
        createStairsModels(blockStateModelGenerator, ModBlocks.PAINTED_STAIRS_BLACK, ModBlocks.PAINTED_PLANKS_BLACK);

        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_WHITE, ModBlocks.PAINTED_PLANKS_WHITE, "painted_planks_white");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_ORANGE, ModBlocks.PAINTED_PLANKS_ORANGE, "painted_planks_orange");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_MAGENTA, ModBlocks.PAINTED_PLANKS_MAGENTA, "painted_planks_magenta");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_LIGHT_BLUE, ModBlocks.PAINTED_PLANKS_LIGHT_BLUE, "painted_planks_light_blue");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_YELLOW, ModBlocks.PAINTED_PLANKS_YELLOW, "painted_planks_yellow");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_LIME, ModBlocks.PAINTED_PLANKS_LIME, "painted_planks_lime");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_PINK, ModBlocks.PAINTED_PLANKS_PINK, "painted_planks_pink");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_GRAY, ModBlocks.PAINTED_PLANKS_GRAY, "painted_planks_gray");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_LIGHT_GRAY, ModBlocks.PAINTED_PLANKS_LIGHT_GRAY, "painted_planks_light_gray");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_CYAN, ModBlocks.PAINTED_PLANKS_CYAN, "painted_planks_cyan");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_PURPLE, ModBlocks.PAINTED_PLANKS_PURPLE, "painted_planks_purple");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_BLUE, ModBlocks.PAINTED_PLANKS_BLUE, "painted_planks_blue");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_BROWN, ModBlocks.PAINTED_PLANKS_BROWN, "painted_planks_brown");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_GREEN, ModBlocks.PAINTED_PLANKS_GREEN, "painted_planks_green");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_RED, ModBlocks.PAINTED_PLANKS_RED, "painted_planks_red");
        createSlabModels(blockStateModelGenerator, ModBlocks.PAINTED_SLAB_BLACK, ModBlocks.PAINTED_PLANKS_BLACK, "painted_planks_black");

        createPathStates(blockStateModelGenerator, ModBlocks.COBBLESTONE_PATH, Blocks.COBBLESTONE);
        createPathStates(blockStateModelGenerator, ModBlocks.STONE_PATH, Blocks.STONE);
        createPathStates(blockStateModelGenerator, ModBlocks.GRANITE_PATH, Blocks.GRANITE);
        createPathStates(blockStateModelGenerator, ModBlocks.ANDESITE_PATH, Blocks.ANDESITE);
        createPathStates(blockStateModelGenerator, ModBlocks.DIORITE_PATH, Blocks.DIORITE);
        createPathStates(blockStateModelGenerator, ModBlocks.COBBLED_DEEPSLATE_PATH, Blocks.COBBLED_DEEPSLATE);
        createPathStates(blockStateModelGenerator, ModBlocks.BLACKSTONE_PATH, Blocks.BLACKSTONE);
        createPathStates(blockStateModelGenerator, ModBlocks.NETHER_BRICKS_PATH, Blocks.NETHER_BRICKS);

        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_IRON);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_GOLD);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_COPPER);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_EXPOSED_COPPER);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_WEATHERED_COPPER);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_OXIDIZED_COPPER);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_WAXED_COPPER, ModBlocks.CHANDELIER_COPPER);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_WAXED_EXPOSED_COPPER, ModBlocks.CHANDELIER_EXPOSED_COPPER);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_WAXED_WEATHERED_COPPER, ModBlocks.CHANDELIER_WEATHERED_COPPER);
        createChandelierStates(blockStateModelGenerator, ModBlocks.CHANDELIER_WAXED_OXIDIZED_COPPER, ModBlocks.CHANDELIER_OXIDIZED_COPPER);

        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_GOLD);
        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_COPPER);
        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_EXPOSED_COPPER);
        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_WEATHERED_COPPER);
        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_OXIDIZED_COPPER);
        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_WAXED_COPPER, ModBlocks.CHAIN_COPPER);
        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_WAXED_EXPOSED_COPPER, ModBlocks.CHAIN_EXPOSED_COPPER);
        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_WAXED_WEATHERED_COPPER, ModBlocks.CHAIN_WEATHERED_COPPER);
        createChainStates(blockStateModelGenerator, ModBlocks.CHAIN_WAXED_OXIDIZED_COPPER, ModBlocks.CHAIN_OXIDIZED_COPPER);

        createBarrelStates(blockStateModelGenerator, ModBlocks.BARREL, BARREL);
        createBarrelStates(blockStateModelGenerator, ModBlocks.LIQUID_BARREL, LIQUID_BARREL);

        createJarStates(blockStateModelGenerator, ModBlocks.UNFIRED_JAR, JAR);
        createJarStates(blockStateModelGenerator, ModBlocks.FIRED_JAR, JAR);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_JAR_0, JAR);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_JAR_1, JAR);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_JAR_2, JAR);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_JAR_3, JAR);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_JAR_4, JAR);

        createJarStates(blockStateModelGenerator, ModBlocks.UNFIRED_POT, POT);
        createJarStates(blockStateModelGenerator, ModBlocks.FIRED_POT, POT);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_POT_0, POT);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_POT_1, POT);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_POT_2, POT);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_POT_3, POT);
        createJarStates(blockStateModelGenerator, ModBlocks.GLAZED_POT_4, POT);

        createLatticeStates(blockStateModelGenerator, ModBlocks.IRON_LATTICE);

        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_WHITE, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_ORANGE, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_MAGENTA, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_LIGHT_BLUE, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_YELLOW, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_LIME, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_PINK, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_GRAY, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_LIGHT_GRAY, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_CYAN, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_PURPLE, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_BLUE, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_BROWN, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_GREEN, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_RED, Blocks.STONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.STONE_BLACK, Blocks.STONE);

        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_WHITE, Blocks.STONE, "stone_white");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_ORANGE, Blocks.STONE, "stone_orange");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_MAGENTA, Blocks.STONE, "stone_magenta");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_LIGHT_BLUE, Blocks.STONE, "stone_light_blue");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_YELLOW, Blocks.STONE, "stone_yellow");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_LIME, Blocks.STONE, "stone_lime");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_PINK, Blocks.STONE, "stone_pink");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_GRAY, Blocks.STONE, "stone_gray");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_LIGHT_GRAY, Blocks.STONE, "stone_light_gray");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_CYAN, Blocks.STONE, "stone_cyan");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_PURPLE, Blocks.STONE, "stone_purple");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_BLUE, Blocks.STONE, "stone_blue");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_BROWN, Blocks.STONE, "stone_brown");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_GREEN, Blocks.STONE, "stone_green");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_RED, Blocks.STONE, "stone_red");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.STONE_SLAB_BLACK, Blocks.STONE, "stone_black");

        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_WHITE, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_ORANGE, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_MAGENTA, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_LIGHT_BLUE, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_YELLOW, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_LIME, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_PINK, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_GRAY, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_LIGHT_GRAY, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_CYAN, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_PURPLE, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_BLUE, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_BROWN, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_GREEN, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_RED, Blocks.STONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.STONE_STAIRS_BLACK, Blocks.STONE);

        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WHITE, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_ORANGE, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_MAGENTA, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_LIGHT_BLUE, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_YELLOW, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_LIME, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_PINK, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_GRAY, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_LIGHT_GRAY, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_CYAN, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_PURPLE, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_BLUE, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_BROWN, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_GREEN, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_RED, Blocks.COBBLESTONE);
        createColoredCobbleModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_BLACK, Blocks.COBBLESTONE);

        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_WHITE, Blocks.COBBLESTONE, "cobblestone_white");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_ORANGE, Blocks.COBBLESTONE, "cobblestone_orange");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_MAGENTA, Blocks.COBBLESTONE, "cobblestone_magenta");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_LIGHT_BLUE, Blocks.COBBLESTONE, "cobblestone_light_blue");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_YELLOW, Blocks.COBBLESTONE, "cobblestone_yellow");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_LIME, Blocks.COBBLESTONE, "cobblestone_lime");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_PINK, Blocks.COBBLESTONE, "cobblestone_pink");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_GRAY, Blocks.COBBLESTONE, "cobblestone_gray");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_LIGHT_GRAY, Blocks.COBBLESTONE, "cobblestone_light_gray");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_CYAN, Blocks.COBBLESTONE, "cobblestone_cyan");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_PURPLE, Blocks.COBBLESTONE, "cobblestone_purple");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_BLUE, Blocks.COBBLESTONE, "cobblestone_blue");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_BROWN, Blocks.COBBLESTONE, "cobblestone_brown");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_GREEN, Blocks.COBBLESTONE, "cobblestone_green");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_RED, Blocks.COBBLESTONE, "cobblestone_red");
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_SLAB_BLACK, Blocks.COBBLESTONE, "cobblestone_black");

        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_WHITE, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_ORANGE, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_MAGENTA, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_LIGHT_BLUE, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_YELLOW, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_LIME, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_PINK, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_GRAY, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_LIGHT_GRAY, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_CYAN, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_PURPLE, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_BLUE, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_BROWN, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_GREEN, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_RED, Blocks.COBBLESTONE);
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_STAIRS_BLACK, Blocks.COBBLESTONE);

        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_WHITE, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_ORANGE, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_MAGENTA, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_LIGHT_BLUE, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_YELLOW, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_LIME, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_PINK, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_GRAY, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_LIGHT_GRAY, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_CYAN, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_PURPLE, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_BLUE, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_BROWN, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_GREEN, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_RED, Blocks.COBBLESTONE);
        createColoredStoneWallModels(blockStateModelGenerator, ModBlocks.COBBLESTONE_WALL_BLACK, Blocks.COBBLESTONE);

        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_WHITE, Blocks.WHITE_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_ORANGE, Blocks.ORANGE_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_MAGENTA, Blocks.MAGENTA_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_YELLOW, Blocks.YELLOW_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_LIME, Blocks.LIME_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_PINK, Blocks.PINK_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_GRAY, Blocks.GRAY_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_CYAN, Blocks.CYAN_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_PURPLE, Blocks.PURPLE_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_BLUE, Blocks.BLUE_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_BROWN, Blocks.BROWN_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_GREEN, Blocks.GREEN_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_RED, Blocks.RED_WOOL, FRAMED_CROSS);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CROSS_BLACK, Blocks.BLACK_WOOL, FRAMED_CROSS);

        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_WHITE, Blocks.WHITE_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_ORANGE, Blocks.ORANGE_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_MAGENTA, Blocks.MAGENTA_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_YELLOW, Blocks.YELLOW_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_LIME, Blocks.LIME_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_PINK, Blocks.PINK_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_GRAY, Blocks.GRAY_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_CYAN, Blocks.CYAN_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_PURPLE, Blocks.PURPLE_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_BLUE, Blocks.BLUE_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_BROWN, Blocks.BROWN_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_GREEN, Blocks.GREEN_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_RED, Blocks.RED_WOOL, FRAMED_RT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RT_DIAG_BLACK, Blocks.BLACK_WOOL, FRAMED_RT_DIAG);

        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_WHITE, Blocks.WHITE_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_ORANGE, Blocks.ORANGE_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_MAGENTA, Blocks.MAGENTA_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_YELLOW, Blocks.YELLOW_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_LIME, Blocks.LIME_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_PINK, Blocks.PINK_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_GRAY, Blocks.GRAY_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_CYAN, Blocks.CYAN_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_PURPLE, Blocks.PURPLE_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_BLUE, Blocks.BLUE_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_BROWN, Blocks.BROWN_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_GREEN, Blocks.GREEN_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_RED, Blocks.RED_WOOL, FRAMED_LEFT_DIAG);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LEFT_DIAG_BLACK, Blocks.BLACK_WOOL, FRAMED_LEFT_DIAG);

        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_WHITE, Blocks.WHITE_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_ORANGE, Blocks.ORANGE_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_MAGENTA, Blocks.MAGENTA_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LIGHT_BLUE, Blocks.LIGHT_BLUE_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_YELLOW, Blocks.YELLOW_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LIME, Blocks.LIME_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_PINK, Blocks.PINK_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_GRAY, Blocks.GRAY_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_LIGHT_GRAY, Blocks.LIGHT_GRAY_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_CYAN, Blocks.CYAN_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_PURPLE, Blocks.PURPLE_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_BLUE, Blocks.BLUE_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_BROWN, Blocks.BROWN_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_GREEN, Blocks.GREEN_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_RED, Blocks.RED_WOOL, FRAMED_WALL);
        createFramedWallModels(blockStateModelGenerator, ModBlocks.FRAMED_WALL_BLACK, Blocks.BLACK_WOOL, FRAMED_WALL);

        createFertileSoil(blockStateModelGenerator);

        createPlantModels(blockStateModelGenerator, ModBlocks.IRONWOOD_SAPLING, ModBlocks.POTTED_IRONWOOD_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.IRONWOOD_LEAVES, TexturedModel.LEAVES);
        crateWoodModels(blockStateModelGenerator, ModBlocks.IRONWOOD_WOOD, ModBlocks.IRONWOOD_LOG);
        crateWoodModels(blockStateModelGenerator, ModBlocks.STRIPPED_IRONWOOD_WOOD, ModBlocks.STRIPPED_IRONWOOD_LOG);
        blockStateModelGenerator.createTrivialCube(ModBlocks.IRONWOOD_PLANKS);
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.IRONWOOD_SLAB, ModBlocks.IRONWOOD_PLANKS, "ironwood_planks");
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.IRONWOOD_STAIRS, ModBlocks.IRONWOOD_PLANKS);
        createFenceModels(blockStateModelGenerator, ModBlocks.IRONWOOD_FENCE, ModBlocks.IRONWOOD_PLANKS);
        createFenceGateModels(blockStateModelGenerator, ModBlocks.IRONWOOD_GATE, ModBlocks.IRONWOOD_PLANKS);

        createPlantModels(blockStateModelGenerator, ModBlocks.OLIVE_SAPLING, ModBlocks.POTTED_OLIVE_SAPLING, BlockModelGenerators.TintState.NOT_TINTED);
        blockStateModelGenerator.createTrivialBlock(ModBlocks.OLIVE_LEAVES, TexturedModel.LEAVES);
        crateWoodModels(blockStateModelGenerator, ModBlocks.OLIVE_WOOD, ModBlocks.OLIVE_LOG);
        crateWoodModels(blockStateModelGenerator, ModBlocks.STRIPPED_OLIVE_WOOD, ModBlocks.STRIPPED_OLIVE_LOG);
        blockStateModelGenerator.createTrivialCube(ModBlocks.OLIVE_PLANKS);
        createColoredSlabModels(blockStateModelGenerator, ModBlocks.OLIVE_SLAB, ModBlocks.OLIVE_PLANKS, "olive_planks");
        createColoredStairsModels(blockStateModelGenerator, ModBlocks.OLIVE_STAIRS, ModBlocks.OLIVE_PLANKS);
        createFenceModels(blockStateModelGenerator, ModBlocks.OLIVE_FENCE, ModBlocks.OLIVE_PLANKS);
        createFenceGateModels(blockStateModelGenerator, ModBlocks.OLIVE_GATE, ModBlocks.OLIVE_PLANKS);

        createRopeStates(blockStateModelGenerator, ModBlocks.ROPE);
        createCropStakeModels(blockStateModelGenerator, ModBlocks.CROP_STAKE);
        createTiedStakeMddels(blockStateModelGenerator, ModBlocks.TIED_STAKE);
        createGrapeBlock(blockStateModelGenerator, ModBlocks.GRAPE_STEM, BlockStateProperties.AGE_3, 0, 1, 2, 3);
        createGrapeLeavesStates(blockStateModelGenerator, ModBlocks.GRAPE_LEAVES);

        createHerbBlock(blockStateModelGenerator, ModBlocks.ALOE_VERA, BlockStateProperties.AGE_3, 0, 1, 2, 3);
        createHerbBlock(blockStateModelGenerator, ModBlocks.BLOOD_ORCHID, BlockStateProperties.AGE_3, 0, 1, 2, 3);
        createHerbBlock(blockStateModelGenerator, ModBlocks.CHAMOMILE, BlockStateProperties.AGE_3, 0, 1, 2, 3);
        createHerbBlock(blockStateModelGenerator, ModBlocks.CLOUD_LILY, BlockStateProperties.AGE_3, 0, 1, 2, 3);
        createHerbBlock(blockStateModelGenerator, ModBlocks.COHOSH, BlockStateProperties.AGE_3, 0, 1, 2, 3);
        createHerbBlock(blockStateModelGenerator, ModBlocks.HORSETAIL, BlockStateProperties.AGE_3, 0, 1, 2, 3);
        createHerbBlock(blockStateModelGenerator, ModBlocks.WIND_THISTLE, BlockStateProperties.AGE_3, 0, 1, 2, 3);
        createHerbBlock(blockStateModelGenerator, ModBlocks.MOONCAP_MUSHROOM, BlockStateProperties.AGE_3, 0, 1, 2, 3);





    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator)
    {
        itemModelGenerator.generateFlatItem(ModItems.IRON_BERRIES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.OLIVES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COPPER_NUGGET, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.GRAPES, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.GRAPE_SEEDS, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.ALOE_VERA, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.BLOOD_ORCHID, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CHAMOMILE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.CLOUD_LILY, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.COHOSH, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.HORSETAIL, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.WIND_THISTLE, ModelTemplates.FLAT_ITEM);
        itemModelGenerator.generateFlatItem(ModItems.MOONCAP_MUSHROOM, ModelTemplates.FLAT_ITEM);
    }

    public static void createStairsModels(BlockModelGenerators modelGenerator, Block block, Block parentTextureBlock)
    {
        TextureMapping textures = TextureMapping.cube(parentTextureBlock);

        ResourceLocation identifier = STAIRS_INNER.create(block, textures, modelGenerator.modelOutput);
        ResourceLocation identifier2 = STAIRS.create(block, textures, modelGenerator.modelOutput);
        ResourceLocation identifier3 = STAIRS_OUTER.create(block, textures, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createStairs(block, identifier, identifier2, identifier3));
        modelGenerator.delegateItemModel(block, identifier2);
    }

    public static void createSlabModels(BlockModelGenerators modelGenerator, Block block, Block parentBlock, String name) {
        TextureMapping textures = TextureMapping.cube(parentBlock);
        ResourceLocation baseModelId = new ResourceLocation(MOD_ID, "block/" + name);

        ResourceLocation identifier = SLAB.create(block, textures, modelGenerator.modelOutput);
        ResourceLocation identifier2 = SLAB_TOP.create(block, textures, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSlab(block, identifier, identifier2, baseModelId));
        modelGenerator.delegateItemModel(block, identifier);

    }

    public static void createColoredSlabModels(BlockModelGenerators modelGenerator, Block block, Block parentBlock, String name) {
        TextureMapping textures = TextureMapping.cube(parentBlock);
        ResourceLocation baseModelId = new ResourceLocation(MOD_ID, "block/" + name);

        ResourceLocation identifier = COLORED_SLAB.create(block, textures, modelGenerator.modelOutput);
        ResourceLocation identifier2 = COLORED_SLAB_TOP.create(block, textures, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSlab(block, identifier, identifier2, baseModelId));
        modelGenerator.delegateItemModel(block, identifier);

    }

    public static void createFramedWallModels(BlockModelGenerators modelGenerator, Block block, Block parentBlock, ModelTemplate modelTemplate) {
        TextureMapping textures = TextureMapping.cube(parentBlock);
        ResourceLocation identifier = modelTemplate.create(block, textures, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, identifier));
        modelGenerator.delegateItemModel(block, identifier);
    }

    public static void createCropStakeModels(BlockModelGenerators modelGenerator, Block block) {
        ResourceLocation modelFile = new ResourceLocation(MOD_ID, "block/crop_stake");

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, modelFile));
        modelGenerator.delegateItemModel(block, modelFile);
    }

    public static void createColoredCobbleModels(BlockModelGenerators modelGenerator, Block block, Block textureBlock) {
        TextureMapping textures = TextureMapping.cube(textureBlock);
        ResourceLocation resourceLocation = COLORED_COBBLE.create(block, textures, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resourceLocation));
        modelGenerator.delegateItemModel(block, resourceLocation);

    }

    public static void createColoredStairsModels(BlockModelGenerators modelGenerator, Block block, Block parentBlock)
    {
        TextureMapping textures = TextureMapping.cube(parentBlock);

        ResourceLocation identifier = COLORED_STAIRS_INNER.create(block, textures, modelGenerator.modelOutput);
        ResourceLocation identifier2 = COLORED_STAIRS.create(block, textures, modelGenerator.modelOutput);
        ResourceLocation identifier3 = COLORED_STAIRS_OUTER.create(block, textures, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createStairs(block, identifier, identifier2, identifier3));
        modelGenerator.delegateItemModel(block, identifier2);
    }

    public static void createFenceModels(BlockModelGenerators modelGenerator, Block fenceBlock, Block textureBlock)
    {
        TextureMapping texture = TextureMapping.defaultTexture(textureBlock);
        ResourceLocation resourceLocation = ModelTemplates.FENCE_POST.create(fenceBlock, texture, modelGenerator.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.FENCE_SIDE.create(fenceBlock, texture, modelGenerator.modelOutput);
        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createFence(fenceBlock, resourceLocation, resourceLocation2));
        ResourceLocation resourceLocation3 = ModelTemplates.FENCE_INVENTORY.create(fenceBlock, texture, modelGenerator.modelOutput);
        modelGenerator.delegateItemModel(fenceBlock, resourceLocation3);
    }

    public static void createFenceGateModels(BlockModelGenerators modelGenerator, Block fenceGateBlock, Block textureBlock)
    {
        TextureMapping textureMapping = TextureMapping.defaultTexture(textureBlock);

        ResourceLocation resourceLocation = ModelTemplates.FENCE_GATE_OPEN.create(fenceGateBlock, textureMapping, modelGenerator.modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.FENCE_GATE_CLOSED.create(fenceGateBlock, textureMapping, modelGenerator.modelOutput);
        ResourceLocation resourceLocation3 = ModelTemplates.FENCE_GATE_WALL_OPEN.create(fenceGateBlock, textureMapping, modelGenerator.modelOutput);
        ResourceLocation resourceLocation4 = ModelTemplates.FENCE_GATE_WALL_CLOSED.create(fenceGateBlock, textureMapping, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createFenceGate(fenceGateBlock, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4));
    }

    public static void createColoredStoneWallModels(BlockModelGenerators modelGenerator, Block wallBlock, Block parentBlock)
    {
        TextureMapping textures = TextureMapping.cube(parentBlock);

        ResourceLocation resourceLocation = COLORED_WALL_POST.create(wallBlock, textures, modelGenerator.modelOutput);
        ResourceLocation resourceLocation2 = COLORED_WALL_SIDE.create(wallBlock, textures, modelGenerator.modelOutput);
        ResourceLocation resourceLocation3 = COLORED_WALL_SIDE_TALL.create(wallBlock, textures, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createWall(wallBlock, resourceLocation, resourceLocation2, resourceLocation3));

        ResourceLocation resourceLocation4 = COLORED_WALL_INVENTORY.create(wallBlock, textures, modelGenerator.modelOutput);
        modelGenerator.delegateItemModel(wallBlock, resourceLocation4);
    }

    public static void createChandelierStates(BlockModelGenerators modelGenerator, Block block)
    {
        TextureMapping texture = TextureMapping.cube(block);
        ResourceLocation resource = CHANDELIER.create(block, texture, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resource));
        modelGenerator.delegateItemModel(block, resource);

    }

    public static void createChandelierStates(BlockModelGenerators modelGenerator, Block block, Block blockTexture)
    {
        TextureMapping texture = TextureMapping.cube(blockTexture);
        ResourceLocation resource = CHANDELIER.create(block, texture, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resource));
        modelGenerator.delegateItemModel(block, resource);

    }

    public static void createPathStates(BlockModelGenerators modelGenerator, Block block, Block baseStoneBlock)
    {
        TextureMapping texture = TextureMapping.cube(baseStoneBlock);

        ResourceLocation path_0 = PATH_0.create(block, texture, modelGenerator.modelOutput);
        ResourceLocation path_1 = PATH_1.create(block, texture, modelGenerator.modelOutput);
        ResourceLocation path_2 = PATH_2.create(block, texture, modelGenerator.modelOutput);
        ResourceLocation path_3 = PATH_3.create(block, texture, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(pathModelVariants(block, path_0, path_1, path_2, path_3));
        modelGenerator.delegateItemModel(block, path_0);
    }

    public static void createChainStates(BlockModelGenerators modelGenerators, Block block)
    {
        TextureMapping texture = TextureMapping.cube(block);
        ResourceLocation resourceLocation = CHAIN.create(block, texture, modelGenerators.modelOutput);

        modelGenerators.createAxisAlignedPillarBlockCustomModel(block, resourceLocation);
        modelGenerators.createSimpleFlatItemModel(block.asItem());
    }

    public static void createChainStates(BlockModelGenerators modelGenerators, Block block, Block blockTexture)
    {
        TextureMapping texture = TextureMapping.cube(blockTexture);
        ResourceLocation resourceLocation = CHAIN.create(block, texture, modelGenerators.modelOutput);

        modelGenerators.createAxisAlignedPillarBlockCustomModel(block, resourceLocation);
        ModelTemplates.FLAT_ITEM.create(ModelLocationUtils.getModelLocation(block.asItem()), TextureMapping.layer0(blockTexture.asItem()), modelGenerators.modelOutput);
    }

    public static void createRopeStates(BlockModelGenerators modelGenerators, Block block)
    {
        TextureMapping texture = TextureMapping.cube(block);
        ResourceLocation ropeLocation = ROPE.create(block, texture, modelGenerators.modelOutput);
        ResourceLocation knotLocation = new ResourceLocation(MOD_ID, "block/template_rope_knot");

        modelGenerators.blockStateOutput.accept(createRope(block, ropeLocation, knotLocation));
        modelGenerators.delegateItemModel(block, ropeLocation);
    }

    public static net.minecraft.data.models.blockstates.BlockStateGenerator createRope(Block ropeBlock, ResourceLocation ropeBase, ResourceLocation ropeKnot)
    {
        return MultiPartGenerator.multiPart(ropeBlock)
                .with(Condition.condition().term(BlockStateProperties.AXIS, Direction.Axis.X), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, ropeBase).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, false))
                .with(Condition.condition().term(BlockStateProperties.AXIS, Direction.Axis.Y), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, ropeBase))
                .with(Condition.condition().term(BlockStateProperties.AXIS, Direction.Axis.Z), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, ropeBase).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, false))
                .with(Condition.condition().term(BlockStateProperties.AXIS, Direction.Axis.X).term(RopeBlock.DANGLE, Boolean.TRUE), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, ropeKnot))
                .with(Condition.condition().term(BlockStateProperties.AXIS, Direction.Axis.Z).term(RopeBlock.DANGLE, Boolean.TRUE), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, ropeKnot).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                ;

    }

    public static void createBarrelStates(BlockModelGenerators modelGenerator, Block block, ModelTemplate model)
    {
        TextureMapping texture = TextureMapping.cube(Blocks.SPRUCE_PLANKS);
        ResourceLocation resource = model.create(block, texture, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resource));
        modelGenerator.delegateItemModel(block, resource);
    }

    public static void createLatticeStates(BlockModelGenerators modelGenerators, Block block) {// BlockModelGenerators.BlockFamilyProvider wall(Block wallBlock) {

        TextureMapping textureLattice = TextureMapping.cauldron(TextureMapping.getBlockTexture(Blocks.CAULDRON, "_side"));
        TextureMapping textureLeaves = TextureMapping.cube(Blocks.OAK_LEAVES);

        ResourceLocation latticeBase = LATTICE_BASE.create(block, textureLattice, modelGenerators.modelOutput);
        ResourceLocation latticeBar = LATTICE_BAR.create(block, textureLattice, modelGenerators.modelOutput);
        ResourceLocation leavesBase = LATTICE_LEAVES_BASE.create(block, textureLeaves, modelGenerators.modelOutput);
        ResourceLocation leavesBar = LATTICE_LEAVES_BAR.create(block, textureLeaves, modelGenerators.modelOutput);
        ResourceLocation latticeInventory = LATTICE_INVENTORY.create(block, textureLattice, modelGenerators.modelOutput);

        modelGenerators.blockStateOutput.accept(createLattice(block, latticeBase, latticeBar, leavesBase, leavesBar));
        modelGenerators.delegateItemModel(block, latticeInventory);
}

    public static net.minecraft.data.models.blockstates.BlockStateGenerator createLattice(Block latticeBlock, ResourceLocation latticeBase, ResourceLocation latticeBar, ResourceLocation leavesBase, ResourceLocation leavesBar) {
        return MultiPartGenerator.multiPart(latticeBlock)
                .with(Condition.condition().term(BlockStateProperties.DOWN, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, latticeBase))
                .with(Condition.condition().term(BlockStateProperties.DOWN, false), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, latticeBase))
                .with(Condition.condition().term(BlockStateProperties.UP, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, latticeBar).with(VariantProperties.X_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.DOWN, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, latticeBar).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.NORTH, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, latticeBar).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.EAST, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, latticeBar).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.SOUTH, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, latticeBar).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.WEST, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, latticeBar).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.DOWN, true).term(LatticeBlock.LEAVES, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, leavesBase))
                .with(Condition.condition().term(BlockStateProperties.DOWN, false).term(LatticeBlock.LEAVES, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, leavesBase))
                .with(Condition.condition().term(BlockStateProperties.UP, true).term(LatticeBlock.LEAVES, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, leavesBar).with(VariantProperties.X_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.DOWN, true).term(LatticeBlock.LEAVES, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, leavesBar).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.NORTH, true).term(LatticeBlock.LEAVES, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, leavesBar).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.EAST, true).term(LatticeBlock.LEAVES, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, leavesBar).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.SOUTH, true).term(LatticeBlock.LEAVES, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, leavesBar).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180).with(VariantProperties.UV_LOCK, true))
                .with(Condition.condition().term(BlockStateProperties.WEST, true).term(LatticeBlock.LEAVES, true), net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, leavesBar).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270).with(VariantProperties.UV_LOCK, true));
    }

    public static MultiVariantGenerator pathModelVariants(Block block, ResourceLocation path0Location, ResourceLocation path1Location, ResourceLocation path2Location, ResourceLocation path3Location) {
        return MultiVariantGenerator.multiVariant(block, new net.minecraft.data.models.blockstates.Variant[]{
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path0Location),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path0Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path0Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path0Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path1Location),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path1Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path1Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path1Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path2Location),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path2Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path2Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path2Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path3Location),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path3Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path3Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180),
                net.minecraft.data.models.blockstates.Variant.variant().with(VariantProperties.MODEL, path3Location).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270)});
    }

    public static void createJarStates(BlockModelGenerators modelGenerator, Block block, ModelTemplate model)
    {
        TextureMapping texture = TextureMapping.cube(block);
        ResourceLocation resource = model.create(block, texture, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(block, resource));
        modelGenerator.delegateItemModel(block, resource);

    }

    public static void createFertileSoil(BlockModelGenerators modelGenerator) {
        TextureMapping textureMapping = (new TextureMapping()).put(TextureSlot.DIRT, TextureMapping.getBlockTexture(Blocks.DIRT)).put(TextureSlot.TOP, TextureMapping.getBlockTexture(ModBlocks.FERTILE_SOIL));


        ResourceLocation resourceLocation = FERTILE_SOIL.create(ModBlocks.FERTILE_SOIL, textureMapping, modelGenerator.modelOutput);

        modelGenerator.blockStateOutput.accept(BlockModelGenerators.createSimpleBlock(ModBlocks.FERTILE_SOIL, resourceLocation));
        modelGenerator.delegateItemModel(ModBlocks.FERTILE_SOIL, resourceLocation);
    }

    public static void createPlantModels(BlockModelGenerators modelGenerator, Block plantBlock, Block pottedPlantBlock, BlockModelGenerators.TintState tintState) {
        modelGenerator.createCrossBlockWithDefaultItem(plantBlock, tintState);
        TextureMapping textureMapping = TextureMapping.plant(plantBlock);
        ResourceLocation resourceLocation = tintState.getCrossPot().create(pottedPlantBlock, textureMapping, modelGenerator.modelOutput);
        modelGenerator.blockStateOutput.accept(modelGenerator.createSimpleBlock(pottedPlantBlock, resourceLocation));
    }

    public static void crateWoodModels(BlockModelGenerators modelGenerators, Block woodBlock, Block logBlock)
    {
        TextureMapping logTexture = TextureMapping.logColumn(logBlock);
        TextureMapping textureMapping = logTexture.copyAndUpdate(TextureSlot.END, logTexture.get(TextureSlot.SIDE));
        ResourceLocation resourceLocationWood = ModelTemplates.CUBE_COLUMN.create(woodBlock, textureMapping, modelGenerators.modelOutput);
        modelGenerators.blockStateOutput.accept(BlockModelGenerators.createAxisAlignedPillarBlock(woodBlock, resourceLocationWood));
        modelGenerators.delegateItemModel(woodBlock, resourceLocationWood);

        ResourceLocation resourceLocationLog = ModelTemplates.CUBE_COLUMN.create(logBlock, logTexture, modelGenerators.modelOutput);
        ResourceLocation resourceLocationLogHoriz = ModelTemplates.CUBE_COLUMN_HORIZONTAL.create(logBlock, logTexture, modelGenerators.modelOutput);
        modelGenerators.blockStateOutput.accept(BlockModelGenerators.createRotatedPillarWithHorizontalVariant(logBlock, resourceLocationLog, resourceLocationLogHoriz));
        modelGenerators.delegateItemModel(logBlock, resourceLocationLog);
    }

    public static void createTiedStakeMddels(BlockModelGenerators modelGenerators, Block block)
    {
        ResourceLocation tiedStake = new ResourceLocation(MOD_ID, "block/tied_stake");
        ResourceLocation tiedKnot = new ResourceLocation(MOD_ID, "block/tied_stake_rope");

        modelGenerators.blockStateOutput.accept(stakeTiedVariants(block, tiedStake, tiedKnot));
    }

    public static MultiPartGenerator stakeTiedVariants(Block block, ResourceLocation baseLocation, ResourceLocation ropeLocation) {
        return MultiPartGenerator.multiPart(block).with(Variant.variant().with(VariantProperties.MODEL, baseLocation))
                .with((Condition)Condition.condition().term(TiedStakeBlock.NORTH, true), Variant.variant().with(VariantProperties.MODEL, ropeLocation))
                .with((Condition)Condition.condition().term(TiedStakeBlock.EAST, true), Variant.variant().with(VariantProperties.MODEL, ropeLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                .with((Condition)Condition.condition().term(TiedStakeBlock.SOUTH, true), Variant.variant().with(VariantProperties.MODEL, ropeLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
                .with((Condition)Condition.condition().term(TiedStakeBlock.WEST, true), Variant.variant().with(VariantProperties.MODEL, ropeLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270));
    }

    public final void createGrapeBlock(BlockModelGenerators modelGenerators, Block cropBlock, Property<Integer> ageProperty, int ... ageToVisualStageMapping) {
        ResourceLocation grapeStem3 = new ResourceLocation(MOD_ID, "block/grape_stem_stage_3");
        if (ageProperty.getPossibleValues().size() != ageToVisualStageMapping.length) {
            throw new IllegalArgumentException();
        }
        Int2ObjectOpenHashMap int2ObjectMap = new Int2ObjectOpenHashMap();
        PropertyDispatch propertyDispatch = PropertyDispatch.property(ageProperty).generate(integer -> {
            int i = ageToVisualStageMapping[integer];
            ResourceLocation resourceLocation;
            if(i < 3) resourceLocation = (ResourceLocation) int2ObjectMap.computeIfAbsent(i, j -> modelGenerators.createSuffixedVariant(cropBlock, "_stage_" + i, ModelTemplates.CROSS, TextureMapping::cross));
            else resourceLocation = grapeStem3;
            return Variant.variant().with(VariantProperties.MODEL, resourceLocation);
        });
        modelGenerators.blockStateOutput.accept(MultiVariantGenerator.multiVariant(cropBlock).with(propertyDispatch));
    }

    public final void createHerbBlock(BlockModelGenerators modelGenerators, Block cropBlock, Property<Integer> ageProperty, int ... ageToVisualStageMapping) {
        if (ageProperty.getPossibleValues().size() != ageToVisualStageMapping.length) {
            throw new IllegalArgumentException();
        }
        Int2ObjectOpenHashMap int2ObjectMap = new Int2ObjectOpenHashMap();
        PropertyDispatch propertyDispatch = PropertyDispatch.property(ageProperty).generate(integer -> {
            int i = ageToVisualStageMapping[integer];
            ResourceLocation resourceLocation = (ResourceLocation) int2ObjectMap.computeIfAbsent(i, j -> modelGenerators.createSuffixedVariant(cropBlock, "_stage" + i, ModelTemplates.CROSS, TextureMapping::cross));
            return Variant.variant().with(VariantProperties.MODEL, resourceLocation);
        });
        modelGenerators.blockStateOutput.accept(MultiVariantGenerator.multiVariant(cropBlock).with(propertyDispatch));
    }

    public static void createGrapeLeavesStates(BlockModelGenerators modelGenerators, Block block)
    {
        ResourceLocation ropeLocation = new ResourceLocation(MOD_ID, "block/template_rope");
        ResourceLocation leavesDist0Location = new ResourceLocation(MOD_ID, "block/grape_leaves_distance_0");
        ResourceLocation leavesDist1Location = new ResourceLocation(MOD_ID, "block/grape_leaves_distance_1");
        ResourceLocation grapesLocation = new ResourceLocation(MOD_ID, "block/grape_hanging");

        modelGenerators.blockStateOutput.accept(createGrapeLeaves(block, leavesDist0Location, leavesDist1Location, ropeLocation, grapesLocation));
        modelGenerators.delegateItemModel(block, leavesDist0Location);
    }

    public static net.minecraft.data.models.blockstates.BlockStateGenerator createGrapeLeaves(Block leaveBlock, ResourceLocation leavesDist0, ResourceLocation leavesDist1, ResourceLocation ropeBase, ResourceLocation grapesLoc)
    {
        return MultiPartGenerator.multiPart(leaveBlock)
                .with(Condition.condition().term(GrapeLeavesBlock.DISTANCE, 0), Variant.variant().with(VariantProperties.MODEL, leavesDist0))
                .with(Condition.condition().term(GrapeLeavesBlock.DISTANCE, 1).term(BlockStateProperties.AXIS, Direction.Axis.X), Variant.variant().with(VariantProperties.MODEL, leavesDist1).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
                .with(Condition.condition().term(GrapeLeavesBlock.DISTANCE, 1).term(BlockStateProperties.AXIS, Direction.Axis.Z), Variant.variant().with(VariantProperties.MODEL, leavesDist1))
                .with(Condition.condition().term(GrapeLeavesBlock.GRAPES, true), Variant.variant().with(VariantProperties.MODEL, grapesLoc))
                .with(Condition.condition().term(BlockStateProperties.AXIS, Direction.Axis.X), Variant.variant().with(VariantProperties.MODEL, ropeBase).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, false))
                .with(Condition.condition().term(BlockStateProperties.AXIS, Direction.Axis.Z), Variant.variant().with(VariantProperties.MODEL, ropeBase).with(VariantProperties.X_ROT, VariantProperties.Rotation.R90).with(VariantProperties.UV_LOCK, false))
                ;

    }

    private static ModelTemplate createVanillaModel(String parent, TextureSlot... requiredTextures) {
        return new ModelTemplate(Optional.of(new ResourceLocation("minecraft", "block/" + parent)), Optional.empty(), requiredTextures);
    }

    private static ModelTemplate createVanillaModel(String parent, String variant, TextureSlot... requiredTextures) {
        return new ModelTemplate(Optional.of(new ResourceLocation("minecraft", "block/" + parent)), Optional.of(variant), requiredTextures);
    }

    private static ModelTemplate createModdedModel(String parent, TextureSlot... requiredTextures) {
        return new ModelTemplate(Optional.of(new ResourceLocation(MOD_ID, "block/" + parent)), Optional.empty(), requiredTextures);
    }

    private static ModelTemplate createModdedModel(String parent, String variant, TextureSlot... requiredTextures) {
        return new ModelTemplate(Optional.of(new ResourceLocation(MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextures);
    }

    private static ModelTemplate createPathModel(String parent, String variant, TextureSlot... requiredTextures) {
        return new ModelTemplate(Optional.of(new ResourceLocation(MOD_ID, "block/" + parent)), Optional.of(variant), requiredTextures);
    }
}
