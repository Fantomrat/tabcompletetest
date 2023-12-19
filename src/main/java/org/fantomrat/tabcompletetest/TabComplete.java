package org.fantomrat.tabcompletetest;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Collections;
import java.util.List;

public class TabComplete implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {
        if (args.length == 1){
            return Collections.singletonList("ХУЙ СОСИ ЕБЛАН");
        }
        else return null;

    }
}
