package io.sponges.bot.api.event.events.user;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.GroupChannel;

public final class UserJoinEvent extends UserEvent {

    private final Client client;
    private final Network network;
    private final GroupChannel channel;
    private final User user;
    private final User initiator;

    public UserJoinEvent(Client client, Network network, GroupChannel channel, User user, User initiator) {
        this.client = client;
        this.network = network;
        this.channel = channel;
        this.user = user;
        this.initiator = initiator;
    }

    public Client getClient() {
        return client;
    }

    public Network getNetwork() {
        return network;
    }

    public GroupChannel getChannel() {
        return channel;
    }

    public User getUser() {
        return user;
    }

    public User getInitiator() {
        return initiator;
    }
}
