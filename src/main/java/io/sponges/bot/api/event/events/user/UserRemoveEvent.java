package io.sponges.bot.api.event.events.user;

import io.sponges.bot.api.entities.Network;

public abstract class UserRemoveEvent extends UserEvent {

    public UserRemoveEvent(Network network) {
        super(network);
    }
}
