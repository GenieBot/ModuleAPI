package io.sponges.bot.api.webhook;

import java.util.Collection;

public interface WebhookManager {

    /**
     * A collection of existing webhooks
     * @return webooks collection
     */
    Collection<Webhook> getWebhooks();

    /**
     * Checks whether a webhook exists
     * @param id the webhook identifier to check for
     * @return true if the webhook exists
     */
    boolean isWebhook(String id);

    /**
     * Gets a webhook by identifier
     * @param id the webhook identifier
     * @return webhook instance
     */
    Webhook getWebhook(String id);

    /**
     * Creates a new webook instance
     * @param id the idenfifier of the new webhook
     * @param url the url to listen on
     * @return webhook instance
     */
    Webhook create(String id, String url);

    /**
     * Registers a webhook instance
     * @param webhook instance to register
     */
    void register(Webhook webhook);

}
