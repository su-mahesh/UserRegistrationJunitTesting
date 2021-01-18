package com.bridgelabz;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


public class UserRegistrationTesting {
    public static void main(String[] args) {

        Result result = JUnitCore.runClasses(FirstNameTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("first name test result: "+result.wasSuccessful());

        result = JUnitCore.runClasses(LastNameTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("last name test result: "+result.wasSuccessful());

        result = JUnitCore.runClasses(EmailAddressTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("email address test result: "+result.wasSuccessful());

        result = JUnitCore.runClasses(MobileNumberTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("mobile number test result: "+result.wasSuccessful());

        result = JUnitCore.runClasses(PasswordTest.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        System.out.println("password test result: "+result.wasSuccessful());

    }
}
