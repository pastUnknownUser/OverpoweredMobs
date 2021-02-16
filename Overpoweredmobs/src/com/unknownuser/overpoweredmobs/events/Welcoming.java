package com.unknownuser.overpoweredmobs.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Welcoming implements Listener {

    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.RED + "[OverPoweredMobs] This plugin is made by UnknownUser and inspired by Proxo/uMadLol because he wanted minecraft to be harder.");
    }


}
