package designpatterns.abstractfactory;

public class AndroidWidgetFactory implements WidgetAbstractFactory {
    @Override
    public WidgetButton createWidgetButton() {
        return new AndroidWidgetButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new AndroidWidgetScrollBar();
    }
}
