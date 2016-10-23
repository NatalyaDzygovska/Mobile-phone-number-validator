import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpValidation {
    public static boolean isValid(String phone){
        Pattern pattern = Pattern.compile("^(0038|\\+38|8)?0(39|50|63|6[6-8]|9[1-9])\\d{7}$");
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }
}
