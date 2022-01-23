package io.rqndomhax.uhcapi.managers;

import io.rqndomhax.uhcapi.utils.HostConfig;

import java.io.File;

public interface IHostConfigManager {

    void loadConfigs(File dataFolder);

    HostConfig loadConfig(String path);

    void deleteConfig(HostConfig config);

    void saveConfig(HostConfig config, boolean save);

}
