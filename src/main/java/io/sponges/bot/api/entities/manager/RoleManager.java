package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.Network;
import io.sponges.bot.api.entities.Role;

import java.util.Collection;

public interface RoleManager {

    Network getNetwork();

    Collection<Role> getRoles();

    boolean isRole(String id);

    Role createRole(String id);

    Role getRole(String id);

    void removeRole(String id);

}
