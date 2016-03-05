package io.sponges.bot.api.entities.channel;

import io.sponges.bot.api.entities.Network;

public interface Channel {

    void sendMessage(String message);

    String getId();

    Network getNetwork();

}
