package number1exption;

import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            System.out.println(calculator.tranFormToInteger("12455DFG45245"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
