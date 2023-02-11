import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void checkNumber(String phone) {
        Pattern pattern = Pattern.compile("((\\+?380)([0-9]{9}))$");
        Matcher matcher = pattern.matcher(phone);
        if (matcher.matches()) {
            System.out.println(phone + " is correct");
        } else {
            System.out.println(phone + " is incorrect");
        }
    }

    public static void main(String[] args) {
        checkNumber ("+380682056196");
        checkNumber ("+8230682056196");
    }
}

