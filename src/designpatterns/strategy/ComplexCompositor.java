package designpatterns.strategy;

public class ComplexCompositor extends Compositor {

    @Override
    public void repair() {
        System.out.println("Complex repairing behavior");
    }

    @Override
    public void traverse() {
        System.out.println("Complex traversing behavior");
    }
}
