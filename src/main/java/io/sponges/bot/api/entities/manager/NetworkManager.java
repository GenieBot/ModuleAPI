package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;

import java.util.Map;
import java.util.function.Consumer;

public interface NetworkManager {

    Map<String, Network> getNetworks();

    Client getClient();

    boolean isNetwork(String id);

    Network getNetwork(String id);

    void loadNetwork(String id, Consumer<Network> callback);

}
