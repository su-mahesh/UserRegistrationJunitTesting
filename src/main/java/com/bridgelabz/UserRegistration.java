package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    final private String firstNamePattern = "[A-Z][a-z]{2,}";
    final private String lastNamePattern = "[A-Z][a-z]{2,}";

    public boolean firstNameTesting(String firstName){
            return Pattern.matches(firstNamePattern, firstName);
    }
    public boolean lastNameTesting(String lastName){
        return Pattern.matches(lastNamePattern, lastName);
    }
}

