package designpatterns.abstractfactory;

public class WidgetPage {

    private ScrollBar scrollBar;
    private WidgetButton widgetButton;


    public WidgetPage() {

        //Coupled to concrete classes
        this.scrollBar = new AndroidWidgetScrollBar();
        this.widgetButton = new AndroidWidgetButton();
    }

    public void triggerWidgets() {
        this.scrollBar.scrollDown();
        this.scrollBar.scrollUp();
        this.widgetButton.click();
        System.out.println();
    }


}
