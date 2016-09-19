package io.sponges.bot.api.event.events.cmd;

import io.sponges.bot.api.cmd.Command;
import io.sponges.bot.api.cmd.CommandRequest;

public final class CommandPreProcessEvent extends CommandEvent {

    private final CommandRequest commandRequest;
    private final String[] args;
    private final Command command;

    public CommandPreProcessEvent(CommandRequest commandRequest, String[] args, Command command) {
        super(true, commandRequest);
        this.commandRequest = commandRequest;
        this.args = args;
        this.command = command;
    }

    public CommandRequest getCommandRequest() {
        return commandRequest;
    }

    public String[] getArgs() {
        return args;
    }

    public Command getCommand() {
        return command;
    }
}
