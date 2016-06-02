package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.manager.ChannelManager;
import io.sponges.bot.api.entities.manager.RoleManager;
import io.sponges.bot.api.entities.manager.UserManager;
import io.sponges.bot.api.storage.data.NetworkData;

public interface Network {

    String getId();

    Client getClient();

    NetworkData getData();

    ChannelManager getChannelManager();

    UserManager getUserManager();

    RoleManager getRoleManager();

}
