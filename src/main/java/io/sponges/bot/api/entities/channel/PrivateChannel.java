package io.sponges.bot.api.entities.channel;

import io.sponges.bot.api.entities.User;

public interface PrivateChannel extends Channel {

    User getUser();

}
