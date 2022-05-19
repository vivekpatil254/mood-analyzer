package com.bridgelabz;

public class MoodAnalyzerMain {

    public static void main(String[] args) {
        String result;
        System.out.println("Ability to analyze and respond happy or sad mood ");
        MoodAnalyzer moodAnalyzer=new MoodAnalyzer("I am in sad mood");
       // moodAnalyzer.analyzeMood("I am in sad mood");
        MoodAnalyzer moodAnalyzer1=new MoodAnalyzer(null);
        MoodAnalyzer moodAnalyzer3=new MoodAnalyzer("empty");
        MoodAnalyzer moodAnalyzer2=new MoodAnalyzer();
    }
}
