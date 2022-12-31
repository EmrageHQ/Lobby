package me.ghggames.lobby.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class DiscordCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
       if (sender instanceof Player) {
           Player player = (Player) sender;
           TextComponent c = new TextComponent("§aMein Discord§7: ");

           TextComponent clickme = new TextComponent("§1Discord");
           clickme.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL , "https://discord.gg/FgykqTgTwa"));

           c.addExtra(clickme);
            player.spigot().sendMessage(c);


       }
        return false;
    }
}
