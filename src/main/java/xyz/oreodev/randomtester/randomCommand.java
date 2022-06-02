package xyz.oreodev.randomtester;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class randomCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            Bukkit.broadcastMessage(ChatColor.GREEN + "뽑은 칸 : " + randomizer.random(RandomTester.list));
        }
        return false;
    }
}
