package io.sponges.bot.api.storage;

import java.util.HashMap;
import java.util.Map;

public class DataObject {

    private final Map<String, Object> mappings = new HashMap<>();
    private final Object lock = new Object();

    private final String key;

    /**
     * Creates a new data object without a default key
     */
    public DataObject() {
        this.key = null;
    }

    /**
     * Creates a new data object with a default key
     * @param key default key to store object under in storage
     */
    public DataObject(String key) {
        this.key = key;
    }

    /**
     * Checks if a key exists in the object
     * @param key key to check for
     * @return true if the key exists
     */
    public boolean exists(String key) {
        synchronized (lock) {
            return mappings.containsKey(key);
        }
    }

    /**
     * Gets the value of a key
     * @param key the key to get the value of
     * @return value
     */
    public Object get(String key) {
        synchronized (lock) {
            return mappings.get(key);
        }
    }

    /**
     * Sets the value of a key
     * @param key the key to set the value of
     * @param value the value to set the key to
     * @return DataObject for builder pattern
     */
    public DataObject set(String key, Object value) {
        synchronized (lock) {
            mappings.put(key, value);
            return this;
        }
    }

    /**
     * Sets the value of a key and then saves the updated DataObject
     * @param storage instance of storage
     * @param key the key to set the value of
     * @param value the value to set the key to
     * @return DataObject for builder pattern
     */
    public DataObject set(Storage storage, String key, Object value) {
        synchronized (lock) {
            mappings.put(key, value);
            storage.save(this);
            return this;
        }
    }

    /**
     * Removes a value and then saves the updated DataObject
     * @param storage instance of storage
     * @param key the key to remove the value of
     * @return DataObject for builder pattern
     */
    public DataObject remove(Storage storage, String key) {
        synchronized (lock) {
            mappings.remove(key);
            storage.save(this);
            return this;
        }
    }

    /**
     * Saves the DataObject
     * @param storage instance of storage
     * @return DataObject for builder pattern
     */
    public DataObject save(Storage storage) {
        synchronized (lock) {
            storage.save(this);
            return this;
        }
    }

    /**
     * The default key for this object
     * Null if no default key is set
     * @return key
     */
    public String getKey() {
        return key;
    }

    /**
     * The mappings for this object stored in key, value format
     * @return mappings
     */
    public Map<String, Object> getMappings() {
        return mappings;
    }
}
