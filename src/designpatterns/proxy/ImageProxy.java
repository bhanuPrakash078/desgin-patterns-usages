package designpatterns.proxy;

//This is the proxy for that Image
public class ImageProxy implements Graphic {

    Graphic image;
    String fileName;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    //This is the lazy loading, image is initiated only when its required.
    public void draw() {
        System.out.println("Accessing draw via proxy");
        if (image == null) {
            //Loading image now.
            System.out.println("Loading image now");
            image = new Image(fileName);
            image.draw();
        } else {
            image.draw();
        }

    }
}
