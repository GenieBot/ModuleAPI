package io.sponges.bot.api.server;

public interface Server {

    void stop();

    void stop(Runnable callback);

}
