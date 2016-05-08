package io.sponges.bot.api.event.framework;

public abstract class Event {

    /**
     * Message IDs system, optional
     */
    private String id = null;

    public final boolean hasId() {
        return id != null;
    }

    public final String getId() {
        return id;
    }

    public final void setId(String id) {
        this.id = id;
    }
}
