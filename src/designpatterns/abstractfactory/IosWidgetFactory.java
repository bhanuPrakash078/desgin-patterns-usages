package designpatterns.abstractfactory;

public class IosWidgetFactory implements WidgetAbstractFactory {
    @Override
    public WidgetButton createWidgetButton() {
        return new IosWidgetButton();
    }

    @Override
    public ScrollBar createScrollBar() {
        return new IosWidgetScrollBar();
    }
}
