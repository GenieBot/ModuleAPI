package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.Client;

import java.util.Map;
import java.util.UUID;

public interface ClientManager {

    Map<String, Client> getClients();

    boolean isClient(UUID id);

    Client getClient(UUID id);

}
