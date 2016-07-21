package io.sponges.bot.api.event.events.channel;

import io.sponges.bot.api.event.framework.Event;

public abstract class ChannelEvent extends Event {

    public ChannelEvent() {
    }

    public ChannelEvent(boolean cancellable) {
        super(cancellable);
    }
}
