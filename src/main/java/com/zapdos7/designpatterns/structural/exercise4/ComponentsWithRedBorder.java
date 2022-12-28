package com.zapdos7.designpatterns.structural.exercise4;

import java.awt.Graphics;
import java.awt.Color;

public class ComponentsWithRedBorder implements Component {

    Component decoratedComponent;
    
    public ComponentsWithRedBorder(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }

    @Override
    public void draw(Graphics graphics) {
        // the new functionality aka red color:
        graphics.setColor(Color.RED);
        decoratedComponent.draw(graphics);
        // set back to black so that not all circles are red
        graphics.setColor(Color.BLACK);
    }
    
}
