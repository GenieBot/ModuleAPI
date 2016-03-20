package io.sponges.bot.api.storage;

import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.channel.Channel;
import io.sponges.bot.api.storage.data.ChannelData;
import io.sponges.bot.api.storage.data.NetworkData;

import java.util.function.Consumer;

public interface Storage {

    void load(Network network, Consumer<NetworkData> callback);

    void save(Network network, Consumer<String> callback);

    void load(Channel channel, Consumer<ChannelData> callback);

    void save(Channel channel, Consumer<String> callback);

    boolean isLoaded(Network network);

    boolean isLoaded(Channel channel);

    String get(String key);

    void set(String key, String value, Consumer<String> callback);

    boolean isPresent(String key);

}
