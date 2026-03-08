package designpatterns.abstractfactory;

public class WidgetPageWithAbstractFactory {

    private ScrollBar scrollBar;
    private WidgetButton widgetButton;
    private WidgetAbstractFactory widgetAbstractFactory;

    public WidgetPageWithAbstractFactory(WidgetAbstractFactory widgetAbstractFactory) {
        this.widgetAbstractFactory = widgetAbstractFactory;
        widgetButton = widgetAbstractFactory.createWidgetButton();
        scrollBar = widgetAbstractFactory.createScrollBar();
    }

    public void triggerWidgets() {
        scrollBar.scrollDown();
        scrollBar.scrollUp();
        widgetButton.click();
        System.out.println();
    }

    public void setWidgetAbstractFactory(WidgetAbstractFactory widgetAbstractFactory) {
        this.widgetAbstractFactory = widgetAbstractFactory;
        this.widgetButton = widgetAbstractFactory.createWidgetButton();
        this.scrollBar = widgetAbstractFactory.createScrollBar();
    }
}
