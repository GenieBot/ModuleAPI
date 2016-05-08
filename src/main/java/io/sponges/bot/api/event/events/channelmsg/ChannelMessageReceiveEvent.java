package io.sponges.bot.api.event.events.channelmsg;

import io.sponges.bot.api.entities.Client;

public abstract class ChannelMessageReceiveEvent extends ChannelMessageEvent {

    private final Client client;
    private final String message;
    private final String messageId;

    public ChannelMessageReceiveEvent(Client client, String message, String messageId) {
        this.client = client;
        this.message = message;
        this.messageId = messageId;
    }

    public abstract void reply(String message);

    public Client getClient() {
        return client;
    }

    public String getMessage() {
        return message;
    }

    public String getMessageId() {
        return messageId;
    }
}
