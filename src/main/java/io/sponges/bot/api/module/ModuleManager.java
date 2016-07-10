package io.sponges.bot.api.module;

import java.util.Collection;

public interface ModuleManager {

    /**
     * A collection of loaded modules
     * @return collection of modules
     */
    Collection<Module> getModules();

    /**
     * Checks if a module exists
     * @param id unique module identifier
     * @return true if the module exists
     */
    boolean isModule(String id);

    /**
     * Gets a loaded module instance
     * @param id unique module identifier
     * @return module instance
     */
    Module getModule(String id);

    /**
     * Reloads all modules
     */
    void reload();

}
