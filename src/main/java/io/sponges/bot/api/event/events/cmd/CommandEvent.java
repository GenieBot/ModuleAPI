package io.sponges.bot.api.event.events.cmd;

import io.sponges.bot.api.cmd.CommandRequest;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.event.framework.Event;
import io.sponges.bot.api.event.framework.NetworkEvent;

public abstract class CommandEvent extends Event implements NetworkEvent {

    private final CommandRequest commandRequest;

    public CommandEvent(CommandRequest commandRequest) {
        this.commandRequest = commandRequest;
    }

    public CommandEvent(boolean cancellable, CommandRequest commandRequest) {
        super(cancellable);
        this.commandRequest = commandRequest;
    }

    @Override
    public Network getNetwork() {
        return commandRequest.getNetwork();
    }
}
