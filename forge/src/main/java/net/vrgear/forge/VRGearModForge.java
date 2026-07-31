package net.vrgear.forge;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.vrgear.VRGearMod;
import net.vrgear.common.WCItems;

@Mod(VRGearMod.MOD_ID)
@Mod.EventBusSubscriber(modid = VRGearMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class VRGearModForge {
    public VRGearModForge() {
        VRGearMod.init();
    }

    @SubscribeEvent
    public static void addCreativeItems(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(WCItems.OCULUS_HEADSET);
            event.accept(WCItems.OCULUS_CONTROLLER);
        }
    }
}
