package net.mcs3.elixiremporium;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.mcs3.elixiremporium.data.worldgen.features.ModTreeFeatures;
import net.mcs3.elixiremporium.init.ModBlocks;
import net.mcs3.elixiremporium.util.RegistryHandler;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.apache.logging.log4j.LogManager;

public class ElixirEmporium implements ModInitializer {

	public static final String MOD_ID = "elixiremporium";
	public static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static ElixirEmporium INSTANCE;

	public static CreativeModeTab ITEMGROUPDECO = FabricItemGroupBuilder.build(
			new ResourceLocation("elixiremporium", "item_group_deco"),
			() -> new ItemStack(ModBlocks.GLAZED_POT_4.asItem()));

	public static CreativeModeTab ITEMGROUPAG = FabricItemGroupBuilder.build(
			new ResourceLocation("elixiremporium", "item_group_ag"),
			() -> new ItemStack(Items.WHEAT)); //TODO Update Item

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		INSTANCE = this;

		RegistryHandler.onBlockRegistry();
		RegistryHandler.onItemRegistry();
		RegistryHandler.onBlockEntityRegistry();

		ModTreeFeatures.init();

		LOGGER.info("Scott's Elixir Emporium loaded!");
	}
}
