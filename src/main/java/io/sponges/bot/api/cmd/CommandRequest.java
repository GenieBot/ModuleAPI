package io.sponges.bot.api.cmd;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Message;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.Channel;

public interface CommandRequest {

    void reply(String reply);

    Client getClient();

    Network getNetwork();

    Channel getChannel();

    User getUser();

    Message getMessage();

}
