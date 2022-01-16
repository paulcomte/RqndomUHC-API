package io.rqndomhax.uhcapi.utils;

import org.bukkit.Material;

public enum Colors {

    WHITE(0, Material.WHITE_STAINED_GLASS, Material.WHITE_STAINED_GLASS_PANE),
    ORANGE(1, Material.ORANGE_STAINED_GLASS, Material.ORANGE_STAINED_GLASS_PANE),
    MAGENTA(2, Material.MAGENTA_STAINED_GLASS, Material.MAGENTA_STAINED_GLASS_PANE),
    LIGHT_BLUE(3, Material.LIGHT_BLUE_STAINED_GLASS, Material.LIGHT_BLUE_STAINED_GLASS_PANE),
    YELLOW(4, Material.YELLOW_STAINED_GLASS, Material.YELLOW_STAINED_GLASS_PANE),
    LIME(5, Material.LIME_STAINED_GLASS, Material.LIME_STAINED_GLASS_PANE),
    PINK(6, Material.PINK_STAINED_GLASS, Material.PINK_STAINED_GLASS_PANE),
    GRAY(7, Material.GRAY_STAINED_GLASS, Material.GRAY_STAINED_GLASS_PANE),
    LIGHT_GRAY(8, Material.LIGHT_GRAY_STAINED_GLASS, Material.LIGHT_GRAY_STAINED_GLASS_PANE),
    CYAN(9, Material.CYAN_STAINED_GLASS, Material.CYAN_STAINED_GLASS_PANE),
    PURPLE(10, Material.PURPLE_STAINED_GLASS, Material.PURPLE_STAINED_GLASS_PANE),
    BLUE(11, Material.BLUE_STAINED_GLASS, Material.BLUE_STAINED_GLASS_PANE),
    BROWN(12, Material.BROWN_STAINED_GLASS, Material.BROWN_STAINED_GLASS_PANE),
    GREEN(13, Material.GREEN_STAINED_GLASS, Material.GREEN_STAINED_GLASS_PANE),
    RED(14, Material.RED_STAINED_GLASS, Material.RED_STAINED_GLASS_PANE),
    BLACK(15, Material.BLACK_STAINED_GLASS, Material.BLACK_STAINED_GLASS_PANE);

    private final int id;
    private final Material glass;
    private final Material glassPane;

    Colors(int id, Material glass, Material glassPane) {
        this.id = id;
        this.glass = glass;
        this.glassPane = glassPane;
    }

    public static Material getGlassById(int id) {
        for (Colors colors : values()) {
            if (colors.getId() == id) {
                return colors.getGlass();
            }
        }
        return Material.WHITE_STAINED_GLASS;
    }

    public static Material getGlassPaneById(int id) {
        for (Colors colors : values()) {
            if (colors.getId() == id) {
                return colors.getGlassPane();
            }
        }
        return Material.WHITE_STAINED_GLASS_PANE;
    }

    public int getId() {
        return id;
    }

    public Material getGlass() {
        return glass;
    }

    public Material getGlassPane() {
        return glassPane;
    }
}
