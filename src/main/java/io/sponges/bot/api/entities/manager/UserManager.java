package io.sponges.bot.api.entities.manager;

import io.sponges.bot.api.entities.User;

import java.util.Map;
import java.util.function.Consumer;

public interface UserManager {

    Map<String, User> getUsers();

    boolean isUser(String id);

    User getUser(String id);

    void kickUser(User user);

    void loadUser(String id, Consumer<User> callback);

}
