package io.sponges.bot.api.cmd;

public abstract class Command {

    // TODO permission implementation

    //private final Permission permission;
    private final String description;
    private final String[] names;

    public Command(//Permission permission,
            String description, String... names) {
        //this.permission = permission;
        this.description = description;
        this.names = names;
    }

    public abstract void onCommand(CommandRequest request, String[] args);

    /*public Permission getPermission() {
        return permission;
    }*/

    public String getDescription() {
        return description;
    }

    public String[] getNames() {
        return names;
    }
}
