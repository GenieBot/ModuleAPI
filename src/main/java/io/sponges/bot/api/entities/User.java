package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.channel.Channel;
import io.sponges.bot.api.entities.data.UserData;

import java.util.List;

public interface User {

    String getId();
    
    Network getNetwork();

    boolean isPlatformAdmin();

    boolean isOp();

    List<Channel> getChannels();

    Role getRole();

    void setRole(Role role);

    boolean hasPermission(String permission);

    void kick();

    UserData getData();

}
