package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;

import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

public interface NetworkManager {

    Map<String, Network> getNetworks();

    Client getClient();

    boolean isNetwork(UUID id);

    Network getNetwork(UUID id);

    void loadNetwork(String sourceId, Consumer<Network> callback);

    Network loadNetworkSync(String sourceId); // TODO switch for Future<Network>

    // this will query the database for the source id
    Network loadNetworkSync(UUID id);

    // this callback is called multiple times for each network
    void loadAllNetworks(Consumer<Network> callback);

}
