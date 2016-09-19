package io.sponges.bot.api.module;

import io.sponges.bot.api.Logger;

public final class ModuleLogger {

    // TODO impl of java Logger

    private static final String MESSAGE_FORMAT = "[%s] %s";

    private final Logger logger;
    private final String name;

    public ModuleLogger(Module module, Logger logger) {
        this.logger = logger;
        this.name = module.getName();
    }

    private String format(String message) {
        return String.format(MESSAGE_FORMAT, name, message);
    }

    public void log(Logger.Type type, String message) {
        logger.log(type, format(message));
    }

    public void log(String type, String message) {
        logger.log(type, format(message));
    }

}
