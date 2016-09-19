package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.channel.Channel;

import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

public interface ChannelManager {

    Network getNetwork();

    Map<String, Channel> getChannels();

    boolean isChannel(UUID id);

    Channel getChannel(UUID id);

    void loadChannel(String sourceId, Consumer<Channel> callback);

    Channel loadChannelSync(String sourceId); // TODO switch for Future<Channel>

    Channel loadChannelSync(UUID id);

}
