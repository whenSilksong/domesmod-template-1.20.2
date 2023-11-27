package net.dome.domesmod.item;

import net.dome.domesmod.Domesmod;
import net.dome.domesmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup SAPPHIRE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Domesmod.MOD_ID, "sapphire"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sapphire")).icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {
        entries.add(ModItems.SAPPHIRE);
        entries.add(ModItems.RAW_SAPPHIRE);
        entries.add(ModBlocks.SAPPHIRE_BLOCK);
    }).build());

    public static void registerItemGroups() {
        Domesmod.LOGGER.info("Registering Item Groups for " + Domesmod.MOD_ID);
    }
}
