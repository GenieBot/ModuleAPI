package io.sponges.bot.api.cmd;

public interface CommandManager {

    void registerCommand(Command command);

    void unregisterCommand(Command command);

}
