package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.channel.PrivateChannel;

import java.util.Optional;

public interface User {

    String getId();
    
    Network getNetwork();

    Optional<PrivateChannel> getPrivateChannel();

    Optional<String> getUsername();

    Optional<String> getDisplayName();

    Optional<String> getProfileURL();

    Optional<String> getProfileImage();

    Optional<String> getProfileMood();

}
