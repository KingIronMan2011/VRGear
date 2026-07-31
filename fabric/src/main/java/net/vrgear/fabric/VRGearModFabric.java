package net.vrgear.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.vrgear.VRGearMod;
import net.vrgear.common.WCItems;

public class VRGearModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        VRGearMod.init();
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(entries -> {
            entries.accept(WCItems.OCULUS_HEADSET);
            entries.accept(WCItems.OCULUS_CONTROLLER);
        });
    }
}
