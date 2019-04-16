/*
Copyright 2019 Alan Davison (LordPie)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

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
