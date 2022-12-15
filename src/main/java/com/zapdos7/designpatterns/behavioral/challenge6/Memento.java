package com.zapdos7.designpatterns.behavioral.challenge6;

public class Memento {
    private int state;

    public Memento(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    
}
