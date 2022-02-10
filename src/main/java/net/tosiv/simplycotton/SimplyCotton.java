package net.tosiv.simplycotton;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.tosiv.simplycotton.config.SimplyCottonConfig;
import net.tosiv.simplycotton.util.ModLootTableModifiers;
import net.tosiv.simplycotton.util.registry.ModBlocks;
import net.tosiv.simplycotton.util.registry.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SimplyCotton implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "simplycotton";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static SimplyCottonConfig config;
	public static Gson configData = new GsonBuilder().setPrettyPrinting().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
	public static final Path configPath = Paths.get("config/simply-cotton.json");

	public static final ItemGroup COTTON_GROUP = FabricItemGroupBuilder.create(
			new Identifier(MOD_ID, "sc"))
			.icon(() -> new ItemStack(ModItems.COTTON_BALL)).build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModBlocks.registerBlocks();
		ModItems.registerItems();

		ModLootTableModifiers.modifyLootTables();

		SimplyCottonConfig.readData();

		LOGGER.info("Simply Cotton Initialized! Have fun!");
	}
}
