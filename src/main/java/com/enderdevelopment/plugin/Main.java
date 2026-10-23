package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin enabled!");
        getCommand("ciao").setExecutor((sender, command, label, args) -> {
            sender.sendMessage("Ciao!");
            return true;
        });
    }
    
    @Override
    public void onDisable() {
        getLogger().info("Plugin disabled!");
    }
}