/**
 * Created by Наталия on 23.10.2016.
 */
public class DumbValidation {
    private static String[] operatorCodes =
            {"39", "50", "63", "66", "67", "68", "91", "92", "93", "94", "95", "96", "97", "98", "99"};

    public static boolean isValid(String str) {
        if (str.substring(0, 2).equals("00")) {
            if (str.substring(2, 5).equals("380")) {
                boolean isCorrectCode = false;
                for (String code : operatorCodes) {
                    if (str.substring(5, 7).equals(code)) {
                        isCorrectCode = true;
                    }
                }
                if (isCorrectCode && str.length()==14) {
                    return true;
                }
            }
        } else if (str.charAt(0) == '0' && str.charAt(1) != 0) {
            boolean isCorrectCode = false;
            for (String code : operatorCodes) {
                if (str.substring(1, 3).equals(code)) {
                    isCorrectCode = true;
                }
            }
            if (isCorrectCode && str.length()==10) {
                return true;
            }
        } else if (str.charAt(0) == '+' && str.substring(1, 4).equals("380")) {
            boolean isCorrectCode = false;
            for (String code : operatorCodes) {
                if (str.substring(4, 6).equals(code)) {
                    isCorrectCode = true;
                }
            }
            if (isCorrectCode && str.length()==13) {
                return true;
            }
        }else if (str.charAt(0)=='8' && str.charAt(1)=='0'){
            boolean isCorrectCode = false;
            for (String code : operatorCodes) {
                if (str.substring(2, 4).equals(code)) {
                    isCorrectCode = true;
                }
            }
            if (isCorrectCode && str.length()==11) {
                return true;
            }
        }
        return false;
    }
}
