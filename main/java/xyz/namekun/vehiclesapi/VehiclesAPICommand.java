package xyz.namekun.vehiclesapi;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Collections;

public class VehiclesAPICommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String prefix = ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("prefix"));
        //mainCommand
        if (command.getName().equalsIgnoreCase("vehicles")) {
            String vehicleType[] = {ChatColor.GOLD + "bike", ChatColor.GOLD + "broom", ChatColor.GOLD + "car", ChatColor.GOLD + "drill", ChatColor.GOLD + "helicopter", ChatColor.GOLD + "hoverbike", ChatColor.GOLD + "parachute", ChatColor.GOLD + "plane", ChatColor.GOLD + "racingcar", ChatColor.GOLD + "raft", ChatColor.GOLD + "sportbike", ChatColor.GOLD + "submarine", ChatColor.GOLD + "tank", ChatColor.GOLD + "tractor", ChatColor.GOLD + "train"};
            String separation = ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("separation"));
            if (!(sender instanceof Player)) {
                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.fromConsole")));
            } else {
                if (args.length == 0) {
                    sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.noArgs")));
                } else if (args[0].equalsIgnoreCase("help")) {
                    for (String helpMessage : VehiclesAPI.plugin.getConfig().getStringList("message.helpMessage")) {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', helpMessage));
                    }
                } else if (args[0].equalsIgnoreCase("list")) {
                    if (args.length == 1) {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                    } else if (args[1].equalsIgnoreCase("bike")) {
                        ((Player) sender).performCommand("bikelist");
                    } else if (args[1].equalsIgnoreCase("broom")) {
                        ((Player) sender).performCommand("broomlist");
                    } else if (args[1].equalsIgnoreCase("car")) {
                        ((Player) sender).performCommand("carlist");
                    } else if (args[1].equalsIgnoreCase("drill")) {
                        ((Player) sender).performCommand("drilllist");
                    } else if (args[1].equalsIgnoreCase("helicopter")) {
                        ((Player) sender).performCommand("helicopterlist");
                    } else if (args[1].equalsIgnoreCase("hoverbike")) {
                        ((Player) sender).performCommand("hoverbikelist");
                    } else if (args[1].equalsIgnoreCase("parachute")) {
                        ((Player) sender).performCommand("parachutelist");
                    } else if (args[1].equalsIgnoreCase("plane")) {
                        ((Player) sender).performCommand("planelist");
                    } else if (args[1].equalsIgnoreCase("racingcar")) {
                        ((Player) sender).performCommand("racingcarlist");
                    } else if (args[1].equalsIgnoreCase("raft")) {
                        ((Player) sender).performCommand("raftlist");
                    } else if (args[1].equalsIgnoreCase("sportbike")) {
                        ((Player) sender).performCommand("sportbikelist");
                    } else if (args[1].equalsIgnoreCase("submarine")) {
                        ((Player) sender).performCommand("submarinelist");
                    } else if (args[1].equalsIgnoreCase("tank")) {
                        ((Player) sender).performCommand("tanklist");
                    } else if (args[1].equalsIgnoreCase("tractor")) {
                        ((Player) sender).performCommand("tractorlist");
                    } else if (args[1].equalsIgnoreCase("train")) {
                        ((Player) sender).performCommand("trainlist");
                    } else {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                    }
                } else if (args[0].equalsIgnoreCase("get")) {
                    if (args.length == 1) {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                    } else if (args[1].equalsIgnoreCase("bike")) {
                        if (args.length == 2) {
                            for (String bikeType : VehiclesAPI.plugin.getConfig().getStringList("type.bike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', bikeType));
                            }
                        } else if (args[2].equalsIgnoreCase("BLACK")) {
                            ((Player) sender).performCommand("getbike BLACK");
                        } else if (args[2].equalsIgnoreCase("ORANGE")) {
                            ((Player) sender).performCommand("getbike ORANGE");
                        } else if (args[2].equalsIgnoreCase("RED")) {
                            ((Player) sender).performCommand("getbike RED");
                        } else {
                            for (String bikeType : VehiclesAPI.plugin.getConfig().getStringList("type.bike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', bikeType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("broom")) {
                        if (args.length == 2) {
                            for (String broomType : VehiclesAPI.plugin.getConfig().getStringList("type.broom")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', broomType));
                            }
                        } else if (args[2].equalsIgnoreCase("B1")) {
                            ((Player) sender).performCommand("getbroom B1");
                        } else if (args[2].equalsIgnoreCase("B2")) {
                            ((Player) sender).performCommand("getbroom B2");
                        } else if (args[2].equalsIgnoreCase("B3")) {
                            ((Player) sender).performCommand("getbroom B3");
                        } else {
                            for (String broomType : VehiclesAPI.plugin.getConfig().getStringList("type.broom")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', broomType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("car")) {
                        if (args.length == 2) {
                            for (String carType : VehiclesAPI.plugin.getConfig().getStringList("type.car")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', carType));
                            }
                        } else if (args[2].equalsIgnoreCase("BLACK")) {
                            ((Player) sender).performCommand("getcar BLACK");
                        } else if (args[2].equalsIgnoreCase("YELLOW")) {
                            ((Player) sender).performCommand("getcar YELLOW");
                        } else if (args[2].equalsIgnoreCase("MAGENTA")) {
                            ((Player) sender).performCommand("getcar MAGENTA");
                        } else {
                            for (String carType : VehiclesAPI.plugin.getConfig().getStringList("type.car")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', carType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("drill")) {
                        if (args.length == 2) {
                            for (String drillType : VehiclesAPI.plugin.getConfig().getStringList("type.drill")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', drillType));
                            }
                        } else if (args[2].equalsIgnoreCase("D1")) {
                            ((Player) sender).performCommand("getdrill D1");
                        } else if (args[2].equalsIgnoreCase("D2")) {
                            ((Player) sender).performCommand("getdrill D2");
                        } else if (args[2].equalsIgnoreCase("D3")) {
                            ((Player) sender).performCommand("getdrill D3");
                        } else {
                            for (String drillType : VehiclesAPI.plugin.getConfig().getStringList("type.drill")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', drillType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("helicopter")) {
                        if (args.length == 2) {
                            for (String helicopterType : VehiclesAPI.plugin.getConfig().getStringList("type.helicopter")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', helicopterType));
                            }
                        } else if (args[2].equalsIgnoreCase("H1")) {
                            ((Player) sender).performCommand("gethelicopter H1");
                        } else if (args[2].equalsIgnoreCase("H2")) {
                            ((Player) sender).performCommand("gethelicopter H2");
                        } else if (args[2].equalsIgnoreCase("H3")) {
                            ((Player) sender).performCommand("gethelicopter H3");
                        } else {
                            for (String helicopterType : VehiclesAPI.plugin.getConfig().getStringList("type.helicopter")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', helicopterType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("hoverbike")) {
                        if (args.length == 2) {
                            for (String hoverbikeType : VehiclesAPI.plugin.getConfig().getStringList("type.hoverbike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', hoverbikeType));
                            }
                        } else if (args[2].equalsIgnoreCase("HB1")) {
                            ((Player) sender).performCommand("gethoverbike HB1");
                        } else if (args[2].equalsIgnoreCase("HB2")) {
                            ((Player) sender).performCommand("gethoverbike HB2");
                        } else if (args[2].equalsIgnoreCase("HB3")) {
                            ((Player) sender).performCommand("gethoverbike HB3");
                        } else {
                            for (String hoverbikeType : VehiclesAPI.plugin.getConfig().getStringList("type.hoverbike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', hoverbikeType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("parachute")) {
                        if (args.length == 2) {
                            for (String parachuteType : VehiclesAPI.plugin.getConfig().getStringList("type.parachute")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', parachuteType));
                            }
                        } else if (args[2].equalsIgnoreCase("PC1")) {
                            ((Player) sender).performCommand("getparachute PC1");
                        } else if (args[2].equalsIgnoreCase("PC2")) {
                            ((Player) sender).performCommand("getparachute PC2");
                        } else if (args[2].equalsIgnoreCase("PC3")) {
                            ((Player) sender).performCommand("getparachute PC3");
                        } else {
                            for (String parachuteType : VehiclesAPI.plugin.getConfig().getStringList("type.parachute")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', parachuteType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("plane")) {
                        if (args.length == 2) {
                            for (String planeType : VehiclesAPI.plugin.getConfig().getStringList("type.plane")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', planeType));
                            }
                        } else if (args[2].equalsIgnoreCase("P1")) {
                            ((Player) sender).performCommand("getplane P1");
                        } else if (args[2].equalsIgnoreCase("P2")) {
                            ((Player) sender).performCommand("getplane P2");
                        } else if (args[2].equalsIgnoreCase("P3")) {
                            ((Player) sender).performCommand("getplane P3");
                        } else {
                            for (String planeType : VehiclesAPI.plugin.getConfig().getStringList("type.plane")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', planeType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("racingcar")) {
                        if (args.length == 2) {
                            for (String racingcarType : VehiclesAPI.plugin.getConfig().getStringList("type.racingcar")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', racingcarType));
                            }

                        } else if (args[2].equalsIgnoreCase("YELLOW")) {
                            ((Player) sender).performCommand("getracingcar YELLOW");
                        } else if (args[2].equalsIgnoreCase("RED")) {
                            ((Player) sender).performCommand("getracingcar RED");
                        } else if (args[2].equalsIgnoreCase("PURPLE")) {
                            ((Player) sender).performCommand("getracingcar PURPLE");
                        } else {
                            for (String racingcarType : VehiclesAPI.plugin.getConfig().getStringList("type.racingcar")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', racingcarType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("raft")) {
                        if (args.length == 2) {
                            for (String raftType : VehiclesAPI.plugin.getConfig().getStringList("type.raft")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', raftType));
                            }
                        } else if (args[2].equalsIgnoreCase("OLD")) {
                            ((Player) sender).performCommand("getraft OLD");
                        } else if (args[2].equalsIgnoreCase("NETHER")) {
                            ((Player) sender).performCommand("getraft NETHER");
                        } else if (args[2].equalsIgnoreCase("PIRATE")) {
                            ((Player) sender).performCommand("getraft PIRATE");
                        } else {
                            for (String raftType : VehiclesAPI.plugin.getConfig().getStringList("type.raft")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', raftType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("sportbike")) {
                        if (args.length == 2) {
                            for (String sportbikeType : VehiclesAPI.plugin.getConfig().getStringList("type.sportbike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', sportbikeType));
                            }
                        } else if (args[2].equalsIgnoreCase("SB1")) {
                            ((Player) sender).performCommand("getsportbike SB1");
                        } else if (args[2].equalsIgnoreCase("SB2")) {
                            ((Player) sender).performCommand("getsportbike SB2");
                        } else if (args[2].equalsIgnoreCase("SB3")) {
                            ((Player) sender).performCommand("getsportbike SB3");
                        } else {
                            for (String sportbikeType : VehiclesAPI.plugin.getConfig().getStringList("type.sportbike")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', sportbikeType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("submarine")) {
                        if (args.length == 2) {
                            for (String submarineType : VehiclesAPI.plugin.getConfig().getStringList("type.submarine")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', submarineType));
                            }
                        } else if (args[2].equalsIgnoreCase("S1")) {
                            ((Player) sender).performCommand("getsubmarine S1");
                        } else if (args[2].equalsIgnoreCase("S2")) {
                            ((Player) sender).performCommand("getsubmarine S2");
                        } else if (args[2].equalsIgnoreCase("S3")) {
                            ((Player) sender).performCommand("getsubmarine S3");
                        } else {
                            for (String submarineType : VehiclesAPI.plugin.getConfig().getStringList("type.submarine")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', submarineType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("tank")) {
                        if (args.length == 2) {
                            for (String tankType : VehiclesAPI.plugin.getConfig().getStringList("type.tank")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', tankType));
                            }
                        } else if (args[2].equalsIgnoreCase("T1")) {
                            ((Player) sender).performCommand("gettank T1");
                        } else if (args[2].equalsIgnoreCase("T2")) {
                            ((Player) sender).performCommand("gettank T2");
                        } else if (args[2].equalsIgnoreCase("T3")) {
                            ((Player) sender).performCommand("gettank T3");
                        } else {
                            for (String tankType : VehiclesAPI.plugin.getConfig().getStringList("type.tank")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', tankType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("tractor")) {
                        if (args.length == 2) {
                            for (String tractorType : VehiclesAPI.plugin.getConfig().getStringList("type.tractor")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', tractorType));
                            }
                        } else if (args[2].equalsIgnoreCase("YELLOW")) {
                            ((Player) sender).performCommand("gettractor YELLOW");
                        } else if (args[2].equalsIgnoreCase("RED")) {
                            ((Player) sender).performCommand("gettractor RED");
                        } else if (args[2].equalsIgnoreCase("GREEN")) {
                            ((Player) sender).performCommand("gettractor GREEN");
                        } else {
                            for (String tractorType : VehiclesAPI.plugin.getConfig().getStringList("type.tractor")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', tractorType));
                            }
                        }
                    } else if (args[1].equalsIgnoreCase("train")) {
                        if (args.length == 2) {
                            for (String trainType : VehiclesAPI.plugin.getConfig().getStringList("type.train")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', trainType));
                            }
                        } else if (args[2].equalsIgnoreCase("T1")) {
                            ((Player) sender).performCommand("gettrain T1");
                        } else if (args[2].equalsIgnoreCase("T2")) {
                            ((Player) sender).performCommand("gettrain T2");
                        } else if (args[2].equalsIgnoreCase("T3")) {
                            ((Player) sender).performCommand("gettrain T3");
                        } else {
                            for (String trainType : VehiclesAPI.plugin.getConfig().getStringList("type.train")) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', trainType));
                            }
                        }
                    } else {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                    }
                } else if (args[0].equalsIgnoreCase("shop")) {
                    if (args.length == 1) {
                        //未来の僕へ、頑張ってGUIを作ってね！！！♥
                        Inventory shopGUI = Bukkit.createInventory(null, 18, ChatColor.translateAlternateColorCodes('&', "&3&lVehicles | 乗り物選択"));
                        //乗り物のアイコン
                        String vehiclesName[] = {ChatColor.GOLD + "バイク", ChatColor.GOLD + "ほうき", ChatColor.GOLD + "車", ChatColor.GOLD + "掘削機", ChatColor.GOLD + "ヘリコプター",
                                ChatColor.GOLD + "ホバーバイク", ChatColor.GOLD + "パラシュート", ChatColor.GOLD + "航空機", ChatColor.GOLD + "レーシングカー", ChatColor.GOLD + "いかだ",
                                ChatColor.GOLD + "スポーツバイク", ChatColor.GOLD + "潜水艦", ChatColor.GOLD + "戦車", ChatColor.GOLD + "トラクター", ChatColor.GOLD + "列車"};
                        String vehiclesLore[] = {ChatColor.GRAY + "バイクを購入する", ChatColor.GRAY + "ほうきを購入する", ChatColor.GRAY + "車を購入する", ChatColor.GRAY + "掘削機を購入する（掘削機能有、グレード別に掘削範囲変化）",
                                ChatColor.GRAY + "ヘリコプターを購入する（ファイアチャージの発射は無効）", ChatColor.GRAY + "ホバーバイクを購入する", ChatColor.GRAY + "パラシュートを購入する", ChatColor.GRAY + "航空機を購入する",
                                ChatColor.GRAY + "レーシングカーを購入する", ChatColor.GRAY + "いかだを購入する", ChatColor.GRAY + "スポーツバイクを購入する", ChatColor.GRAY + "潜水艦を購入する", ChatColor.GRAY + "戦車を購入する（ファイアチャージの発射は無効）",
                                ChatColor.GRAY + "トラクターを購入する（植替機能有）", ChatColor.GRAY + "列車を購入する"};
                        ItemStack[] item = new ItemStack[vehiclesName.length];
                        for (int i = 0; i < vehiclesName.length; i++) {
                            ItemStack temp = new ItemStack(Material.CHEST);
                            ItemMeta meta = temp.getItemMeta();
                            meta.setDisplayName(vehiclesName[i]);
                            meta.setLore(Collections.singletonList(vehiclesLore[i]));
                            temp.setItemMeta(meta);
                            item[i] = temp;
                            shopGUI.setItem(i, item[i]);
                        }
                        //閉じるアイコン
                        ItemStack close = new ItemStack(Material.BARRIER);
                        ItemMeta closeMeta = close.getItemMeta();
                        closeMeta.setDisplayName(ChatColor.RED + "閉じる");
                        close.setItemMeta(closeMeta);
                        //GUIにセットするよ
                        shopGUI.setItem(17, close);
                        //開くよ
                        ((Player) sender).openInventory(shopGUI);

                    } else if (args[1].equalsIgnoreCase("bike")) {
                        ((Player) sender).performCommand("bikeshop");
                    } else if (args[1].equalsIgnoreCase("broom")) {
                        ((Player) sender).performCommand("broomshop");
                    } else if (args[1].equalsIgnoreCase("car")) {
                        ((Player) sender).performCommand("carshop");
                    } else if (args[1].equalsIgnoreCase("drill")) {
                        ((Player) sender).performCommand("drillshop");
                    } else if (args[1].equalsIgnoreCase("helicopter")) {
                        ((Player) sender).performCommand("helicoptershop");
                    } else if (args[1].equalsIgnoreCase("hoverbike")) {
                        ((Player) sender).performCommand("hoverbikeshop");
                    } else if (args[1].equalsIgnoreCase("parachute")) {
                        ((Player) sender).performCommand("parachuteshop");
                    } else if (args[1].equalsIgnoreCase("plane")) {
                        ((Player) sender).performCommand("planeshop");
                    } else if (args[1].equalsIgnoreCase("racingcar")) {
                        ((Player) sender).performCommand("racingcarshop");
                    } else if (args[1].equalsIgnoreCase("raft")) {
                        ((Player) sender).performCommand("raftshop");
                    } else if (args[1].equalsIgnoreCase("sportbike")) {
                        ((Player) sender).performCommand("sportbikeshop");
                    } else if (args[1].equalsIgnoreCase("submarine")) {
                        ((Player) sender).performCommand("submarineshop");
                    } else if (args[1].equalsIgnoreCase("tank")) {
                        ((Player) sender).performCommand("tankshop");
                    } else if (args[1].equalsIgnoreCase("tractor")) {
                        ((Player) sender).performCommand("tractorshop");
                    } else if (args[1].equalsIgnoreCase("train")) {
                        ((Player) sender).performCommand("trainshop");
                    } else {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.vehicleTypeMessage")) + vehicleType[0] + separation + vehicleType[1] + separation + vehicleType[2] + separation + vehicleType[3] + separation + vehicleType[4] + separation + vehicleType[5] + separation + vehicleType[6] + separation + vehicleType[7] + separation + vehicleType[8] + separation + vehicleType[9] + separation + vehicleType[10] + separation + vehicleType[11] + separation + vehicleType[12] + separation + vehicleType[13] + separation + vehicleType[14]);
                    }
                } else if (args[0].equalsIgnoreCase("reload")) {
                    ((Player) sender).performCommand("vehiclesreload");
                } else if (args[0].equalsIgnoreCase("clear")) {
                    if (args.length > 1) {
                        try {
                            int clearArg = Integer.parseInt(args[1]);
                            if (clearArg < 1) {
                                sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.clear.isNotPositive")));
                                return true;
                            }
                            if (args.length >= 3) {
                                if (args[2].equalsIgnoreCase("true")) {
                                    ((Player) sender).performCommand("vehicleclear " + clearArg + " true");
                                } else {
                                    sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.clear.isNotTrue")));
                                }
                            } else {
                                ((Player) sender).performCommand("vehicleclear " + clearArg);
                            }
                        } catch (NumberFormatException nfe) {
                            sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.clear.isNotInt")));
                        }
                    } else {
                        sender.sendMessage(prefix + ChatColor.translateAlternateColorCodes('&', VehiclesAPI.plugin.getConfig().getString("message.clear.usage")));
                    }
                } else if (args[0].equalsIgnoreCase("repair")) {
                    ((Player) sender).performCommand("repairvehicle");
                }
            }
        }
        return true;
    }
}


