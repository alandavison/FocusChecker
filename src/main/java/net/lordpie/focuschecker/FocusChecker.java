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

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = FocusChecker.MODID, name = FocusChecker.NAME, version = FocusChecker.VERSION)
public class FocusChecker {
    public static final String MODID = "focuschecker"; //
    public static final String NAME = "Focus Checker"; // Forge @Mod information.
    public static final String VERSION = "0.0.3";      //

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) { // Registered to be called post-forge-initialisation.
        MinecraftForge.EVENT_BUS.register(new GUIHandler()); // Register GUI update handler function.
    }
}
