import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Application {

    public static void validateWithRegExp() {
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        boolean valid = true;
        do {
            System.out.println("Please, enter the phone number:");
            try {
                str += bufferedReader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            valid = DumbValidation.isValid(str);
            if (valid) {
                System.out.println("Phone number is correct!!!");
            }else {
                System.out.println("Phone number is incorrect");
            }
            str = "";
        } while (!valid);



    }
}
