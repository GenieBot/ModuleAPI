package io.sponges.bot.api.module;

public final class ModuleLogger {

    // TODO impl of java Logger

    private final String name;

    public ModuleLogger(Module module) {
        this.name = module.getId();
    }

    public void log(String message) {
        System.out.printf("[%s] %s\r\n", name, message);
    }

}
