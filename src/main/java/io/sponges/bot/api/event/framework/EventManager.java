package io.sponges.bot.api.event.framework;

import io.sponges.bot.api.module.Module;

import java.util.function.Consumer;

public interface EventManager {

    /**
     * Registers a new event listener
     * @param event the event to listen to
     * @param consumer the listener
     * @param <T> class extending Event
     * @return if registration was successful
     */
    <T extends Event> boolean register(Module module, Class<T> event, Consumer<T> consumer);

    /**
     * Un-registers an event listener
     * @param consumer event listener
     * @param <T> class extending Event
     * @return if unregistration was successful
     */
    <T extends Event> boolean unregister(Consumer<T> consumer);

    void unregister(Module module);

    /**
     * Sends a new event
     * @param event the event to send
     * @param <T> class extending Event
     * @return the event
     */
    <T extends Event> T post(T event);

}
