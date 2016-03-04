package io.sponges.bot.api.cmd;

public abstract class Command {

    private final String description;
    private final String[] names;

    public Command(String description, String... names) {
        this.description = description;
        this.names = names;
    }

    public abstract void onCommand(CommandRequest request, String[] args);

    public String getDescription() {
        return description;
    }

    public String[] getNames() {
        return names;
    }
}
