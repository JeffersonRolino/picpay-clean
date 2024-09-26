package jeffersonrolino.com.github.core.exception.enums;

public enum ErrorCodeEnum {
    ON0001("Tax Number invalid.", "ON-0001"),
    TR0001("User of the type Shopkeeper has not have transfers capabilities.", "TR-OOO1"),
    TR0002("Balance insufficient.", "TR-OOO1"),
    TRP0001("Pin invalid", "TRP-0001")
    ;

    private String message;
    private String code;

    ErrorCodeEnum(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
