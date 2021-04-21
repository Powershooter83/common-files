package me.prouge.worldManagement.commands;

import me.prouge.worldManagement.WorldManagement;
import org.bukkit.entity.Player;


public abstract class SubCommand {

    protected final WorldManagement plugin;

    public SubCommand(WorldManagement plugin) {
        this.plugin = plugin;
    }

    public abstract String getName();

    public abstract String getDescription();

    public abstract String getPermission();

    public abstract String[] getArguments();

    public abstract void performCommand(Player player, String[] args);

    protected WorldManagement getPlugin() {
        return this.plugin;
    }



}
