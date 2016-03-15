package io.sponges.bot.api.storage.data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Data {

    public final Map<String, String> settings = new ConcurrentHashMap<>();

    public Map<String, String> getSettings() {
        return settings;
    }

    public String get(String setting) {
        return getSettings().get(setting);
    }

    public void set(String setting, String value) {
        getSettings().put(setting, value);
    }

}
