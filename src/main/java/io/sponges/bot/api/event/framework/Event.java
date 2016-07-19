package io.sponges.bot.api.event.framework;

public abstract class Event {

    private volatile boolean cancelled = false;
    private volatile long timeSlot = 100;
    private volatile long checkInterval = 10;

    private final boolean cancellable;

    public Event() {
        this(false);
    }

    public Event(boolean cancellable) {
        this.cancellable = cancellable;
    }

    public Event(boolean cancellable, long timeSlot) {
        this.cancellable = cancellable;
        this.timeSlot = timeSlot;
    }

    public boolean isCancellable() {
        return cancellable;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public long getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(long timeSlot) {
        this.timeSlot = timeSlot;
    }

    public long getCheckInterval() {
        return checkInterval;
    }

    public void setCheckInterval(long checkInterval) {
        this.checkInterval = checkInterval;
    }
}
