package io.sponges.bot.api.storage.data;

import io.sponges.bot.api.entities.Network;

public class NetworkData extends Data {

    private final Network network;

    public NetworkData(Network network) {
        this.network = network;
        network.getRoleManager();
    }

    public Network getNetwork() {
        return network;
    }

}
