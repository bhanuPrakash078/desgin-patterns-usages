package designpatterns.proxy;

//This is the real subject.
public class Image implements Graphic {

    public Image(String fileName) {
        System.out.println("Creating image at file " + fileName);
    }

    @Override
    public void draw() {
        System.out.println("Drawing image at file");
    }
}
