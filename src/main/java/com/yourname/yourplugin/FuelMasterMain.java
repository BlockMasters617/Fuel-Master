package com.blockmasters.yourplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class FuelMasterMain extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("YourPlugin has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("YourPlugin has been disabled.");
    }
}