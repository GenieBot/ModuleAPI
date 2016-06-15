package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.Channel;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public interface ChannelManager {

    Network getNetwork();

    Map<String, Channel> getChannels();

    boolean isChannel(String id);

    Channel getChannel(String id);

    List<Channel> getChannels(User user);

    void loadChannel(String channelId, Consumer<Channel> callback);

    Channel loadChannelSync(String channelId);

}
