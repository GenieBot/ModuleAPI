package io.sponges.bot.api.event.events.server;

import io.sponges.bot.api.entities.Client;

public final class ClientConnectEvent extends ClientEvent {

    private final Client client;

    public ClientConnectEvent(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }
}
