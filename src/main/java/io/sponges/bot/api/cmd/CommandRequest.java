package io.sponges.bot.api.cmd;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.message.Message;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.Channel;
import io.sponges.bot.api.entities.message.format.FormattedMessage;
import io.sponges.bot.api.event.events.message.MessageReceivedEvent;

public interface CommandRequest {

    void reply(String message);

    void reply(FormattedMessage message);

    MessageReceivedEvent getEvent();

    Client getClient();

    Network getNetwork();

    Channel getChannel();

    User getUser();

    Message getMessage();

}
