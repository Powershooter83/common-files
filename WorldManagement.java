package me.prouge.worldManagement;

import me.prouge.worldManagement.utils.CommandRegistry;
import me.prouge.worldManagement.utils.ExecuteCommand;
import org.bukkit.plugin.java.JavaPlugin;

public class WorldManagement extends JavaPlugin {
    private static WorldManagement instance = null;

    private CommandRegistry commandRegistry;
    private TestCommand testCommand;


    @Override
    public void onEnable() {
        instance = this;

        this.commandRegistry = new CommandRegistry(instance);

        getCommand("world").setExecutor(new ExecuteCommand());



    }


    public static WorldManagement getInstance() {
        return WorldManagement.instance;
    }

    public CommandRegistry getCommandRegistry(){
        return this.commandRegistry;
    }





}
