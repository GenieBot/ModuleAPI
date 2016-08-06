package io.sponges.bot.api.event.events.message;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.Channel;
import io.sponges.bot.api.entities.message.SentMessage;
import io.sponges.bot.api.event.events.message.MessageEvent;

public abstract class MessageSentEvent extends MessageEvent {

    private final SentMessage message;

    public MessageSentEvent(Client client, Network network, Channel channel, User user, SentMessage message) {
        super(client, network, channel, user);
        this.message = message;
    }

    public SentMessage getMessage() {
        return message;
    }
}
