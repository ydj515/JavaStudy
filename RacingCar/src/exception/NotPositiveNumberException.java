package exception;

import common.ConstValue;

public class NotPositiveNumberException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public NotPositiveNumberException(String message) {
        super(message);
    }

    public static void checkPositiveNumber(int num) {
        if(num <= 0) {
            throw new NotPositiveNumberException(ConstValue.INPUT_TRY_AGAIN_QUESTION);
        }
    }
}
