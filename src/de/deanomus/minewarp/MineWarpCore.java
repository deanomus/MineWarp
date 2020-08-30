package de.deanomus.minewarp;

import de.deanomus.minewarp.util.cfg.Data;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.LogPrefix;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

import java.util.logging.Level;
import java.util.logging.LogRecord;

@Plugin(name = "MineWarp", version = "1.0.0")
@Description(value = "MineWarp is a simple warpsystem for minecraft servers")
@Author(value = "deanomus")
@Website(value = "reinhardt.work")
@LogPrefix(value = "MineWarp")
public class MineWarpCore extends JavaPlugin {


    public void onEnable() {
        ConsoleCommandSender cs = Bukkit.getConsoleSender();

        getLogger().log(Level.INFO, "Starting...");
    }

    public void onDisable() {

    }

}
