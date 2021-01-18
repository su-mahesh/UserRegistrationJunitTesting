package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    private String firstNamePattern = "[A-Z][a-z]{2,}";

    public boolean firstNameTesting(String firstName){
            return Pattern.matches(firstNamePattern, firstName);
    }
}

