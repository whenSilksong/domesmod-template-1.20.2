package net.dome.domesmod.item;

import net.dome.domesmod.Domesmod;

import net.dome.domesmod.item.custom.ModArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    //adding new Items
    //Sodaslite Set
    public static final Item RAW_SODALITE = registerItem("raw_sodalite", new Item(new FabricItemSettings()));
    public static final Item SODALITE_PICKAXE = registerItem("sodalite_pickaxe", new PickaxeItem(ModToolMaterial.SUNSET, 2, 2f, new FabricItemSettings()));
    public static final Item SODALITE_SWORD = registerItem("sodalite_sword", new SwordItem(ModToolMaterial.SUNSET, 10, 0f, new FabricItemSettings()));

    //Sun Set
    public static final Item SUNSET = registerItem("sunset", new Item(new FabricItemSettings()));
    public static final Item SUNPICKAXE = registerItem("sunpickaxe", new PickaxeItem(ModToolMaterial.SUNSET, 10, 0f, new FabricItemSettings()));
    public static final Item SUNSWORD = registerItem("sunsword", new SwordItem(ModToolMaterial.SUNSET, 10, 0f, new FabricItemSettings()));
    public static final Item SUNAXE = registerItem("sunaxe", new AxeItem(ModToolMaterial.SUNSET, 10, 0f, new FabricItemSettings()));
    public static final Item SUNSHOVEL = registerItem("sunshovel", new ShovelItem(ModToolMaterial.SUNSET, 10, 0f, new FabricItemSettings()));
    public static final Item SUNHOE = registerItem("sunhoe", new HoeItem(ModToolMaterial.SUNSET, 10, 0f, new FabricItemSettings()));
    public static final Item SUNHELMET = registerItem("sunhelemt", new ArmorItem(ModArmorMaterials.SUNSET, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item SUNCHESTPLATE = registerItem("sunchestplate", new ArmorItem(ModArmorMaterials.SUNSET, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item SUNLEGGINGS = registerItem("sunleggings", new ArmorItem(ModArmorMaterials.SUNSET, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item SUNBOOTS = registerItem("sunboots", new ArmorItem(ModArmorMaterials.SUNSET, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item GLOWSTONE_INGOT = registerItem("glowstone_ingot", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientItemsGroup(FabricItemGroupEntries entries) {
        entries.add(SUNSET);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Domesmod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Domesmod.LOGGER.info("Registering Mod Items for " + Domesmod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemsGroup);

    }
}