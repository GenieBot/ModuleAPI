package io.sponges.bot.api.event.events.channel;

import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.User;
import io.sponges.bot.api.entities.channel.GroupChannel;

import java.util.Optional;

public final class ChannelTopicChangeEvent extends ChannelEvent {

    private final Network network;
    private final GroupChannel channel;
    private final User user;
    private final String newTopic;

    private Optional<String> oldTopic = Optional.empty();

    public ChannelTopicChangeEvent(Network network, GroupChannel channel, User user, String newTopic) {
        this.network = network;
        this.channel = channel;
        this.user = user;
        this.newTopic = newTopic;
    }

    public Network getNetwork() {
        return network;
    }

    public GroupChannel getChannel() {
        return channel;
    }

    public User getUser() {
        return user;
    }

    public String getNewTopic() {
        return newTopic;
    }

    public Optional<String> getOldTopic() {
        return oldTopic;
    }

    public void setOldTopic(String oldTopic) {
        this.oldTopic = Optional.of(oldTopic);
    }
}
