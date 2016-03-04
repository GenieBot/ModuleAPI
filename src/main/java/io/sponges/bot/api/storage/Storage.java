package io.sponges.bot.api.storage;

import io.sponges.bot.api.entities.Channel;
import io.sponges.bot.api.entities.Network;

import java.util.function.Consumer;

public interface Storage {

    void load(Network network, Consumer<NetworkData> callback);

    void save(Network network, Consumer<Boolean> callback);

    void load(Channel channel, Consumer<ChannelData> callback);

    void save(Channel channel, Consumer<Boolean> callback);

    boolean isLoaded(Channel channel);

}
