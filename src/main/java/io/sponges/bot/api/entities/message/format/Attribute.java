package io.sponges.bot.api.entities.message.format;

public enum Attribute {

    BOLD, UNDERLINE, STRIKE, ITALIC, CODE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }

}