package io.sponges.bot.api.cmd;

import java.util.ArrayList;
import java.util.List;

public abstract class Command {

    private final List<String> permissions = new ArrayList<>();

    private volatile boolean globalDisabled = false;
    private String networkOnly = null;

    private final String description;
    private final String[] names;

    public Command(String description, String... names) {
        this.description = description;
        this.names = names;
    }

    public abstract void onCommand(CommandRequest request, String[] args);

    protected void registerPermission(String permission) {
        permissions.add(permission);
    }

    public String getDescription() {
        return description;
    }

    public String[] getNames() {
        return names;
    }

    public List<String> getPermissions() {
        return permissions;
    }

    public boolean requiresOp() {
        return false;
    }

    public boolean isGlobalDisabled() {
        return globalDisabled;
    }

    public boolean isLimitedToNetwork() {
        return networkOnly != null;
    }

    public String getNetworkOnly() {
        return networkOnly;
    }

    public void setNetworkOnly(String networkOnly) {
        this.networkOnly = networkOnly;
    }
}
