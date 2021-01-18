package com.bridgelabz;

public class MoodAnanlyser {
    public String analiseMood(String message)  {

            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
    }
}
