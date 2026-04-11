package designpatterns.adapter;

public class LineShape implements Shape {
    @Override
    public void boundingBox() {
        System.out.println("Creating a Line");
    }

    @Override
    public void createManipulator() {
        System.out.println("Creating a Manipulator for the line");
    }
}
