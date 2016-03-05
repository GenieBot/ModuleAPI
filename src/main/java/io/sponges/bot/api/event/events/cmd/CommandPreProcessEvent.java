package io.sponges.bot.api.event.events.cmd;

import io.sponges.bot.api.cmd.CommandRequest;

public final class CommandPreProcessEvent extends CommandEvent {

    private final CommandRequest commandRequest;
    private final String[] args;

    public CommandPreProcessEvent(CommandRequest commandRequest, String[] args) {
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
