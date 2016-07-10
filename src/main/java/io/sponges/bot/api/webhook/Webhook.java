package io.sponges.bot.api.webhook;

import java.util.function.Consumer;

public interface Webhook {

    /**
     * Registers a new listener for webook messages
     * @param callback listener
     */
    void registerListener(Consumer<WebhookMessage> callback);

    /**
     * Unregisters an existing listener
     * @param callback the listener to unregister
     */
    void unregisterListener(Consumer<WebhookMessage> callback);

    /**
     * The id of the webhook
     * @return webhook identifier
     */
    String getId();

    /**
     * The url this webhook listens on
     * @return webhook url
     */
    String getUrl();
}
