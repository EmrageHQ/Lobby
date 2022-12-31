package me.ghggames.lobby.commands;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class WebsiteCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            TextComponent c = new TextComponent("§2Meine Website§7: ");

            TextComponent clickme = new TextComponent("§2§lWebsite");
            clickme.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL , "https://gamerpvg.vercel.app"));

            c.addExtra(clickme);
            player.spigot().sendMessage(c);


        }
        return false;
    }
}
