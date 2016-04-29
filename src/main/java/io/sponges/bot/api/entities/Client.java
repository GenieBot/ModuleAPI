package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.manager.NetworkManager;

import java.util.function.Consumer;

public interface Client {

    /**
     * The unique identifier of the client.
     * @return java.lang.String client id
     */
    String getId();

    /**
     * The default command prefix for the client.
     * @return java.lang.String default prefix
     */
    String getDefaultPrefix();

    /**
     * NetworkManager with all the networks for this client.
     * @return io.sponges.bot.api.entities.manager.NetworkManager
     */
    NetworkManager getNetworkManager();

    /**
     * Sends a message to the client allowing for easy implementation of per client features.
     * @param message the java.lang.String message to send to the client
     * @param callback a java.util.function.Consumer callback fired once the message receives a response
     *                 may be null & no guarantee that a response will be received
     */
    void sendMessage(String message, Consumer<String> callback);

}
