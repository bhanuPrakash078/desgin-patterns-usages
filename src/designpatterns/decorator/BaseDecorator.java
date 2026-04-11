package designpatterns.decorator;

public class BaseDecorator extends VisualComponent{

    private VisualComponent visualComponent;

    public BaseDecorator(VisualComponent visualComponent) {
        this.visualComponent = visualComponent;
    }

    public void draw() {
        visualComponent.draw();
    }
}
