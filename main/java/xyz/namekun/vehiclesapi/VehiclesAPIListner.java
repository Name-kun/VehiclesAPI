package xyz.namekun.vehiclesapi;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class VehiclesAPIListner implements Listener {

    @EventHandler
    public static void onInventoryClick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();

        if (e.getView().getTitle().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&3&lVehicles | 乗り物選択"))) {
            e.setCancelled(true);

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "バイク")) {
                p.performCommand("bikeshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "ほうき")) {
                p.performCommand("broomshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "車")) {
                p.performCommand("carshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "掘削機")) {
                p.performCommand("drillshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "ヘリコプター")) {
                p.performCommand("helicoptershop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "ホバーバイク")) {
                p.performCommand("hoverbikeshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "パラシュート")) {
                p.performCommand("parachuteshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "航空機")) {
                p.performCommand("planeshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "レーシングカー")) {
                p.performCommand("racingcarshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "いかだ")) {
                p.performCommand("raftshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "スポーツバイク")) {
                p.performCommand("sportbikeshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "潜水艦")) {
                p.performCommand("submarineshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "戦車")) {
                p.performCommand("tankshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "トラクター")) {
                p.performCommand("tractorshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.GOLD + "列車")) {
                p.performCommand("trainshop");
            } if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.RED + "閉じる")) {
                p.closeInventory();
            }
        }
    }
}
