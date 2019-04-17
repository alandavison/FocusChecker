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
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GUIHandler {

    @SubscribeEvent // Subscribe to GUI update events.
    public void onRenderGUI(RenderGameOverlayEvent.Post e) {
        if (e.getType() != RenderGameOverlayEvent.ElementType.EXPERIENCE) return; // Ensure we only draw when the EXP bar isn't being updated.
        new GUIFocusChecker(Minecraft.getMinecraft()); // Create instance of GUIFocusChecker class to draw GUI element.
    }
}
