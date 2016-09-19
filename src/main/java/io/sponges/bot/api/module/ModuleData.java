package io.sponges.bot.api.module;

import io.sponges.bot.api.entities.Network;
import org.json.JSONObject;

public interface ModuleData {

    JSONObject get(Network network);

    void save(Network network, JSONObject json);

}
