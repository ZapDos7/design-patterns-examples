package com.zapdos7.behavioraldesignpatterns.challenge3;

public class EndsWithPeriod implements Expression{

    @Override
    public String interpret(String context) {
        context = HelperMethods.endsWithPeriod(context);
        return context;
    }
    
}
