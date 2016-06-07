package io.sponges.bot.api.storage;

import java.util.HashMap;
import java.util.Map;

public class DataObject {

    private final Map<String, Object> mappings = new HashMap<>();
    private final Object lock = new Object();

    private final String key;

    public DataObject(String key) {
        this.key = key;
    }

    public boolean exists(String key) {
        synchronized (lock) {
            return mappings.containsKey(key);
        }
    }

    public Object get(String key) {
        synchronized (lock) {
            return mappings.get(key);
        }
    }

    public Object set(Storage storage, String key, Object value) {
        synchronized (lock) {
            Object object = mappings.put(key, value);
            storage.save(this);
            return object;
        }
    }

    public String getKey() {
        return key;
    }

    public Map<String, Object> getMappings() {
        return mappings;
    }
}
