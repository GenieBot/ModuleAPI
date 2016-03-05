package io.sponges.bot.api.entities;

import java.util.Date;

public interface Message {

    Client getClient();

    Network getNetwork();

    Channel getChannel();

    User getUser();

    Date getDate();

    String getContent();

}
