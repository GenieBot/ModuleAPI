package io.sponges.bot.api.event.framework;

import java.util.function.Consumer;

public interface EventManager {

    <T extends Event> boolean register(Class<T> event, Consumer<T> consumer);

    <T extends Event> boolean unregister(Consumer<T> consumer);

    <T extends Event> T post(T event);

}
