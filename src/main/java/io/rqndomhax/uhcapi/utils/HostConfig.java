package io.rqndomhax.uhcapi.utils;

import java.util.HashMap;
import java.util.UUID;

public final class HostConfig {

    private RValue gameInfos;
    private String name;
    private final String filePath;

    public HostConfig(RValue gameInfos, String name, String filePath) {
        this.gameInfos = gameInfos;
        this.name = name;
        this.filePath = filePath;
    }

    public RValue getGameInfos() {
        return gameInfos;
    }

    public void setGameInfos(RValue gameInfos) {
        this.gameInfos = gameInfos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFilePath() {
        return filePath;
    }

    public HostConfig copy() {
        RValue gameInfos = new RValue();
        gameInfos.setObjects(new HashMap<>(this.gameInfos.getObjects()));
        return new HostConfig(gameInfos, name, filePath);
    }

    public HostConfig duplicate() {
        RValue gameInfos = new RValue();
        gameInfos.setObjects(new HashMap<>(this.gameInfos.getObjects()));
        return new HostConfig(gameInfos, name + " copy", "configs/" + UUID.randomUUID().toString().substring(0, 8) + ".cfg");
    }

}
