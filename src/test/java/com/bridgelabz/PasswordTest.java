package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordTest {

    UserRegistration userRegistration;
    private String password;
    private boolean expectedResult;

    public PasswordTest(String password, boolean expectedResult){
        super();
        this.password = password;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialise(){
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] {{"knkn", false}, {"hkjHh4oohj", true}, {"nj9wJHsai", true}, {"mlmHjoo768", true}, {"232", false}});
    }

    @Test
    public void testPasswordTest(){
        Assert.assertEquals(expectedResult, userRegistration.passwordTesting(password));
    }
}
