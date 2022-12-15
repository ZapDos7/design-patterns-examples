package com.zapdos7.designpatterns.behavioral.challenge2;

public class PlaceOrderCommand implements Command{
    private Jacket jacket;

    public PlaceOrderCommand(Jacket jacket) {
        this.jacket = jacket;
    }

    @Override
    public void execute() {
        jacket.placeOrder();
    }
    
}
