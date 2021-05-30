package xyz.namekun.vehiclesapi;

import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;
import java.io.IOException;

public final class VehiclesAPI extends JavaPlugin {

    public static VehiclesAPI plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("vehicles").setExecutor(new VehiclesAPICommand());
        getCommand("vehicles").setTabCompleter(new VehiclesAPITabCompleter());
        getServer().getPluginManager().registerEvents(new VehiclesAPIListner(), this);
        plugin = this;
        createFiles();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private File configFile;
    private FileConfiguration config;

    private void createFiles() {
        configFile = new File(getDataFolder(), "config.yml");

        if (!configFile.exists()) {
            configFile.getParentFile().mkdirs();
            saveResource("config.yml", false);
        }
        config = new YamlConfiguration();

        try {
            config.load(configFile);
        } catch (IOException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
