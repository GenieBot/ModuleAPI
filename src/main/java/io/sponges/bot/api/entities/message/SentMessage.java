package io.sponges.bot.api.entities.message;

import java.util.List;

public interface SentMessage {

    void delete();

    void edit(String content);

    void setAttachments(List<Attachment> attachments);

    void addAttachment(Attachment attachment);

    void removeAttachment(Attachment attachment);

}
