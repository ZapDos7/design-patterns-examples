package com.zapdos7.behavioraldesignpatterns.challenge2;

public class ReturnOrderCommand implements Command {

    private Jacket jacket;

    public ReturnOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        jacket.returnOrder();
    }
    
}
