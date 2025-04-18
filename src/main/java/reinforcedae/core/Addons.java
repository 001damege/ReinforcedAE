package reinforcedae.core;

public enum Addons {
    APPMEK("appmek"),
    APPBOT("appbot"),
    ARSENG("arseng");

    private final String modId;

    Addons(String modId) {
        this.modId = modId;
    }

    public String getModId() {
        return modId;
    }
}
