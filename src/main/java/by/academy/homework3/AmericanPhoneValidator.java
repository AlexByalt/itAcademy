package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    @Override
    public boolean isValid(String string) {
        Pattern pattern = Pattern.compile("\\+1");
        Matcher matcher = pattern.matcher(string);
        if (matcher.lookingAt()) {
            return true;
        } else {
            return false;
        }

    }
}
