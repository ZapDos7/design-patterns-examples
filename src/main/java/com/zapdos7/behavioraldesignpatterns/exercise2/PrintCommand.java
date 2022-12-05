package com.zapdos7.behavioraldesignpatterns.exercise2;

public class PrintCommand implements Command{

    private Document document;

    public PrintCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        document.print();
    }
    
}
