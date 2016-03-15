package io.sponges.bot.api.storage.data;

import io.sponges.bot.api.entities.channel.Channel;

public class ChannelData extends Data {

    private final Channel channel;

    public ChannelData(Channel channel) {
        this.channel = channel;
    }

    public Channel getChannel() {
        return channel;
    }
}
