package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.module.Module;

import java.util.Collection;

public interface NetworkModuleManager {

    Collection<Module> getEnabledModules();

    boolean isEnabled(Module module);

    void setEnabled(Module module, boolean enabled);

    void reset();

}
