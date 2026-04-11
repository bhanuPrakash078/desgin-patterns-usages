package designpatterns.decorator;

import java.awt.*;

public class BorderDecorator extends BaseDecorator {

    private int borderWidth;

    public BorderDecorator(VisualComponent component, int borderWidth) {
        super(component);
        this.borderWidth = borderWidth;
    }

    @Override
    public void draw() {
        System.out.println("Adding a border on top with width " + borderWidth);
        super.draw();
        System.out.println("Adding a border on bottom with width " + borderWidth);
    }
}
