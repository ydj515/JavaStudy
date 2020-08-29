package racingGame;

import common.ConstValue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class CarGameProgressTest {

    @Before
    public void setUp() {
        System.out.println("===Set up===");
    }

    @Test
    public void calculatePositionTest() {
        assertEquals("-", calculatePosition(1));
        assertEquals("",calculatePosition(0));
        assertEquals("---",calculatePosition(3));
    }

    private String calculatePosition(int n) {
        String countPosition = "";

        for (int i = 0; i < n; i++) {
            countPosition += ConstValue.POSITION_STRING;
        }

        return countPosition;
    }
}