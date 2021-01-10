package xyz.namekun.vehiclesapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

public class VehiclesAPICommand implements CommandExecutor {

    public static boolean isInt(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String prefix = ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("prefix"));
        //mainCommand
        if (command.getName().equalsIgnoreCase("vehicles")) {
            String vehicleType[] = {ChatColor.GOLD + "bike", ChatColor.GOLD + "broom", ChatColor.GOLD + "car", ChatColor.GOLD + "drill", ChatColor.GOLD + "helicopter", ChatColor.GOLD + "hoverbike", ChatColor.GOLD + "parachute", ChatColor.GOLD + "plane", ChatColor.GOLD + "racingcar", ChatColor.GOLD + "raft", ChatColor.GOLD + "sportbike", ChatColor.GOLD + "submarine", ChatColor.GOLD + "tank", ChatColor.GOLD + "tractor", ChatColor.GOLD + "train"};
            //String vehicleType[] = {ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("vehicleType.bike")) , ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("vehicleType.broom")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.car")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.drill")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.helicopter")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.hoverbike")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.parachute")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.plane")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.racingcar")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.raft")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.sportbike")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.submarine")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.tank")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.tractor")), ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("type.vehicle.train"))};
            String separation = ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("separation"));
            if (!(sender instanceof Player)) {
                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.fromConsole")));
                return true;
            } else {
                if (args.length == 0) {
                    sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&',VehiclesAPI.plugin.getConfig().getString("message.noArgs")));
                    return true;
                } else if (args[0].equalsIgnoreCase("help")) {
                    for (String helpMessage : VehiclesAPI.plugin.getConfig().getStringList("message.helpMessage")) {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', helpMessage));
                    }
                    return true;
                } else if (args[0].equalsIgnoreCase("list")) {
                    if (args.length == 1) {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                        return true;
                    } else if (args[1].equalsIgnoreCase("bike")) {
                        ((Player) sender).performCommand("bikelist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("broom")) {
                        ((Player) sender).performCommand("broomlist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("car")) {
                        ((Player) sender).performCommand("carlist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("drill")) {
                        ((Player) sender).performCommand("drilllist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("helicopter")) {
                        ((Player) sender).performCommand("helicopterlist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("hoverbike")) {
                        ((Player) sender).performCommand("hoverbikelist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("parachute")) {
                        ((Player) sender).performCommand("parachutelist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("plane")) {
                        ((Player) sender).performCommand("planelist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("racingcar")) {
                        ((Player) sender).performCommand("racingcarlist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("raft")) {
                        ((Player) sender).performCommand("raftlist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("sportbike")) {
                        ((Player) sender).performCommand("sportbikelist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("submarine")) {
                        ((Player) sender).performCommand("submarinelist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("tank")) {
                        ((Player) sender).performCommand("tanklist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("tractor")) {
                        ((Player) sender).performCommand("tractorlist");
                        return true;
                    } else if (args[1].equalsIgnoreCase("train")) {
                        ((Player) sender).performCommand("trainlist");
                        return true;
                    } else {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                        return true;
                    }
                } else if (args[0].equalsIgnoreCase("get")) {
                    if (args.length == 1) {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                        return true;
                    } else if (args[1].equalsIgnoreCase("bike")) {
                        if (args.length == 2) {
                            for (String bikeType : VehiclesAPI.plugin.getConfig().getStringList("type.bike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', bikeType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("BLACK")) {
                            ((Player) sender).performCommand("getbike BLACK");
                            return true;
                        } else if (args[2].equalsIgnoreCase("ORANGE")) {
                            ((Player) sender).performCommand("getbike ORANGE");
                            return true;
                        } else if (args[2].equalsIgnoreCase("RED")) {
                            ((Player) sender).performCommand("getbike RED");
                            return true;
                        } else {
                            for (String bikeType : VehiclesAPI.plugin.getConfig().getStringList("type.bike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', bikeType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("broom")) {
                        if (args.length == 2) {
                            for (String broomType : VehiclesAPI.plugin.getConfig().getStringList("type.broom")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', broomType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("B1")) {
                            ((Player) sender).performCommand("getbroom B1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("B2")) {
                            ((Player) sender).performCommand("getbroom B2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("B3")) {
                            ((Player) sender).performCommand("getbroom B3");
                            return true;
                        } else {
                            for (String broomType : VehiclesAPI.plugin.getConfig().getStringList("type.broom")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', broomType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("car")) {
                        if (args.length == 2) {
                            for (String carType : VehiclesAPI.plugin.getConfig().getStringList("type.car")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', carType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("BLACK")) {
                            ((Player) sender).performCommand("getcar BLACK");
                            return true;
                        } else if (args[2].equalsIgnoreCase("YELLOW")) {
                            ((Player) sender).performCommand("getcar YELLOW");
                            return true;
                        } else if (args[2].equalsIgnoreCase("MAGENTA")) {
                            ((Player) sender).performCommand("getcar MAGENTA");
                            return true;
                        } else {
                            for (String carType : VehiclesAPI.plugin.getConfig().getStringList("type.car")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', carType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("drill")) {
                        if (args.length == 2) {
                            for (String drillType : VehiclesAPI.plugin.getConfig().getStringList("type.drill")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', drillType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("D1")) {
                            ((Player) sender).performCommand("getdrill D1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("D2")) {
                            ((Player) sender).performCommand("getdrill D2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("D3")) {
                            ((Player) sender).performCommand("getdrill D3");
                            return true;
                        } else {
                            for (String drillType : VehiclesAPI.plugin.getConfig().getStringList("type.drill")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', drillType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("helicopter")) {
                        if (args.length == 2) {
                            for (String helicopterType : VehiclesAPI.plugin.getConfig().getStringList("type.helicopter")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', helicopterType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("H1")) {
                            ((Player) sender).performCommand("gethelicopter H1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("H2")) {
                            ((Player) sender).performCommand("gethelicopter H2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("H3")) {
                            ((Player) sender).performCommand("gethelicopter H3");
                            return true;
                        } else {
                            for (String helicopterType : VehiclesAPI.plugin.getConfig().getStringList("type.helicopter")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', helicopterType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("hoverbike")) {
                        if (args.length == 2) {
                            for (String hoverbikeType : VehiclesAPI.plugin.getConfig().getStringList("type.hoverbike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', hoverbikeType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("HB1")) {
                            ((Player) sender).performCommand("gethoverbike HB1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("HB2")) {
                            ((Player) sender).performCommand("gethoverbike HB2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("HB3")) {
                            ((Player) sender).performCommand("gethoverbike HB3");
                            return true;
                        } else {
                            for (String hoverbikeType : VehiclesAPI.plugin.getConfig().getStringList("type.hoverbike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', hoverbikeType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("parachute")) {
                        if (args.length == 2) {
                            for (String parachuteType : VehiclesAPI.plugin.getConfig().getStringList("type.parachute")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', parachuteType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("PC1")) {
                            ((Player) sender).performCommand("getparachute PC1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("PC2")) {
                            ((Player) sender).performCommand("getparachute PC2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("PC3")) {
                            ((Player) sender).performCommand("getparachute PC3");
                            return true;
                        } else {
                            for (String parachuteType : VehiclesAPI.plugin.getConfig().getStringList("type.parachute")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', parachuteType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("plane")) {
                        if (args.length == 2) {
                            for (String planeType : VehiclesAPI.plugin.getConfig().getStringList("type.plane")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', planeType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("P1")) {
                            ((Player) sender).performCommand("getplane P1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("P2")) {
                            ((Player) sender).performCommand("getplane P2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("P3")) {
                            ((Player) sender).performCommand("getplane P3");
                            return true;
                        } else {
                            for (String planeType : VehiclesAPI.plugin.getConfig().getStringList("type.plane")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', planeType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("racingcar")) {
                        if (args.length == 2) {
                            for (String racingcarType : VehiclesAPI.plugin.getConfig().getStringList("type.racingcar")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', racingcarType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("YELLOW")) {
                            ((Player) sender).performCommand("getracingcar YELLOW");
                            return true;
                        } else if (args[2].equalsIgnoreCase("RED")) {
                            ((Player) sender).performCommand("getracingcar RED");
                            return true;
                        } else if (args[2].equalsIgnoreCase("PURPLE")) {
                            ((Player) sender).performCommand("getracingcar PURPLE");
                            return true;
                        } else {
                            for (String racingcarType : VehiclesAPI.plugin.getConfig().getStringList("type.racingcar")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', racingcarType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("raft")) {
                        if (args.length == 2) {
                            for (String raftType : VehiclesAPI.plugin.getConfig().getStringList("type.raft")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', raftType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("OLD")) {
                            ((Player) sender).performCommand("getraft OLD");
                            return true;
                        } else if (args[2].equalsIgnoreCase("NETHER")) {
                            ((Player) sender).performCommand("getraft NETHER");
                            return true;
                        } else if (args[2].equalsIgnoreCase("PIRATE")) {
                            ((Player) sender).performCommand("getraft PIRATE");
                            return true;
                        } else {
                            for (String raftType : VehiclesAPI.plugin.getConfig().getStringList("type.raft")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', raftType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("sportbike")) {
                        if (args.length == 2) {
                            for (String sportbikeType : VehiclesAPI.plugin.getConfig().getStringList("type.sportbike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', sportbikeType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("SB1")) {
                            ((Player) sender).performCommand("getsportbike SB1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("SB2")) {
                            ((Player) sender).performCommand("getsportbike SB2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("SB3")) {
                            ((Player) sender).performCommand("getsportbike SB3");
                            return true;
                        } else {
                            for (String sportbikeType : VehiclesAPI.plugin.getConfig().getStringList("type.sportbike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', sportbikeType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("submarine")) {
                        if (args.length == 2) {
                            for (String submarineType : VehiclesAPI.plugin.getConfig().getStringList("type.submarine")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', submarineType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("S1")) {
                            ((Player) sender).performCommand("getsubmarine S1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("S2")) {
                            ((Player) sender).performCommand("getsubmarine S2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("S3")) {
                            ((Player) sender).performCommand("getsubmarine S3");
                            return true;
                        } else {
                            for (String submarineType : VehiclesAPI.plugin.getConfig().getStringList("type.submarine")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', submarineType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("tank")) {
                        if (args.length == 2) {
                            for (String tankType : VehiclesAPI.plugin.getConfig().getStringList("type.tank")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', tankType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("T1")) {
                            ((Player) sender).performCommand("gettank T1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("T2")) {
                            ((Player) sender).performCommand("gettank T2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("T3")) {
                            ((Player) sender).performCommand("gettank T3");
                            return true;
                        } else {
                            for (String tankType : VehiclesAPI.plugin.getConfig().getStringList("type.tank")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', tankType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("tractor")) {
                        if (args.length == 2) {
                            for (String tractorType : VehiclesAPI.plugin.getConfig().getStringList("type.tractor")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', tractorType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("YELLOW")) {
                            ((Player) sender).performCommand("gettractor YELLOW");
                            return true;
                        } else if (args[2].equalsIgnoreCase("RED")) {
                            ((Player) sender).performCommand("gettractor RED");
                            return true;
                        } else if (args[2].equalsIgnoreCase("GREEN")) {
                            ((Player) sender).performCommand("gettractor GREEN");
                            return true;
                        } else {
                            for (String tractorType : VehiclesAPI.plugin.getConfig().getStringList("type.tractor")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', tractorType));
                            }
                            return true;
                        }
                    } else if (args[1].equalsIgnoreCase("train")) {
                        if (args.length == 2) {
                            for (String trainType : VehiclesAPI.plugin.getConfig().getStringList("type.train")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', trainType));
                            }
                            return true;
                        } else if (args[2].equalsIgnoreCase("T1")) {
                            ((Player) sender).performCommand("gettrain T1");
                            return true;
                        } else if (args[2].equalsIgnoreCase("T2")) {
                            ((Player) sender).performCommand("gettrain T2");
                            return true;
                        } else if (args[2].equalsIgnoreCase("T3")) {
                            ((Player) sender).performCommand("gettrain T3");
                            return true;
                        } else {
                            for (String trainType : VehiclesAPI.plugin.getConfig().getStringList("type.train")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', trainType));
                            }
                            return true;
                        }
                    }
                    else {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                        return true;
                    }
                } else if (args[0].equalsIgnoreCase("shop")) {
                    if (args.length == 1) {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                        return true;
                    } else if (args[1].equalsIgnoreCase("bike")) {
                        ((Player) sender).performCommand("bikeshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("broom")) {
                        ((Player) sender).performCommand("broomshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("car")) {
                        ((Player) sender).performCommand("carshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("drill")) {
                        ((Player) sender).performCommand("drillshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("helicopter")) {
                        ((Player) sender).performCommand("helicoptershop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("hoverbike")) {
                        ((Player) sender).performCommand("hoverbikeshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("parachute")) {
                        ((Player) sender).performCommand("parachuteshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("plane")) {
                        ((Player) sender).performCommand("planeshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("racingcar")) {
                        ((Player) sender).performCommand("racingcarshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("raft")) {
                        ((Player) sender).performCommand("raftshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("sportbike")) {
                        ((Player) sender).performCommand("sportbikeshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("submarine")) {
                        ((Player) sender).performCommand("submarineshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("tank")) {
                        ((Player) sender).performCommand("tankshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("tractor")) {
                        ((Player) sender).performCommand("tractorshop");
                        return true;
                    } else if (args[1].equalsIgnoreCase("train")) {
                        ((Player) sender).performCommand("trainshop");
                        return true;
                    } else {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                        return true;
                    }
                } else if (args[0].equalsIgnoreCase("reload")) {
                    ((Player) sender).performCommand("vehiclesreload");
                    return true;
                } /*else if (args[0].equalsIgnoreCase("clear")) {
                    if (args.length > 2) {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.clear.usage")));
                        return true;
                    } else {
                        if (args.length == 2) {
                            if (isInt(args[1])) {
                                int clearArg = Integer.parseInt(args[1]);
                                if (clearArg < 1) {
                                    sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.clear.isNotPositive")));
                                    return true;
                                }
                                if (args.length == 3) {
                                    if (args[2].equalsIgnoreCase("true")) {
                                        ((Player) sender).performCommand("vehicleclear " + clearArg + " true");
                                        return true;
                                    } else {
                                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.clear.isNotTrue")));
                                        return true;
                                    }
                                } else {
                                    ((Player) sender).performCommand("vehicleclear " + clearArg);
                                    return true;
                                }
                            } else {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.clear.isNotInt")));
                                return true;
                            }
                        }
                    }
                }*/
                else if (args[0].equalsIgnoreCase("repair")) {
                    ((Player) sender).performCommand("repairvehicle");
                    return true;
                }
            }
        }
        return false;
    }
}

