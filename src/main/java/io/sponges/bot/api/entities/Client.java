package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.data.ClientData;
import io.sponges.bot.api.entities.manager.NetworkManager;
import io.sponges.bot.api.storage.DataObject;

public interface Client extends Entity {

    // TODO client load balancing, peers etc

    String getId();

    String getDefaultPrefix();

    NetworkManager getNetworkManager();

    ClientData getClientData();

    DataObject getData();

}
