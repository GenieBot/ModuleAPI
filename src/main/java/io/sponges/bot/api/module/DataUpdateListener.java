package io.sponges.bot.api.module;

import io.sponges.bot.api.entities.Network;
import org.json.JSONObject;

public interface DataUpdateListener {

    // method is fired when the network's data is updated
    void update(Network network, JSONObject json);

}
