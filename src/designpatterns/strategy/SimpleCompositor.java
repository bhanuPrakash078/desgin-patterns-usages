package designpatterns.strategy;

public class SimpleCompositor extends Compositor{

    @Override
    public void repair() {
        System.out.println("Simple repairing behavior");
    }

    @Override
    public void traverse() {
        System.out.println("Simple traversing behavior");
    }
}
