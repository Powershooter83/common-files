package me.prouge.worldManagement.utils;

import me.prouge.worldManagement.WorldManagement;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class ExecuteCommand implements CommandExecutor {


    CommandRegistry commandRegistry = WorldManagement.getInstance().getCommandRegistry();

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length > 0) {
                commandRegistry.getSubCommandArrayList().forEach(subCommand -> {
                    if (args[0].equalsIgnoreCase(subCommand.getName())) {
                        String[] argumentsShorted = Arrays.copyOfRange(args, 1, args.length);
                        subCommand.performCommand(player, argumentsShorted);
                    }
                });
            } else {
                commandRegistry.getSubCommandArrayList().forEach(subCommand -> {
                    if (subCommand.getName().equals("list")) {
                        subCommand.performCommand(player, args);
                    }
                });
            }
        }
        return false;
    }


}
