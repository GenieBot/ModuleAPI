package io.sponges.bot.api.entities.channel;

import io.sponges.bot.api.entities.User;

import java.util.Map;

public interface GroupChannel extends Channel {

    Map<String, User> getUsers();

    boolean isUser(String id);

    User getUser(String id);

    void setTopic(String topic);

}
