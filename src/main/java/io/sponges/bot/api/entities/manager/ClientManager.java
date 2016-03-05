package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.Client;

import java.util.Map;

public interface ClientManager {

    Map<String, Client> getClients();

    boolean isClient(String id);

    Client getClient(String id);

}
