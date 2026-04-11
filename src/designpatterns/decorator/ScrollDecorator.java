package designpatterns.decorator;

public class ScrollDecorator extends BaseDecorator {

    public ScrollDecorator(VisualComponent visualComponent) {
        super(visualComponent);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Drawing a scroll decorator");
    }
}
