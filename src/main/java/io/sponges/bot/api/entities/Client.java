package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.data.ClientData;
import io.sponges.bot.api.entities.manager.NetworkManager;

import java.util.function.Consumer;

public interface Client {

    // TODO client load balancing, peers etc

    String getId();

    String getDefaultPrefix();

    NetworkManager getNetworkManager();

    ClientData getClientData();

    void sendMessage(String message, Consumer<String> callback);

}
