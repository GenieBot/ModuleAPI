package io.sponges.bot.api.entities;

public abstract class Permission {

    private final String node;

    protected Permission(String node) {
        this.node = node;
    }

    public String getNode() {
        return node;
    }
}
