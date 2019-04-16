package net.lordpie.focuschecker;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.opengl.Display;

public class GUIFocusChecker extends Gui {
    private String isFocused;

    public GUIFocusChecker(Minecraft mc) {
        ScaledResolution resolution = new ScaledResolution(mc);
        int width = resolution.getScaledWidth();
        int height = resolution.getScaledHeight();

        isFocused = Display.isActive() ? "Focused" : "Unfocused";

        drawCenteredString (mc.fontRenderer, isFocused, width / 2, height - 48, Integer.parseInt("FFAA00", 16));
    }
}
