package io.sponges.bot.api.module;

import java.util.Collection;

public interface ModuleManager {

    Collection<Module> getModules();

    Module getModule(String id);

    void reload();

}
