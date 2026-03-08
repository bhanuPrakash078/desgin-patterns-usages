package designpatterns.abstractfactory;

public class IosWidgetScrollBar implements ScrollBar{
    @Override
    public void scrollDown() {
        System.out.println("IOS Widget scroll down");
    }

    @Override
    public void scrollUp() {
        System.out.println("IOS Widget scroll up");
    }
}
