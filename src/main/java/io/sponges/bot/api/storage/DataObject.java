package io.sponges.bot.api.storage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class DataObject {

    private final Map<String, Object> mappings = new ConcurrentHashMap<>();

    private final String key;

    public DataObject(String key) {
        this.key = key;
    }

    public boolean exists(String key) {
        return mappings.containsKey(key);
    }

    public Object get(String key) {
        return mappings.get(key);
    }

    public Object set(String key, Object value) {
        return mappings.put(key, value);
    }

    public String getKey() {
        return key;
    }

    public Map<String, Object> getMappings() {
        return mappings;
    }
}
