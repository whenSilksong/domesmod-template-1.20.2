package net.dome.domesmod.item;

import net.dome.domesmod.Domesmod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //adding new Items

    public static final Item GLASS_SWORD = registerItem("glas_sword", new SwordItem(ModToolMaterial.GLAS, 1, 1, new FabricItemSettings()));
    //Sun Set
     public static final Item SUNPICKAXE = registerItem("sunpickaxe", new PickaxeItem(ModToolMaterial.SUNSET, 2, -2f, new FabricItemSettings()));
    public static final Item SUNSWORD = registerItem("sunsword", new SwordItem(ModToolMaterial.SUNSET, 10, 0f, new FabricItemSettings()));
    public static final Item SUNAXE = registerItem("sunaxe", new AxeItem(ModToolMaterial.SUNSET, 6.0f, -2.5f, new FabricItemSettings()));
    public static final Item SUNSHOVEL = registerItem("sunshovel", new ShovelItem(ModToolMaterial.SUNSET, 2.5f, -2f, new FabricItemSettings()));
    public static final Item SUNHOE = registerItem("sunhoe", new HoeItem(ModToolMaterial.SUNSET, 1, 0f, new FabricItemSettings()));
    public static final Item GLOWSTONE_INGOT = registerItem("glowstone_ingot", new Item(new FabricItemSettings()));

    //Deepsea Set
    public static final Item DEEPSEA_SWORD = registerItem("deepsea_sword", new SwordItem(ModToolMaterial.SUNSET, 10, 0f, new FabricItemSettings())); //same ModToolMaterial like Sun-Set


    private static void addItemsToIngredientItemsGroup(FabricItemGroupEntries entries) {
        entries.add(GLOWSTONE_INGOT);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Domesmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Domesmod.LOGGER.info("Registering Mod Items for " + Domesmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemsGroup);

    }
}