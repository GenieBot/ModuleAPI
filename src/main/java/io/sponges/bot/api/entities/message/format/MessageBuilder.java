package io.sponges.bot.api.entities.message.format;

import io.sponges.bot.api.entities.message.Attachment;

import java.util.ArrayList;
import java.util.List;

public final class MessageBuilder {

    private List<TextElement> elements;
    private List<Attachment> attachments;

    public MessageBuilder() {
    }

    public MessageBuilder withText(TextElement element) {
        if (elements == null) {
            elements = new ArrayList<>();
        }
        elements.add(element);
        return this;
    }

    public MessageBuilder withText(String text, Attribute... attributes) {
        return withText(new TextElement(text, attributes));
    }

    public MessageBuilder withText(String text) {
        return withText(new TextElement(text));
    }

    public MessageBuilder withAttachment(Attachment attachment) {
        if (attachments == null) {
            attachments = new ArrayList<>();
        }
        attachments.add(attachment);
        return this;
    }

    public FormattedMessage build() {
        return new FormattedMessage() {
            @Override
            public List<TextElement> getTextElements() {
                return elements;
            }

            @Override
            public List<Attachment> getAttachments() {
                return attachments;
            }
        };
    }

}
