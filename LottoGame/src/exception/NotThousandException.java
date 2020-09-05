package exception;


public class NotThousandException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotThousandException(String message) {
        super(message);
    }

    public static void checkPositiveNumber(int num) {
        if ((num % 1000) != 0) {
            throw new NotThousandException("구입 금액을 천단위로 입력하세요");
        }
    }
}
