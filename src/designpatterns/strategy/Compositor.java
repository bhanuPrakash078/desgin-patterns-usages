package designpatterns.strategy;

public class Compositor {

    public void traverse() {
        System.out.println("default traversing behavior");
    }

    public void repair() {
        System.out.println("default repairing behavior");
    }
}
