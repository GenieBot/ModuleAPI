package io.sponges.bot.api.event.framework;

import java.util.function.Consumer;

public interface EventManager {

    /**
     * Registers a new event listener
     * @param event the event to listen to
     * @param consumer the listener
     * @param <T> class extending Event
     * @return if registration was successful
     */
    <T extends Event> boolean register(Class<T> event, Consumer<T> consumer);

    /**
     * Un-registers an event listener
     * @param consumer event listener
     * @param <T> class extending Event
     * @return if un-registration was successful
     */
    <T extends Event> boolean unregister(Consumer<T> consumer);

    /**
     * Sends a new event
     * @param event the event to send
     * @param <T> class extending Event
     * @return TODO explain what #post returns
     */
    <T extends Event> T post(T event);

}
