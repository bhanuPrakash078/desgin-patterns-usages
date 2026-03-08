package designpatterns.abstractfactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {

        //Client is hardcoded to android widget.
        WidgetPage widgetPage = new WidgetPage();
        widgetPage.triggerWidgets();

        //By use of abstract factory method, we have to initiate in client here itself, only once.
        //And we are passing the parameter the concrete factory method which says which group of products you want to create
        WidgetAbstractFactory widgetAbstractFactory = new IosWidgetFactory();
        WidgetPageWithAbstractFactory widgetPageWithAbstractFactory = new WidgetPageWithAbstractFactory(widgetAbstractFactory);
        widgetPageWithAbstractFactory.triggerWidgets();

        //In run time we can change the behavior of entire object, by changing the factory which gonna give
        //entire different set of objects.
        widgetPageWithAbstractFactory.setWidgetAbstractFactory(new AndroidWidgetFactory());
        widgetPageWithAbstractFactory.triggerWidgets();

    }
}
