package designpatterns.adapter;

public class AdapterRunner {

    public static void main(String[] args) {
        Shape lineShape = new LineShape();
        lineShape.boundingBox();

        //We pass the adaptee. So we rewrote the methods of TextShape using the adaptee method.
        //an adaptee methods are called by delegation
        Shape textShape = new TextShape(new TextView());
        textShape.boundingBox();
    }
}
