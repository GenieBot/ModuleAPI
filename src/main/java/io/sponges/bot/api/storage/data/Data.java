package io.sponges.bot.api.storage.data;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Data {

    public final Map<String, String> settings = new ConcurrentHashMap<>();

    public Map<String, String> getSettings() {
        return Collections.unmodifiableMap(settings);
    }

    public boolean isPresent(String setting) {
        return settings.containsKey(setting);
    }

    public String get(String setting) {
        return settings.get(setting);
    }

    public void set(String setting, String value) {
        settings.put(setting, value);
    }

}
