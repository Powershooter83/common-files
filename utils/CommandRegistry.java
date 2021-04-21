package me.prouge.worldManagement.utils;

import me.prouge.worldManagement.WorldManagement;
import me.prouge.worldManagement.commands.SubCommand;

import java.util.ArrayList;

public class CommandRegistry {

    private final ArrayList<SubCommand> subCommandArrayList = new ArrayList<>();
    private TestCommand testCommand;


    public CommandRegistry(WorldManagement plugin) {
        //ADD THE COMMANDS HERE
        this.testCommand = new TestCommand(plugin);
        subCommandArrayList.add(this.testCommand);

    }

    public SubCommand getCommand(String name) {
        for (SubCommand subCommand : subCommandArrayList) {
            if (subCommand.getName().equals(name)) {
                return subCommand;
            }
        }
        return null;
    }

    public ArrayList<SubCommand> getSubCommandArrayList() {
        return subCommandArrayList;
    }

    public TestCommand getTestCommand() {
        return this.testCommand;
    }


}
