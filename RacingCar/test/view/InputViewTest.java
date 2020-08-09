package view;

import common.ConstValue;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class InputViewTest {

    private Scanner scanner;

    @Before
    public void setUp() {
        System.out.println("===Set up===");
        scanner = new Scanner(System.in);
    }

    @Test
    public void inputCarName() {
        assertEquals(Arrays.asList("a", "b", "c"), inputCarNameConvertLogic("a,b,c"));
    }

    private List<String> inputCarNameConvertLogic(String inputString) {
        return new ArrayList<>(Arrays.asList(inputString.split(ConstValue.SEPARATOR_COMMA)));
    }

    @Test
    public void inputTryNumAndReturnNum() {
    }
}