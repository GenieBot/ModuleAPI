package io.sponges.bot.api.entities;

import java.util.List;
import java.util.Optional;

public interface Role {

    String getId();

    Optional<String> getName();

    void setName(String name);

    List<String> getPermissions();

    void addPermission(String permission);

    void removePermission(String permission);

    boolean hasPermission(String node);

}
