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

    public static final ItemGroup DOMESMOD_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Domesmod.MOD_ID, "domesmod"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.domesmod")).icon(() -> new ItemStack(ModItems.SODALITE)).entries((displayContext, entries) -> {

        entries.add(ModItems.SODALITE);
        entries.add(ModBlocks.SODALITE_ORE);
        entries.add(ModItems.SODALITE_SWORD);
        entries.add(ModItems.SODALITE_PICKAXE);
        entries.add(ModItems.RAW_SODALITE);
        entries.add(ModBlocks.SODALITE_BLOCK);


    }).build());

    public static void registerItemGroups() {
        Domesmod.LOGGER.info("Registering Item Groups for " + Domesmod.MOD_ID);
    }
}
