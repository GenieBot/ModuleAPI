package io.sponges.bot.api.event.events.channel;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.Channel;

public final class ChannelDataUpdateEvent extends ChannelEvent {

    private final Client client;
    private final Network network;
    private final Channel channel;
    private final User user;
    private final Detail detail;
    private final String oldValue;
    private final String value;

    public ChannelDataUpdateEvent(Client client, Network network, Channel channel, User user, Detail detail,
                                  String oldValue, String value) {
        super(true);
        this.client = client;
        this.network = network;
        this.channel = channel;
        this.user = user;
        this.detail = detail;
        this.oldValue = oldValue;
        this.value = value;
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

    public Detail getDetail() {
        return detail;
    }

    public String getOldValue() {
        return oldValue;
    }

    public String getValue() {
        return value;
    }

    public enum Detail {
        NAME, TOPIC
    }

}
