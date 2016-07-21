package io.sponges.bot.api.entities.data;

import java.util.Optional;

public interface ChannelData {

    Optional<String> getName();

    void updateName(String name);

    Optional<String> getTopic();

    void updateTopic(String topic);

}
