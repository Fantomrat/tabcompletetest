package org.fantomrat.tabcompletetest;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Command implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, org.bukkit.command.Command command, String s, String[] strings) {

        commandSender.sendMessage("хуй");
        return true;
    }
}
