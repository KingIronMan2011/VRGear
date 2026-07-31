package net.vrgear.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.vrgear.VRGearMod;

public class WCItems {
    public static final ResourceKey<Item> OCULUS_HEADSET_ID = key("oculus_headset");
    public static final ResourceKey<Item> OCULUS_CONTROLLER_ID = key("oculus_controller");
    public static final Item OCULUS_HEADSET = register(OCULUS_HEADSET_ID,
            new Item(new Item.Properties().setId(OCULUS_HEADSET_ID).equippable(EquipmentSlot.HEAD)));
    public static final Item OCULUS_CONTROLLER = register(OCULUS_CONTROLLER_ID,
            new Item(new Item.Properties().setId(OCULUS_CONTROLLER_ID).stacksTo(1)));

    private static ResourceKey<Item> key(String path) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(VRGearMod.MOD_ID, path));
    }

    private static Item register(ResourceKey<Item> key, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, key, item);
    }

    public static void init() { }

}
