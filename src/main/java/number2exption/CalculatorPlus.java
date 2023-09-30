package number2exption;

public class CalculatorPlus {
    public Integer from(String str) throws NumberFormatException {

        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            throw new NumberFormatException();
        }
    }
}
