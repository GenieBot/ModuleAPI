package io.sponges.bot.api.event.events.user;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.GroupChannel;

public final class UserLeaveEvent extends UserRemoveEvent {

    private final Client client;
    private final GroupChannel channel;
    private final User user;

    public UserLeaveEvent(Client client, Network network, GroupChannel channel, User user) {
        super(network);
        this.client = client;
        this.channel = channel;
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public GroupChannel getChannel() {
        return channel;
    }

    public User getUser() {
        return user;
    }
}
