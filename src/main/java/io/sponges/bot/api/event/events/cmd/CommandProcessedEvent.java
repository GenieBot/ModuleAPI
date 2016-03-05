package io.sponges.bot.api.event.events.cmd;

import io.sponges.bot.api.cmd.CommandRequest;

public final class CommandProcessedEvent extends CommandEvent {

    private final CommandRequest commandRequest;
    private final String[] args;

    public CommandProcessedEvent(CommandRequest commandRequest, String[] args) {
        this.commandRequest = commandRequest;
        this.args = args;
    }

    public CommandRequest getCommandRequest() {
        return commandRequest;
    }

    public String[] getArgs() {
        return args;
    }
}
