package io.sponges.bot.api.cmd;

import java.util.Collection;

public interface CommandManager {

    void registerCommand(Command command);

    void unregisterCommand(Command command);

    void unregisterAllCommands();

    Collection<Command> getCommands();

    Collection<Command> getAllCommands();

    Command getCommand(String name);

}
