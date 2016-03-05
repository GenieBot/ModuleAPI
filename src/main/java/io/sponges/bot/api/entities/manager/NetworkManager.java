package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.Client;
import io.sponges.bot.api.entities.Network;

import java.util.Map;

public interface NetworkManager {

    Client getClient();

    Map<String, Network> getNetworks();

    boolean isNetwork(String id);

    Network getNetwork(String id);

}
