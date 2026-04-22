package designpatterns.strategy;

public class StrategyRunner {

    public static void main(String[] args) {
        Composition composition = new Composition();
        //Default behavior
        composition.repair();
        composition.traverse();
        //updating behavior by setting compositor object
        composition.setCompositor(new SimpleCompositor());
        composition.repair();
        composition.traverse();

        //Updating behavior again
        composition.setCompositor(new ComplexCompositor());
        composition.repair();
        composition.traverse();
    }
}
