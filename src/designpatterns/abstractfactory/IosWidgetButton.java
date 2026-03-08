package designpatterns.abstractfactory;

public class IosWidgetButton implements WidgetButton {
    @Override
    public void click() {
        System.out.println("IOS Widget click");
    }
}
