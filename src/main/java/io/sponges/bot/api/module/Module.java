package io.sponges.bot.api.module;

import io.sponges.bot.api.cmd.CommandManager;
import io.sponges.bot.api.event.framework.EventManager;
import io.sponges.bot.api.server.Server;
import io.sponges.bot.api.storage.Storage;

public abstract class Module {

    private ModuleLogger moduleLogger;
    private Server server;
    private EventManager eventManager;
    private CommandManager commandManager;
    private ModuleManager moduleManager;
    private Storage storage;

    private final String id, version;

    /**
     * Instantiates the module
     * @param id the identifier of the module
     * @param version the current module version
     */
    public Module(String id, String version) {
        this.id = id;
        this.version = version;
        this.moduleLogger = new ModuleLogger(this);
    }

    /**
     * Abstract method invoked when the module is loaded & ready to enable
     */
    public abstract void onEnable();

    /**
     * Abstract method invoked when the module is ready to disable
     */
    public abstract void onDisable();

    /**
     * Internal method to instantiate module dependencies
     * @param eventManager server event manager
     * @param commandManager server command manager
     */
    public void init(Server server, EventManager eventManager, CommandManager commandManager,
                     ModuleManager moduleManager, Storage storage) {
        this.server = server;
        this.eventManager = eventManager;
        this.commandManager = commandManager;
        this.moduleManager = moduleManager;
        this.storage = storage;
    }

    /**
     * Gets the module identifier
     * @return module id
     */
    public String getId() {
        return id;
    }

    /**
     * Gets the module version
     * @return module version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Gets the module's logger instance
     * @return Modulelogger instance
     * TODO swap for java.logging.Logger
     */
    public ModuleLogger getLogger() {
        return moduleLogger;
    }

    /**
     * Gets the server instance
     * @return Server instance
     */
    public Server getServer() {
        return server;
    }

    /**
     * Gets the server's event manager instance
     * @return EventManager instance
     */
    public EventManager getEventManager() {
        return eventManager;
    }

    /**
     * Gets the server's command manager instance
     * @return CommandManager instance
     */
    public CommandManager getCommandManager() {
        return commandManager;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    public Storage getStorage() {
        return storage;
    }
}
