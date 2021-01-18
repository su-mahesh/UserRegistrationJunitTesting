package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration {
    final private String firstNamePattern = "[A-Z][a-z]{2,}";
    final private String lastNamePattern = "[A-Z][a-z]{2,}";
    final private String emailAddressPattern = "[A-Za-z0-9_][+A-Za-z0-9_-]*[.]?[+A-Za-z0-9_-]+[@]([A-Za-z0-9]+[.][A-Za-z]{2,63}|[A-Za-z0-9-]{2,}[.][A-Za-z0-9]{2,63}[.][A-Za-z]{2,3})";
    final private String mobileNumberPattern = "^[1-9][0-9]{0,2}\\s[0-9]{10}";
    final private String passwordPattern = "^(?=.{8,20}$)(?=.*[0-9])(?=.*[A-Z])[A-Za-z0-9]*[^A-Za-z0-9][A-Za-z0-9]*$";


    public boolean firstNameTesting(String firstName){
            return Pattern.matches(firstNamePattern, firstName);
    }
    public boolean lastNameTesting(String lastName){
        return Pattern.matches(lastNamePattern, lastName);
    }
    public boolean emailAddressTesting(String emailAddress){
        return Pattern.matches(emailAddressPattern, emailAddress);
    }
    public boolean mobileNumberTesting(String mobileNumber){
        return Pattern.matches(mobileNumberPattern, mobileNumber);
    }
    public boolean passwordTesting(String password){
        return Pattern.matches(passwordPattern, password);
    }
}

