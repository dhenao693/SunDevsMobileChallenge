package utility;

public enum GenericsConstants {
    HORIZONTAL("horizontal"),
    NONE_TARGET("NONE_TARGET"),

    TARGET("TARGET"),
    TARGET_WEB_ELEMENT_FACADE("TARGET_WEB_ELEMENT_FACADE"),
    USER_IN_MEMORY("USER"),
    VERTICAL("vertical");

    private final String message;

    private GenericsConstants(String s) {
        this.message = s;
    }

    public String toString() {
        return this.message;
    }
}

