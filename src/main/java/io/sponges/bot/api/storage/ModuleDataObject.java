package io.sponges.bot.api.storage;

public class ModuleDataObject extends DataObject {

    public static final String MODULE_DATA_OBJECT_IDENTIFIER = "module_data_object";
    private static final String MODULE_ENABLED_KEY = "module_enabled";

    private final String key;

    public ModuleDataObject() {
        this.key = null;
    }

    public ModuleDataObject(String key) {
        this.key = key;
    }

    public boolean isEnabled() {
        return exists(MODULE_ENABLED_KEY) && (boolean) get(MODULE_ENABLED_KEY);
    }

    public void setEnabled(boolean enabled) {
        set(MODULE_ENABLED_KEY, enabled);
    }

    @Override
    public String getKey() {
        return key;
    }
}
