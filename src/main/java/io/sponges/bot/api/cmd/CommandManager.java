package io.sponges.bot.api.cmd;

import io.sponges.bot.api.module.Module;

import java.util.Collection;

public interface CommandManager {

    void registerCommand(Module module, Command command);

    void unregisterCommand(Command command);

    void unregisterCommands(Module module);

    Collection<Command> getCommands();

}
