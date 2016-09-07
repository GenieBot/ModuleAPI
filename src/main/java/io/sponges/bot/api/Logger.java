package io.sponges.bot.api;

public interface Logger {

    void log(Type type, String message);

    void log(String type, String message);

    void setDebug(boolean debug);

    enum Type {
        INFO, DEBUG, WARNING
    }

}
