package de.tamion;

import de.tamion.commands.As;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class DoAs extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("as").setExecutor(new As());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
