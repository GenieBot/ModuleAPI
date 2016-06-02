package io.sponges.bot.api.entities;

import java.util.List;

public interface Role {

    String getId();

    List<String> getPermissions();

    void addPermission(String permission);

    void removePermission(String permission);

    boolean hasPermission(String node);

}
