package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.channel.Channel;
import io.sponges.bot.api.entities.channel.PrivateChannel;

import java.util.List;
import java.util.Optional;

public interface User {

    String getId();
    
    Network getNetwork();

    boolean isGlobalAdmin();

    boolean isOp();

    List<Channel> getChannels();

    Role getRole();

    void setRole(Role role);

    boolean hasPermission(String permission);

    void kick();

    Optional<PrivateChannel> getPrivateChannel();

    Optional<String> getUsername();

    Optional<String> getDisplayName();

    Optional<String> getProfileURL();

    Optional<String> getProfileImage();

    Optional<String> getProfileMood();

}
