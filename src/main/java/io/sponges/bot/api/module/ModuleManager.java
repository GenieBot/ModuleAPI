package io.sponges.bot.api.module;

import java.util.Collection;

public interface ModuleManager {

    Collection<Module> getModules();

    boolean isModule(int id);

    boolean isModule(String name);

    Module getModule(int id);

    int getModuleId(String name);

    void reload();

}
