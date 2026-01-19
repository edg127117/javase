public class IdException extends Exception {
    public IdException() {
        super("身份证信息异常");
    }

    public IdException(String message) {
        super(message);
    }
}
