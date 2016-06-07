package io.sponges.bot.api.entities.channel;

import io.sponges.bot.api.entities.Entity;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.data.ChannelData;
import io.sponges.bot.api.storage.DataObject;

public interface Channel extends Entity {

    String getId();

    Network getNetwork();

    ChannelData getChannelData();

    DataObject getData();

    void sendMessage(String message);

    void sendChatMessage(String message);

}
