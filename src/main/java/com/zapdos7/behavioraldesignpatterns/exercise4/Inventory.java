package com.zapdos7.behavioraldesignpatterns.exercise4;

import java.util.Iterator;

public class Inventory implements Iterable {

    private Item[] items;

    public Inventory(Item...items) {
        this.items = items;
    }

    @Override
    public StockIterator iterator() {
        return new StockIterator(this);
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }
    
    
}
