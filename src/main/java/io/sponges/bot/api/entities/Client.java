package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.data.ClientData;
import io.sponges.bot.api.entities.manager.NetworkManager;

import java.util.UUID;

public interface Client extends Entity {

    // TODO client load balancing, peers etc

    UUID getId();

    String getSourceId();

    String getDefaultPrefix();

    NetworkManager getNetworkManager();

    ClientData getClientData();

}
