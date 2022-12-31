package me.ghggames.lobby;

import me.ghggames.lobby.commands.DiscordCommand;
import me.ghggames.lobby.commands.WebsiteCommand;
import me.ghggames.lobby.listeners.BlockBreakListener;
import me.ghggames.lobby.listeners.ConnectionListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Lobby extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        PluginManager pluginManager = Bukkit.getPluginManager();
        pluginManager.registerEvents(new ConnectionListeners(), this);
        pluginManager.registerEvents(new BlockBreakListener(), this);

        this.getCommand("discord").setExecutor(new DiscordCommand());
        this.getCommand("website").setExecutor(new WebsiteCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
