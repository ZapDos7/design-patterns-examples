package com.zapdos7.behavioraldesignpatterns.exercise4;

import java.util.Iterator;

public class StockIterator implements Iterator {

    private Inventory inventory;
    private int index;

    public StockIterator(Inventory inventory) {
        this.inventory = inventory;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return this.inventory.getItems().length > this.index;
    }

    @Override
    public Item next() {
        if (this.hasNext()) {
            Item item = this.inventory.getItems()[index++];
            if (item.isStocked()) {
                // return only stocked items
                return item;
            }
            else {
                return next();
            }
        }
        else { //last item
            return null;
        }
    }

    @Override
    public void remove() {

    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    
}
