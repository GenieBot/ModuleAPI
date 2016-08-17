package io.sponges.bot.api.event.events.message;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.Channel;
import io.sponges.bot.api.entities.message.ReceivedMessage;

public final class MessageReceivedEvent extends MessageEvent {

    private final ReceivedMessage message;

    public MessageReceivedEvent(Client client, Network network, Channel channel, User user, ReceivedMessage message) {
        super(client, network, channel, user);
        this.message = message;
    }

    public ReceivedMessage getMessage() {
        return message;
    }
}
