package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

    @Override
    public boolean isValid(String string) {
        Pattern pattern = Pattern.compile("\\+375");
        Matcher matcher = pattern.matcher(string);
        if (matcher.lookingAt()) {
            return true;
        } else {
            return false;
        }
    }
}
