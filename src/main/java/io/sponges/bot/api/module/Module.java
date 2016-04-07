package io.sponges.bot.api.module;

import io.sponges.bot.api.cmd.CommandManager;
import io.sponges.bot.api.entities.manager.ClientManager;
import io.sponges.bot.api.event.framework.EventManager;
import io.sponges.bot.api.server.Server;
import io.sponges.bot.api.storage.Storage;
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

    private final String id, version;

    public Module(String id, String version) {
        this.id = id;
        this.version = version;
        this.moduleLogger = new ModuleLogger(this);
    }

    public abstract void onEnable();

    public abstract void onDisable();

    public void init(Server server, EventManager eventManager, CommandManager commandManager,
                     ModuleManager moduleManager, Storage storage, ProxyPool proxyPool, ClientManager clientManager) {
        this.server = server;
        this.eventManager = eventManager;
        this.commandManager = commandManager;
        this.moduleManager = moduleManager;
        this.storage = storage;
        this.proxyPool = proxyPool;
        this.clientManager = clientManager;
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
}
