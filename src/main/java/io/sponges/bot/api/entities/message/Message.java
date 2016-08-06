package io.sponges.bot.api.entities.message;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.Channel;

import java.util.Date;
import java.util.List;

public interface Message {

    Client getClient();

    Network getNetwork();

    Channel getChannel();

    User getUser();

    Date getDate();

    String getContent();

    default boolean hasContent() {
        return getContent() != null && getContent().length() > 0;
    }

    List<Attachment> getAttachments();

    default boolean hasAttachments() {
        return getAttachments() != null && getAttachments().size() > 0;
    }

}
