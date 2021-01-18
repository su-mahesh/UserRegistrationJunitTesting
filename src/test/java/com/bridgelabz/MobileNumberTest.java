package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MobileNumberTest {
    UserRegistration userRegistration;
    private String mobileNumber;
    private boolean expectedResult;

    public MobileNumberTest(String mobileNumber, boolean expectedResult){
        super();
        this.mobileNumber = mobileNumber;
        this.expectedResult = expectedResult;
    }

    @Before
    public void initialise(){
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input(){
        return Arrays.asList(new Object[][] {{"91 8438293859", true}, {"250 1234567890", true}, {"9109432456", false}, {"86864u32u4", false}, {"1 384757", false}});
    }

    @Test
    public void testMobileNumberTest(){
        Assert.assertEquals(expectedResult, userRegistration.mobileNumberTesting(mobileNumber));
    }
}
