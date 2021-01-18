package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenSad_ShouldReturnSad(){
        MoodAnanlyser moodAnanlyser = new MoodAnanlyser();
        String mood = moodAnanlyser.analiseMood("this is sad message");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenHappy_ShouldReturnHappy(){

        MoodAnanlyser moodAnanlyser = new MoodAnanlyser();
         String mood = moodAnanlyser.analiseMood("Happy");
         Assert.assertEquals("HAPPY", mood);
    }


    }

