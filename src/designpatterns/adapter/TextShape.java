package designpatterns.adapter;

//We want the TextShape to implement the Shape, but we have to use the capabilities of text view
//Here is where adapter pattern works
public class TextShape implements Shape {

    private final TextView textView;

    public TextShape(TextView textView) {
        this.textView = textView;
    }

    @Override
    public void boundingBox() {
        this.textView.getExtent();
        System.out.println("Bounding Box has been created for Text shape");
    }

    @Override
    public void createManipulator() {
        System.out.println("Creating a Manipulator for the Text");
    }
}
