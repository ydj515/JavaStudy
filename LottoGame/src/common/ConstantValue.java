package common;

import java.util.Scanner;

public class ConstantValue {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final int LOTTO_TICKET_PRICE = 1000;

    /* 버퍼 지우기 */
    public static void CLEAR_BUFFER() {
        SCANNER.nextLine();
    }

    public static final String SEPERATOR = ",";
}
