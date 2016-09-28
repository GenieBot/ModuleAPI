package io.sponges.bot.api.exception;

public class ModuleNotFoundException extends ModuleException {

    private final String module;

    public ModuleNotFoundException(String module) {
        this.module = module;
    }

    @Override
    public String getMessage() {
        return "Could not find module \"" + module + "\"";
    }
}
