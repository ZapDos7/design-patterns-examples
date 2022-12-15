package com.zapdos7.designpatterns.behavioral.challenge4;

import java.util.Iterator;

public class StaffListIterator  implements Iterator {

    private StaffList staffList;
    private int index;

    public StaffListIterator(StaffList staffList) {
        this.staffList = staffList;
        index = 0;
      }

    @Override
    public boolean hasNext() {
        return staffList.getEmployees().length > index;
    }

    @Override
    public Employee next() {
        if (hasNext()) {
            return staffList.getEmployees()[index++];
        }
        else {
            return null;
        }
    }
}
