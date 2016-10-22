/**
 * Created by Наталия on 23.10.2016.
 */
public class DumbValidation {
    public static boolean isValid(String phone) {
        if (phone.charAt(0) != '+' && phone.charAt(0) != '0' && phone.charAt(0) != '8') {
            return false;
        }
        if (phone.charAt(0) == '+' && !phone.substring(1, 4).equals("380")) {
            return false;
        }
        if(phone.charAt(0) == '+' && phone.length()!=13){
            return false;
        }
        if (phone.charAt(0) == '0' && phone.charAt(1) == '0') {
            if (!phone.substring(2, 5).equals("380")) {
                return false;
            }else if(phone.length()!=14){
                return false;
            }
        }
        if (phone.charAt(0) == '0' && phone.charAt(1) != '0') {
            if (!phone.substring(1, 3).equals("39") &&
                    !phone.substring(1, 3).equals("50") &&
                    !phone.substring(1, 3).equals("63") &&
                    !phone.substring(1, 3).equals("66") &&
                    !phone.substring(1, 3).equals("67") &&
                    !phone.substring(1, 3).equals("68") &&
                    !phone.substring(1, 3).equals("91") &&
                    !phone.substring(1, 3).equals("92") &&
                    !phone.substring(1, 3).equals("93") &&
                    !phone.substring(1, 3).equals("94") &&
                    !phone.substring(1, 3).equals("95") &&
                    !phone.substring(1, 3).equals("96") &&
                    !phone.substring(1, 3).equals("97") &&
                    !phone.substring(1, 3).equals("98") &&
                    !phone.substring(1, 3).equals("99")) {
                return false;
            }else if(phone.length()!=10){
                return false;
            }
        }
        if (phone.charAt(0)=='8' && phone.length()!=11){
            return false;
        }
        try {
            Long phoneNumber = Long.parseLong(phone);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
