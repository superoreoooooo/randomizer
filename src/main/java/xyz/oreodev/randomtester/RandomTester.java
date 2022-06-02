package xyz.oreodev.randomtester;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class RandomTester extends JavaPlugin {

    public static int[] list = new int[10];

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "hi");
        getCommand("setr").setExecutor(new randomCommand());
        for (int n = 0; n < 5; n++) {
            list[n] = 10;
        }
    }

    @Override
    public void onDisable() {
    }
}
