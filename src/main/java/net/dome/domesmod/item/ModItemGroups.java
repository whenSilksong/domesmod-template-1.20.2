package net.dome.domesmod.item;

import net.dome.domesmod.Domesmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {

    public static final ItemGroup DOMESMOD_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Domesmod.MOD_ID, "domesmod"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.domesmod")).icon(() -> new ItemStack(ModItems.GLOWSTONE_INGOT)).entries((displayContext, entries) -> {

        //Sun/Glowstone Set
        entries.add(ModItems.SUNSWORD);
        entries.add(ModItems.SUNPICKAXE);
        entries.add(ModItems.SUNAXE);
        entries.add(ModItems.SUNSHOVEL);
        entries.add(ModItems.SUNHOE);
        entries.add(ModItems.GLOWSTONE_INGOT);


        //Deepsea Set
        entries.add(ModItems.DEEPSEA_SWORD);
        entries.add(ModItems.GLASS_SWORD);


    }).build());

    public static void registerItemGroups() {
        Domesmod.LOGGER.info("Registering Item Groups for " + Domesmod.MOD_ID);
    }
}
