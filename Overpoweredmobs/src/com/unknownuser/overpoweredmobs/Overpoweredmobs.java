package com.unknownuser.overpoweredmobs;

import com.unknownuser.overpoweredmobs.events.MobEvents;
import com.unknownuser.overpoweredmobs.events.Welcoming;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Overpoweredmobs extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Welcoming(), this);
        getServer().getPluginManager().registerEvents(new MobEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[OverpoweredMobs]: Plugin is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[OverpoweredMobs]: Plugin is disabled");
    }



}
