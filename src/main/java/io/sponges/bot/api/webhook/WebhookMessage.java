package io.sponges.bot.api.webhook;

import java.util.Set;

public interface WebhookMessage {

    String getBody();

    Set<String> getHeaders();

}
