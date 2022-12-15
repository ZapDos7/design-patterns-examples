package com.zapdos7.designpatterns.behavioral.challenge3;

public class NotHasRepeatedWords implements Expression{

    // check 3: sentence ends with a period
    EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

    @Override
    public String interpret(String context) {
        context = HelperMethods.noRepeatedWords(context);
        return endsWithPeriod.interpret(context);    
    }
    
}
