package designpatterns.abstractfactory;

public class AndroidWidgetButton implements WidgetButton {
    @Override
    public void click() {
        System.out.println("Android Widget click");
    }
}
