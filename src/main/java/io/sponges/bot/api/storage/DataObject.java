package io.sponges.bot.api.storage;

import java.util.HashMap;
import java.util.Map;

public class DataObject {

    private final Map<String, Object> mappings = new HashMap<>();
    private final Object lock = new Object();

    private final String key;

    public DataObject() {
        this.key = null;
    }

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

    public DataObject set(String key, Object value) {
        synchronized (lock) {
            mappings.put(key, value);
            return this;
        }
    }

    public DataObject set(Storage storage, String key, Object value) {
        synchronized (lock) {
            mappings.put(key, value);
            storage.save(this);
            return this;
        }
    }

    public DataObject remove(Storage storage, String key) {
        synchronized (lock) {
            Object object = mappings.remove(key);
            storage.save(this);
            return this;
        }
    }

    public DataObject save(Storage storage) {
        synchronized (lock) {
            storage.save(this);
            return this;
        }
    }

    public String getKey() {
        return key;
    }

    public Map<String, Object> getMappings() {
        return mappings;
    }
}
