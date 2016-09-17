package io.sponges.bot.api.entities;

import io.sponges.bot.api.entities.data.UserData;

import java.util.UUID;

public interface User extends Entity {

    UUID getId();

    String getSourceId();
    
    Network getNetwork();

    UserData getUserData();

    boolean isPlatformAdmin();

    boolean isOp();

    boolean hasPermission(String permission);

    void kick();

}
