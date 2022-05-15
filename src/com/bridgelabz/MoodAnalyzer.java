package com.bridgelabz;

public class MoodAnalyzer {
    public String analyzeMood(String message)
    {
        if(message.equalsIgnoreCase("I am in sad mood"))
        {
                return "sad";
        }
        else
            return "happy";
    }


}
