package io.sponges.bot.api.webhook;

import java.util.function.Consumer;

public interface Webhook {

    void registerListener(Consumer<WebhookMessage> callback);

    void unregisterListener(Consumer<WebhookMessage> callback);

    String getId();

    String getUrl();
}
