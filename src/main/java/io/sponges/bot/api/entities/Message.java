package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.channel.Channel;

import java.util.Date;

public interface Message {

    Client getClient();

    Network getNetwork();

    Channel getChannel();

    User getUser();

    Date getDate();

    String getContent();

}
