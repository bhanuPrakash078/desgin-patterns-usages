package designpatterns.decorator;

public class DecoratorRunner {

    public static void main(String[] args) {
        VisualComponent visualComponent = new VisualComponent();

        //First adding a scroll bar
        ScrollDecorator scrollDecorator = new ScrollDecorator(visualComponent);
        //Second adding a border
        BorderDecorator borderDecorator = new BorderDecorator(scrollDecorator, 8);

        //Adding one more border
        BorderDecorator borderDecorator2 = new BorderDecorator(borderDecorator, 28);

        //Adding one more scroll bar
        ScrollDecorator scrollDecorator1 = new ScrollDecorator(borderDecorator2);

        scrollDecorator1.draw();
    }
}
