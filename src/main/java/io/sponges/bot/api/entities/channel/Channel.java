package io.sponges.bot.api.entities.channel;

import io.sponges.bot.api.entities.Entity;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.data.ChannelData;
import io.sponges.bot.api.entities.message.SentMessage;
import io.sponges.bot.api.entities.message.format.FormattedMessage;

import java.util.UUID;

public interface Channel extends Entity {

    UUID getId();

    String getSourceId();

    Network getNetwork();

    ChannelData getChannelData();

    void sendMessage(String message);

    SentMessage sendChatMessage(String message);

    SentMessage sendChatMessage(FormattedMessage message);

}
