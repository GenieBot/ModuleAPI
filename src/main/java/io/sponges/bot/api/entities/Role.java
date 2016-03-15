package io.sponges.bot.api.entities;

import java.util.Collection;

public interface Role {

    String getId();

    String getName();

    Collection<Permission> getPermissions();

    void addPermission(Permission permission);

    void removePermission(String permission);

    void removePermission(Permission permission);

}
