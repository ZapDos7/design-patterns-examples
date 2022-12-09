package com.zapdos7.behavioraldesignpatterns.challenge3;

public class BeginsWithUppercase implements Expression {

    // check 2: no repeated words
    private NotHasRepeatedWords notHasRepeatedWords = new NotHasRepeatedWords();

    @Override
    public String interpret(String context) {
        context = HelperMethods.firstLetterLowerCase(context);
        return notHasRepeatedWords.interpret(context);    
    }
    
}
