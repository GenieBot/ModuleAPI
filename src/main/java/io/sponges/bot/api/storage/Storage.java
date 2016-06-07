package io.sponges.bot.api.storage;

public interface Storage {

    boolean exists(String key);

    String get(String key);

    void set(String key, Object value);

    String serialize(DataObject object);

    void load(DataObject object);

    void save(DataObject object);

}
