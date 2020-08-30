package de.deanomus.minewarp.util;

import de.deanomus.minewarp.objects.MineWarp;

import java.util.ArrayList;

public class WarpServer {

    private static ArrayList<MineWarp> Warps = new ArrayList<MineWarp>();

    public void addWarp(MineWarp warp) {
        Warps.add(warp);
    }

    public void delWarp(MineWarp warp) {
        Warps.remove(warp);
    }

    public static ArrayList<MineWarp> getWarps() {
        return Warps;
    }

    public MineWarp getWarp(String name) {
        MineWarp warp = null;
        warp = getWarp(name, true);
        if (warp == null) {
            warp = getWarp(name, false);
        }
        return warp;
    }

    public MineWarp getWarp(String name, boolean caseSensitive) {
        if (caseSensitive) {
            for (MineWarp warp : Warps) {
                if (warp.getName().equals(name)) {
                    return warp;
                }
            }
        } else {
            for (MineWarp warp : Warps) {
                if (warp.getName().equalsIgnoreCase(name)) {
                    return warp;
                }
            }
        }

        return null;
    }
}
