package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.data.NetworkData;
import io.sponges.bot.api.entities.manager.ChannelManager;
import io.sponges.bot.api.entities.manager.UserManager;

import java.util.UUID;

public interface Network extends Entity {

    UUID getId();

    String getSourceId();

    Client getClient();

    ChannelManager getChannelManager();

    UserManager getUserManager();

    NetworkData getNetworkData();
}
