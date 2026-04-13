package designpatterns.iterator.externaliterator;

public class NameListAggregator implements MyAggregate<String> {
    private String[] names = {"Alice", "Bob", "Charlie"};

    public NameListAggregator() {

    }

    @Override
    public MyIterator<String> createIterator() {
        return new NameListIterator(names);
    }
}
