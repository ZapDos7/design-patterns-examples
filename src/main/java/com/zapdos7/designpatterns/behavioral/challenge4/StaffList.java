package com.zapdos7.designpatterns.behavioral.challenge4;

public class StaffList implements Iterable {

    private Employee[] employees;

    public StaffList(Employee...employees) {
        this.employees = employees;
    }

    @Override
    public StaffListIterator iterator() {
        return new StaffListIterator(this);
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }


    
}
