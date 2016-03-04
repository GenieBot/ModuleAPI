package io.sponges.bot.api.module;

import io.sponges.bot.api.cmd.CommandManager;
import io.sponges.bot.api.event.framework.EventManager;

public abstract class Module {

    private ModuleLogger moduleLogger;
    private EventManager eventManager;
    private CommandManager commandManager;

    private final String id, version;

    public Module(String id, String version) {
        this.id = id;
        this.version = version;
    }

    public abstract void onEnable();

    public abstract void onDisable();

    public void init(ModuleLogger moduleLogger, EventManager eventManager, CommandManager commandManager) {
        this.moduleLogger = moduleLogger;
        this.eventManager = eventManager;
        this.commandManager = commandManager;
    }

    public String getId() {
        return id;
    }

    public String getVersion() {
        return version;
    }

    public ModuleLogger getLogger() {
        return moduleLogger;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }
}
