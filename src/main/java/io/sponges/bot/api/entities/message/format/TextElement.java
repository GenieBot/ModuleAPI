package io.sponges.bot.api.entities.message.format;

import org.json.JSONArray;
import org.json.JSONObject;

public final class TextElement {

    private final String text;
    private final Attribute[] attributes;

    public TextElement(String text, Attribute... attributes) {
        this.text = text;
        this.attributes = attributes;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("content", text);
        JSONArray array = new JSONArray();
        for (Attribute attribute : attributes) {
            array.put(attribute);
        }
        json.put("attributes", array);
        return json;
    }

}