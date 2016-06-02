package io.sponges.bot.api.entities.data;

import io.sponges.bot.api.entities.channel.PrivateChannel;

import java.util.Optional;

public interface UserData {

    Optional<PrivateChannel> getPrivateChannel();

    Optional<String> getUsername();

    Optional<String> getDisplayName();

    Optional<String> getProfileUrl();

    Optional<String> getProfileImage();

    Optional<String> getMood();

    Optional<String> getStatus();

}
