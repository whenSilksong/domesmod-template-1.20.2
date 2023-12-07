package net.dome.domesmod;

import net.dome.domesmod.block.ModBlocks;
import net.dome.domesmod.item.ModItemGroups;
import net.dome.domesmod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Domesmod implements ModInitializer {
	public static final String MOD_ID = "domesmod";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();



	}
}