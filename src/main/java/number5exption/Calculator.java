package number5exption;

import java.awt.*;

public class Calculator {
    List l = new List();
    public Integer integer(String str){
        try {
            return Integer.getInteger(str);
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
