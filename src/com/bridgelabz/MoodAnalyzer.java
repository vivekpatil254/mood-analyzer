package com.bridgelabz;

public class MoodAnalyzer {

    public MoodAnalyzer(String message) {
        String result;
        result = analyzeMood(message);
        System.out.println("from parametrized constructor : " + result);
    }

    public MoodAnalyzer() {
        String result;
        result = analyzeMood("I am in Any Mood");
        System.out.println("from default constructor : " + result);
    }

    public String analyzeMood(String message) {
        try {
            if (message.equalsIgnoreCase("empty"))
                throw new MoodAnalysisException();
            if (message.equalsIgnoreCase("I am in sad mood")) {
                return "sad";
            } else
                return "happy";
        } catch (NullPointerException e) {
            System.out.println(" Exception occured happy from catch block : " + e);
            return "Happy";
        }
        catch(MoodAnalysisException ex){
            System.out.println("Custom exception : "+ex);
            return "";
        }
    }
}


