package io.sponges.bot.api.entities.channel;

import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.storage.ChannelData;

public interface Channel {

    void sendMessage(String message);

    String getId();

    Network getNetwork();

    ChannelData getData();

}
