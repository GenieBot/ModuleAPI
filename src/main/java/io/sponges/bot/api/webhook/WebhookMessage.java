package io.sponges.bot.api.webhook;

import java.util.Set;

public interface WebhookMessage {

    /**
     * The body from the webhook message
     * @return webhook body
     */
    String getBody();

    /**
     * The headers from the webhook message
     * @return webhook headers
     */
    Set<String> getHeaders();

    /**
     * Checks if a header exists
     * @param name the name of the header to check for
     * @return true if the header exists
     */
    boolean isHeader(String name);

    /**
     * Gets the value of the specified header
     * @param name the name of the header
     * @return header value
     */
    String getHeader(String name);

}
