package view;


import common.ConstValue;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class BaseBallGameInputViewTest {

    @Before
    public void setUp() {
        System.out.println("===Set up===");
    }

    @Test
    public void inputNumberTest() {
        assertEquals(Arrays.asList(1, 2, 3), inputNumberConvertLogic("1 2 3"));
        assertEquals(Arrays.asList(1), inputNumberConvertLogic("1"));
        assertEquals(Arrays.asList(1, 2), inputNumberConvertLogic("1 2"));

    }

    private List<Integer> inputNumberConvertLogic(String inputNumber) {
        return Arrays.stream(inputNumber.split(ConstValue.SEPARATOR_BLANK)).map(Integer::new).collect(Collectors.toList());
    }
}