package org.fantomrat.tabcompletetest;

import org.bukkit.plugin.java.JavaPlugin;

public final class Tabcompletetest extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("xyucocieblan").setExecutor(new Command());
        getCommand("xyucocieblan").setTabCompleter(new TabComplete());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
