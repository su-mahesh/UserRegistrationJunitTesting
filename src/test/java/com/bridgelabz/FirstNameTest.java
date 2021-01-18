package com.bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
    public class FirstNameTest {
        UserRegistration userRegistration;
        private String firstName;
        private boolean expectedResult;

        public FirstNameTest(String firstName, boolean expectedResult){
            super();
            this.firstName = firstName;
            this.expectedResult = expectedResult;
        }

        @Before
        public void initialise(){
            userRegistration = new UserRegistration();
        }

        @Parameterized.Parameters
        public static Collection input(){
            return Arrays.asList(new Object[][] {{"Mahesh", true}, {"mahesh", false}, {"m", false}, {"MAHESh", false}, {"Mahesh1", false}, {"3Mahe", false}});
        }

        @Test
        public void testFirstNameTest(){
            Assert.assertEquals(expectedResult, userRegistration.firstNameTesting(firstName));
        }
    }








