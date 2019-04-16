package net.lordpie.focuschecker;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = FocusChecker.MODID, name = FocusChecker.NAME, version = FocusChecker.VERSION)
public class FocusChecker {
    public static final String MODID = "focuschecker";
    public static final String NAME = "Focus Checker";
    public static final String VERSION = "0.1";

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        MinecraftForge.EVENT_BUS.register(new GUIHandler());
    }
}
