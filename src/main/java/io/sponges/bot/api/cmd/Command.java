package io.sponges.bot.api.cmd;

import io.sponges.bot.api.module.Module;

public abstract class Command {

    private final String description;
    private final String[] names;

    private Module module = null;

    public Command(String description, String... names) {
        this.description = description;
        this.names = names;
    }

    public abstract void onCommand(CommandRequest request, String[] args);

    public String getDescription() {
        return description;
    }

    public String[] getNames() {
        return names;
    }

    // used internally for module toggling
    public Module getModule() {
        return module;
    }

    // used internally for module toggling
    public void setModule(Module module) {
        this.module = module;
    }
}
