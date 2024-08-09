package com.blockmasters.fuelmastermain;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class FuelMasterMain extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("FuelMaster has been enabled");
    }

    @Override
    public void onDisable() {
        getLogger().info("FuelMaster has been disabled");
    }

    @EventHandler
    public void onFurnaceBurn(FurnaceBurnEvent event) {
        if (event.getFuel() != null && event.getFuel().getType() != Material.AIR) {
            if (event.getFuel().hasItemMeta() && event.getFuel().getItemMeta().hasEnchants()) {
                event.setCancelled(true);
            }
        }
    }
}
