package io.sponges.bot.api.entities.message.format;

import io.sponges.bot.api.entities.message.Attachment;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public interface FormattedMessage {

    List<TextElement> getTextElements();

    List<Attachment> getAttachments();

    default String getRaw() {
        JSONObject json = new JSONObject();
        JSONArray array = new JSONArray();
        List<TextElement> elements = getTextElements();
        for (int i = 0; i < elements.size(); i++) {
            TextElement element = elements.get(i);
            JSONObject object = element.toJson();
            object.put("order", i);
            array.put(object);
        }
        json.put("parts", array);
        return json.toString();
    }

}
