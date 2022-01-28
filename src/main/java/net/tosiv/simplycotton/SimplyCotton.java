package net.tosiv.simplycotton;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tosiv.simplycotton.util.ModLootTableModifiers;
import net.tosiv.simplycotton.util.registry.ModBlocks;
import net.tosiv.simplycotton.util.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimplyCotton implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "simplycotton";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	public static final ItemGroup COTTON_GROUP = FabricItemGroupBuilder.create(
			new Identifier("simplycotton", "sc"))
			.icon(() -> new ItemStack(ModItems.COTTON_BALL)).build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModBlocks.registerBlocks();
		ModItems.registerItems();

		ModLootTableModifiers.modifyLootTables();

		LOGGER.info("Hello Fabric world!");
	}
}
