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
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.Display;

public class GUIFocusChecker extends Gui {
    private String isFocused;

    public GUIFocusChecker(Minecraft mc) {
        ScaledResolution resolution = new ScaledResolution(mc); // Grab Minecraft, from which we can get the required
        int width = resolution.getScaledWidth();                // resolution and player inventory.
        int height = resolution.getScaledHeight();
        int heightOffset = 48;  // Offset from the bottom of the screen to draw the GUI element — required to avoid
                                // drawing over default Minecraft UI.

        isFocused = Display.isActive() ? "Focused" : "Unfocused"; // Get the Minecraft window focus state from LWJGL.

        Iterable<ItemStack> playerArmour = mc.player.getArmorInventoryList(); // Grab Iterable ItemStack.

        for (ItemStack stack : playerArmour) { // Iterate over the player's armour inventory.
            if (!stack.isEmpty()) { // If there's a non-empty armour slot, set heightOffset to be slightly larger to
                heightOffset = 58;  // avoid interfering with the player's armour bar.
            }
        }

        drawCenteredString (mc.fontRenderer, isFocused, width / 2, height - heightOffset, Integer.parseInt("FFAA00", 16));
    }
}
