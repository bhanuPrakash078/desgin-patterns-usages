package designpatterns.iterator.externaliterator;


public class ExternalIteratorRunner {
    public static void main(String[] args) {
        MyAggregate<String> list = new NameListAggregator();
        MyAggregate<String> tree = new ParseTreeAggregate(); // Imagine this is populated

        System.out.println("Printing List:");
        MyIterator<String> listIterator = list.createIterator();
        iterateIterator(listIterator);

        System.out.println("Printing Tree:");
        MyIterator<String> treeIterator = tree.createIterator();
        iterateIterator(treeIterator);
    }

    public static void iterateIterator(MyIterator<String> iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
