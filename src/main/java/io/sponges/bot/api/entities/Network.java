package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.manager.ChannelManager;
import io.sponges.bot.api.entities.manager.RoleManager;
import io.sponges.bot.api.storage.data.NetworkData;

import java.util.Map;

public interface Network {

    Map<String, User> getUsers();

    String getId();

    Client getClient();

    NetworkData getData();

    ChannelManager getChannelManager();

    RoleManager getRoleManager();

    boolean isUser(String id);

    User getUser(String id);

}
