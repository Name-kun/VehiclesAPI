package xyz.namekun.vehiclesapi;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.ArrayList;
import java.util.List;

public class VehiclesAPITabCompleter implements TabCompleter {
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> tabCommand = new ArrayList<String>();
        if (args.length == 1) {
            tabCommand.add("help");
            tabCommand.add("list");
            tabCommand.add("get");
            tabCommand.add("shop");
            tabCommand.add("repair");
            //tabCommand.add("clear");
            tabCommand.add("reload");
            return tabCommand;
        } else if (args.length == 2) {
            if (args[0].equalsIgnoreCase("list")) {
                tabCommand.add("bike");
                tabCommand.add("broom");
                tabCommand.add("car");
                tabCommand.add("drill");
                tabCommand.add("helicopter");
                tabCommand.add("hoverbike");
                tabCommand.add("parachute");
                tabCommand.add("plane");
                tabCommand.add("racingcar");
                tabCommand.add("raft");
                tabCommand.add("sportbike");
                tabCommand.add("submarine");
                tabCommand.add("tank");
                tabCommand.add("tractor");
                tabCommand.add("train");
                return tabCommand;
            } else if (args[0].equalsIgnoreCase("get")) {
                tabCommand.add("bike");
                tabCommand.add("broom");
                tabCommand.add("car");
                tabCommand.add("drill");
                tabCommand.add("helicopter");
                tabCommand.add("hoverbike");
                tabCommand.add("parachute");
                tabCommand.add("plane");
                tabCommand.add("racingcar");
                tabCommand.add("raft");
                tabCommand.add("sportbike");
                tabCommand.add("submarine");
                tabCommand.add("tank");
                tabCommand.add("tractor");
                tabCommand.add("train");
                return tabCommand;
            } else if (args[0].equalsIgnoreCase("shop")) {
                tabCommand.add("bike");
                tabCommand.add("broom");
                tabCommand.add("car");
                tabCommand.add("drill");
                tabCommand.add("helicopter");
                tabCommand.add("hoverbike");
                tabCommand.add("parachute");
                tabCommand.add("plane");
                tabCommand.add("racingcar");
                tabCommand.add("raft");
                tabCommand.add("sportbike");
                tabCommand.add("submarine");
                tabCommand.add("tank");
                tabCommand.add("tractor");
                tabCommand.add("train");
            } /*else if (args[0].equalsIgnoreCase("clear")) {
                if (args.length == 3) {
                    tabCommand.add("true");
                }
            }*/
            return tabCommand;
        }
        if (args.length == 3) {
            if (args[0].equalsIgnoreCase("get")) {
                if (args[1].equalsIgnoreCase("bike")) {
                    tabCommand.add("BLACK");
                    tabCommand.add("ORANGE");
                    tabCommand.add("RED");
                } else if (args[1].equalsIgnoreCase("broom")) {
                    tabCommand.add("B1");
                    tabCommand.add("B2");
                    tabCommand.add("B3");
                } else if (args[1].equalsIgnoreCase("car")) {
                    tabCommand.add("BLACK");
                    tabCommand.add("YELLOW");
                    tabCommand.add("MAGENTA");
                } else if (args[1].equalsIgnoreCase("drill")) {
                    tabCommand.add("D1");
                    tabCommand.add("D2");
                    tabCommand.add("D3");
                } else if (args[1].equalsIgnoreCase("helicopter")) {
                    tabCommand.add("H1");
                    tabCommand.add("H2");
                    tabCommand.add("H3");
                } else if (args[1].equalsIgnoreCase("hoverbike")) {
                    tabCommand.add("HB1");
                    tabCommand.add("HB2");
                    tabCommand.add("HB3");
                } else if (args[1].equalsIgnoreCase("parachute")) {
                    tabCommand.add("PC1");
                    tabCommand.add("PC2");
                    tabCommand.add("PC3");
                } else if (args[1].equalsIgnoreCase("plane")) {
                    tabCommand.add("P1");
                    tabCommand.add("P2");
                    tabCommand.add("P3");
                } else if (args[1].equalsIgnoreCase("racingcar")) {
                    tabCommand.add("YELLOW");
                    tabCommand.add("RED");
                    tabCommand.add("PURPLE");
                } else if (args[1].equalsIgnoreCase("raft")) {
                    tabCommand.add("OLD");
                    tabCommand.add("NETHER");
                    tabCommand.add("PIRATE");
                } else if (args[1].equalsIgnoreCase("sportbike")) {
                    tabCommand.add("SB1");
                    tabCommand.add("SB2");
                    tabCommand.add("SB3");
                } else if (args[1].equalsIgnoreCase("submarine")) {
                    tabCommand.add("S1");
                    tabCommand.add("S2");
                    tabCommand.add("S3");
                } else if (args[1].equalsIgnoreCase("tank")) {
                    tabCommand.add("T1");
                    tabCommand.add("T2");
                    tabCommand.add("T3");
                } else if (args[1].equalsIgnoreCase("tractor")) {
                    tabCommand.add("YELLOW");
                    tabCommand.add("RED");
                    tabCommand.add("GREEN");
                } else if (args[1].equalsIgnoreCase("train")) {
                    tabCommand.add("T1");
                    tabCommand.add("T2");
                    tabCommand.add("T3");
                }
            }
        }
        return tabCommand;
    }
}

