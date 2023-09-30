package number4exption;

import java.awt.*;
import java.util.ArrayList;

public class Number {
    List list = new List();

    public Integer integer(String str) throws NumberFormatException {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            throw new NumberFormatException();
        }
    }
}
