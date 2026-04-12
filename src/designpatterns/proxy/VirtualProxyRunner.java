package designpatterns.proxy;

public class VirtualProxyRunner {
    public static void main(String[] args) {
        Graphic imageProxy = new ImageProxy("MyImage.jpg");
        imageProxy.draw();
        System.out.println("Accessing Proxy again, this time image loading wont occur");
        imageProxy.draw();
    }
}
