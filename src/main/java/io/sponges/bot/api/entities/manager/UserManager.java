package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.User;

import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;

public interface UserManager {

    Map<String, User> getUsers();

    boolean isUser(UUID id);

    User getUser(UUID id);

    void kickUser(User user);

    void loadUser(String sourceId, Consumer<User> callback);

    User loadUserSync(String sourceId); // TODO switch for Future<User>
}
