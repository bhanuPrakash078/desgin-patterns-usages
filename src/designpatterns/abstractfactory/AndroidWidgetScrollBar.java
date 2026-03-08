package designpatterns.abstractfactory;

public class AndroidWidgetScrollBar implements ScrollBar {
    @Override
    public void scrollDown() {
        System.out.println("Android Widget scroll down");
    }

    @Override
    public void scrollUp() {
        System.out.println("Android Widget scroll up");
    }
}
