package me.ghggames.lobby.listeners;

import me.ghggames.lobby.scoreboard.TestScoreboard;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class ConnectionListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        event.setJoinMessage(ChatColor.YELLOW + player.getName() + " " + ChatColor.GRAY + "hat die" + " " + ChatColor.LIGHT_PURPLE + "Lobby" + " " + ChatColor.GRAY + "betreten");
        player.getPlayerTime();

        player.sendTitle("§aWillkommen zurück" , "" + ChatColor.RED + player.getDisplayName());

        if (player.getPlayerTime() == 0)
            player.sendMessage(ChatColor.LIGHT_PURPLE + "Willkommen auf diesem Netzwerk. Schau dich gerne ein bisschen um.");
        new TestScoreboard(player);


    }
    @EventHandler
    public void onQuit(PlayerQuitEvent event) {
        Player player = event.getPlayer();
        event.setQuitMessage(ChatColor.YELLOW + player.getName() + " " + ChatColor.GRAY + "hat die" + " " + ChatColor.LIGHT_PURPLE + "Lobby" + " " + ChatColor.GRAY + "verlassen");
    }
}
