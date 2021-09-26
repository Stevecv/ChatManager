package com.equiscraft.chatformatter;

import net.milkbowl.vault.chat.Chat;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.jetbrains.annotations.Nullable;

public class Formatter {
    private static @Nullable RegisteredServiceProvider<Chat> chatInst = Bukkit.getServicesManager().getRegistration(Chat.class);
    private static Chat chat = chatInst.getProvider();

    public static String getPrefix(Player p) {
        return chat.getPlayerPrefix(p);
    }
}
