package designpatterns.iterator.internaliterator;

public class InternalIteratorRunner {
    public static void main(String[] args) {
        MyAggregate<String> list = new NameListAggregator();
        MyAggregate<String> tree = new ParseTree(); // Imagine this is populated

        System.out.println("Printing List:");
        list.internalIterate(System.out::println);

        System.out.println("Printing Tree:");
        tree.internalIterate(System.out::println);
    }

}
