package io.sponges.bot.api.storage;

public interface Storage {

    boolean exists(String key);

    Object get(String key);

    void set(String key, Object value);

    String serialize(DataObject object);

    void load(DataObject object);

}
