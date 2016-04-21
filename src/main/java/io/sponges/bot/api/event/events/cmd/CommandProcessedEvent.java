package io.sponges.bot.api.event.events.cmd;

import io.sponges.bot.api.cmd.Command;
import io.sponges.bot.api.cmd.CommandRequest;

public final class CommandProcessedEvent extends CommandEvent {

    private final Command command;
    private final CommandRequest commandRequest;
    private final String[] args;

    public CommandProcessedEvent(Command command, CommandRequest commandRequest, String[] args) {
        this.command = command;
        this.commandRequest = commandRequest;
        this.args = args;
    }

    public Command getCommand() {
        return command;
    }

    public CommandRequest getCommandRequest() {
        return commandRequest;
    }

    public String[] getArgs() {
        return args;
    }
}
