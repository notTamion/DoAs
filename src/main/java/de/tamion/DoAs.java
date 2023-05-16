package de.tamion;

import de.tamion.commands.As;
import org.bukkit.plugin.java.JavaPlugin;

public final class DoAs extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("as").setExecutor(new As());
    }
}
