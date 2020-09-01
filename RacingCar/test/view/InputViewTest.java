package view;

import common.ConstValue;
import exception.NotPositiveNumberException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.exit;
import static org.junit.Assert.assertEquals;

public class InputViewTest {

    @Before
    public void setUp() {
        System.out.println("===Set up===");
    }

    @Test
    public void inputCarNameTest() {
        assertEquals(Arrays.asList("a", "b", "c"), inputCarNameConvertLogic("a,b,c"));
    }

    private List<String> inputCarNameConvertLogic(String inputString) {
        return new ArrayList<>(Arrays.asList(inputString.split(ConstValue.SEPARATOR_COMMA)));
    }

    @Test
    public void validIsNumberTest() {
        assertEquals(-1, validIsNumber("-1"));
        assertEquals(-1, validIsNumber("abc"));
        assertEquals(-1, validIsNumber(" "));
        assertEquals(12, validIsNumber("12"));
        assertEquals(-0, validIsNumber("0"));
    }

    private int validIsNumber(String inputString) {

        int inputNumber = -1;
        try {
            inputNumber = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            System.out.println(ConstValue.NUMBER_FORMAT_EXCEPTION_MESSAGE);
//            exit(0);
        }

        return inputNumber;
}

    @Test
    public void validIsPositiveNumberTest() {
        assertEquals(1, validIsPositiveNumber(1));
        assertEquals(-1, validIsPositiveNumber(-1));
        assertEquals(-1, validIsPositiveNumber(-500));
        assertEquals(30, validIsPositiveNumber(30));
        assertEquals(-1, validIsPositiveNumber(0));

    }

    private int validIsPositiveNumber(int num) {
        try {
            NotPositiveNumberException.checkPositiveNumber(num);
        } catch (NotPositiveNumberException e) {
            System.out.println(ConstValue.INPUT_TRY_AGAIN_QUESTION);
            return -1;
//            exit(0);
        }
        return num;
    }

}