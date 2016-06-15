package io.sponges.bot.api.webhook;

import java.util.Collection;

public interface WebhookManager {

    Collection<Webhook> getWebhooks();

    boolean isWebhook(String id);

    Webhook getWebhook(String id);

    Webhook create(String id, String url);

    void register(Webhook webhook);

    void unregister(String id);

}
