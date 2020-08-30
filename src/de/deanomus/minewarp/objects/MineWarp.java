package de.deanomus.minewarp.objects;

import org.bukkit.Location;

public class MineWarp {

    private static String
            name;

    private static Location
            loc;

    public MineWarp(String name, Location loc) {
        this.name = name;
        this.loc = loc;
    }


    // Getter and Setter

    // Getter

    public static String getName() {
        return name;
    }

    public static Location getLoc() {
        return loc;
    }

    // Setter

    public static void setName(String name) {
        MineWarp.name = name;
    }

    public static void setLoc(Location loc) {
        MineWarp.loc = loc;
    }
}
