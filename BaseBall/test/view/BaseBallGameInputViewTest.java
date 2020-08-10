package view;


import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

public class BaseBallGameInputViewTest {

    private Scanner scanner;

    @Before
    public void setUp() {
        System.out.println("===Set up===");
        scanner = new Scanner(System.in);
    }

    @Test
    public void inputNumber() {
    }
}