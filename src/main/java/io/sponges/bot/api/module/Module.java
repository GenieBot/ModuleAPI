package io.sponges.bot.api.module;

import io.sponges.bot.api.Logger;
import io.sponges.bot.api.cmd.CommandManager;
import io.sponges.bot.api.entities.manager.ClientManager;
import io.sponges.bot.api.event.framework.EventManager;
import io.sponges.bot.api.server.Server;
import io.sponges.bot.api.storage.Storage;
import io.sponges.bot.api.webhook.WebhookManager;
import io.sponges.proxypool.ProxyPool;

public abstract class Module {

    private ModuleLogger moduleLogger;
    private Server server;
    private EventManager eventManager;
    private CommandManager commandManager;
    private ModuleManager moduleManager;
    private Storage storage;
    private ProxyPool proxyPool;
    private ClientManager clientManager;
    private WebhookManager webhookManager;

    private final String id, version;

    /**
     * Constructor for each module.
     * @param id unique string for each module
     * @param version version of module
     */
    public Module(String id, String version) {
        this.id = id.toLowerCase();
        this.version = version;
    }

    /**
     * Invoked once module is ready to be enabled.
     */
    public abstract void onEnable();

    /**
     * Invoked once module is ready to be disabled.
     */
    public abstract void onDisable();

    /**
     * Internal method invoked by the server to instantiate variables.
     * TODO encapsulation of method
     */
    public void init(Server server, EventManager eventManager, CommandManager commandManager,
                     ModuleManager moduleManager, Storage storage, ProxyPool proxyPool, ClientManager clientManager,
                     WebhookManager webhookManager, Logger logger) {
        this.server = server;
        this.eventManager = eventManager;
        this.commandManager = commandManager;
        this.moduleManager = moduleManager;
        this.storage = storage;
        this.proxyPool = proxyPool;
        this.clientManager = clientManager;
        this.webhookManager = webhookManager;
        this.moduleLogger = new ModuleLogger(this, logger);
    }

    /**
     * The id of the module
     * @return module id
     */
    public String getId() {
        return id;
    }

    /**
     * The module version
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * The module's logger instance
     * @return logger
     */
    public ModuleLogger getLogger() {
        return moduleLogger;
    }

    /**
     * The central server instance interface
     * @return server
     */
    public Server getServer() {
        return server;
    }

    /**
     * The server event manager
     * @return event manager
     */
    public EventManager getEventManager() {
        return eventManager;
    }

    /**
     * The server command manager
     * @return command manager
     */
    public CommandManager getCommandManager() {
        return commandManager;
    }

    /**
     * The server module manager
     * @return module manager
     */
    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    /**
     * Module storage
     * @return storage
     */
    public Storage getStorage() {
        return storage;
    }

    /**
     * Server proxy pool
     * @return proxy pool
     */
    public ProxyPool getProxyPool() {
        return proxyPool;
    }

    /**
     * Manager for connected clients
     * @return client manager
     */
    public ClientManager getClientManager() {
        return clientManager;
    }

    /**
     * Server webhook manager
     * @return webhook manager
     */
    public WebhookManager getWebhookManager() {
        return webhookManager;
    }
}
