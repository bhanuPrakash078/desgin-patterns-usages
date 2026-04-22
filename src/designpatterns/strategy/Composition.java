package designpatterns.strategy;

public class Composition {

    Compositor compositor;

    public Composition(Compositor compositor) {
        this.compositor = compositor;
    }

    public Composition() {
        this.compositor = new Compositor();
    }

    public void traverse() {
        this.compositor.traverse();
    }

    public void repair() {
        this.compositor.repair();
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }
}
