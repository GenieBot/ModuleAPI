package io.sponges.bot.api.event.events.message;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.Channel;
import io.sponges.bot.api.event.framework.Event;

public abstract class MessageEvent extends Event {

    private final Client client;
    private final Network network;
    private final Channel channel;
    private final User user;

    public MessageEvent(Client client, Network network, Channel channel, User user) {
        this.client = client;
        this.network = network;
        this.channel = channel;
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public Network getNetwork() {
        return network;
    }

    public Channel getChannel() {
        return channel;
    }

    public User getUser() {
        return user;
    }
}
