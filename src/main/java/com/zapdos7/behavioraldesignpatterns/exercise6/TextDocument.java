package com.zapdos7.behavioraldesignpatterns.exercise6;

public class TextDocument {

  private String text = "";
  private Memento memento = new Memento(text);

  public void write(String text) {
    this.text += text;
  }

  public void print() {
    System.out.println(text);
  }

  public void save() {
    memento.setState(text);
  }

  public void undo() {
    text = memento.getState();
  }

}
