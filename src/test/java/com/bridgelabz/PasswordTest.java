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
        return Arrays.asList(new Object[][] {{"knkn", false}, {"hkjHh*4oohj", true}, {"nj9w(JHsai", true}, {"mlmHjo@o768", true}, {"gjygJH98vh", false}, {"gjy*gJH#98vh", false}});
    }

    @Test
    public void testPasswordTest(){
        Assert.assertEquals(expectedResult, userRegistration.passwordTesting(password));
    }
}
