package io.sponges.bot.api.event.events.user;

import io.sponges.bot.api.entities.*;

public final class UserChatEvent extends UserEvent {

    private final Client client;
    private final Network network;
    private final Channel channel;
    private final User user;
    private final Message message;

    public UserChatEvent(Client client, Network network, Channel channel, User user, Message message) {
        this.client = client;
        this.network = network;
        this.channel = channel;
        this.user = user;
        this.message = message;
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

    public Message getMessage() {
        return message;
    }
}
