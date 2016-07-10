package io.sponges.bot.api.server;

public interface Server {

    /**
     * Stops the server
     */
    void stop();

    /**
     * Stops the server and invokes a callback once completed
     * @param callback the callback to invoke
     */
    void stop(Runnable callback);

}
