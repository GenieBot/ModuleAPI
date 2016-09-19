package io.sponges.bot.api.event.framework;

import java.util.function.Consumer;

public interface EventManager {

    // consumer instance returned is not the same as supplied but needed to unregister
    <T extends Event> Consumer<T> register(Class<T> event, Consumer<T> consumer);

    <T extends Event> boolean unregister(Consumer<T> consumer);

    void unregisterAll();

    <T extends Event> T post(T event);

    <T extends Event> void postAsync(T event);

    <T extends Event> void postAsync(T event, Consumer<Boolean> callback);

}
