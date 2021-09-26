package com.equiscraft.chatformatter;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

public class ChatFormat implements Listener {
    public Main main;
    public ChatFormat(Main main) {
        this.main = main;
    }

    @EventHandler
    public void chatFormat(PlayerChatEvent e) {
        Player p = e.getPlayer();

        if (p.hasPermission("essentials.colour")) {
            e.setFormat(new Formatter().getPrefix(p).replace("&", "§") + p.getDisplayName() + "§8 » §f" + e.getMessage());
        } else {
            e.setFormat(new Formatter().getPrefix(p).replace("&", "§") + p.getDisplayName() + "§8 » §f" + e.getMessage());
        }
    }
}