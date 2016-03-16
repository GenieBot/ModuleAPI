package io.sponges.bot.api.entities.channel;

import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.storage.data.ChannelData;

public interface Channel {

    void sendMessage(String message);

    void sendChatMessage(String message);

    String getId();

    Network getNetwork();

    ChannelData getData();

}
