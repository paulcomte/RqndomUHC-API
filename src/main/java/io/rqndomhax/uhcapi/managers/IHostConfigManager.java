package io.rqndomhax.uhcapi.managers;

import io.rqndomhax.uhcapi.utils.HostConfig;

import java.io.File;
import java.util.List;

public interface IHostConfigManager {

    void loadConfigs(File dataFolder);

    HostConfig loadConfig(String path);

    void deleteConfig(HostConfig config);

    void saveConfig(HostConfig config, boolean save);

    List<HostConfig> getConfiguration();

    void setConfigurations(List<HostConfig> configurations);

}
