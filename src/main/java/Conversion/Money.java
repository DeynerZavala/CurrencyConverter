package Conversion;

public class Money {
    private String code;
    private String text;

    public Money(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {

        return this.code + "  =>>  " + this.text;
    }
}
