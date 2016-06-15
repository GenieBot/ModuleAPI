package io.sponges.bot.api.module;

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

    public Module(String id, String version) {
        this.id = id.toLowerCase();
        this.version = version;
        this.moduleLogger = new ModuleLogger(this);
    }

    public abstract void onEnable();

    public abstract void onDisable();

    private void init(Server server, EventManager eventManager, CommandManager commandManager,
                     ModuleManager moduleManager, Storage storage, ProxyPool proxyPool, ClientManager clientManager,
                     WebhookManager webhookManager) {
        this.server = server;
        this.eventManager = eventManager;
        this.commandManager = commandManager;
        this.moduleManager = moduleManager;
        this.storage = storage;
        this.proxyPool = proxyPool;
        this.clientManager = clientManager;
        this.webhookManager = webhookManager;
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

    public Storage getStorage() {
        return storage;
    }

    public ProxyPool getProxyPool() {
        return proxyPool;
    }

    public ClientManager getClientManager() {
        return clientManager;
    }

    public WebhookManager getWebhookManager() {
        return webhookManager;
    }
}
