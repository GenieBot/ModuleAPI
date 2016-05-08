package io.sponges.bot.api.cmd;

import io.sponges.bot.api.module.Module;

import java.util.Collection;

public interface CommandManager {

    void registerCommand(Module module, Command command);

    void unregisterCommand(Command command);

    void unregisterCommands(Module module);

    Collection<Command> getCommands();

    boolean hasCommands(Module module);

    Collection<Command> getCommands(Module module);

    Collection<String> getNames();

    Command getCommand(String name);

}
