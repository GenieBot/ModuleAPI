package io.sponges.bot.api.module;

import io.sponges.bot.api.Logger;
import io.sponges.bot.api.cmd.CommandManager;
import io.sponges.bot.api.entities.manager.ClientManager;
import io.sponges.bot.api.event.framework.EventManager;
import io.sponges.bot.api.server.Server;
import io.sponges.bot.api.webhook.WebhookManager;

public abstract class Module {

    // TODO system to track features added by a module and enable/disable/configure them

    private int id = -1;
    private ModuleLogger moduleLogger;
    private Server server;
    private EventManager eventManager;
    private CommandManager commandManager;
    private ModuleManager moduleManager;
    private ClientManager clientManager;
    private WebhookManager webhookManager;
    private ModuleData data;

    private final String name, version;
    private final boolean required;

    public Module(String name, String version) {
        this.name = name.toLowerCase();
        this.version = version;
        this.required = false;
    }

    public Module(String name, String version, boolean required) {
        this.name = name.toLowerCase();
        this.version = version;
        this.required = required;
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
    public void init(int id, Server server, EventManager eventManager, CommandManager commandManager,
                     ModuleManager moduleManager, ClientManager clientManager,
                     WebhookManager webhookManager, Logger logger, ModuleData data) {
        this.id = id;
        this.server = server;
        this.eventManager = eventManager;
        this.commandManager = commandManager;
        this.moduleManager = moduleManager;
        this.clientManager = clientManager;
        this.webhookManager = webhookManager;
        this.moduleLogger = new ModuleLogger(this, logger);
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public boolean isRequired() {
        return required;
    }

    public ModuleLogger getLogger() {
        return moduleLogger;
    }

    public Server getServer() {
        return server;
    }

    public EventManager getEventManager() {
        return eventManager;
    }

    public CommandManager getCommandManager() {
        return commandManager;
    }

    public ModuleManager getModuleManager() {
        return moduleManager;
    }

    public ClientManager getClientManager() {
        return clientManager;
    }

    public WebhookManager getWebhookManager() {
        return webhookManager;
    }

    public ModuleData getData() {
        return data;
    }
}
