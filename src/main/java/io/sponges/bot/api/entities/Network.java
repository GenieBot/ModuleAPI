package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.manager.ChannelManager;
import io.sponges.bot.api.storage.data.NetworkData;

public interface Network {

    String getId();

    Client getClient();

    NetworkData getData();

    ChannelManager getChannelManager();

}
