package io.sponges.bot.api.event.events.user;

import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.event.framework.Event;
import io.sponges.bot.api.event.framework.NetworkEvent;

public abstract class UserEvent extends Event implements NetworkEvent {

    private final Network network;

    protected UserEvent(Network network) {
        this.network = network;
    }

    @Override
    public Network getNetwork() {
        return network;
    }
}
