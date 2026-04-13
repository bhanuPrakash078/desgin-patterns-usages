package designpatterns.iterator.internaliterator;

import java.util.function.Consumer;

public class NameListAggregator implements MyAggregate<String> {
    private String[] names = {"Alice", "Bob", "Charlie"};

    @Override
    public void internalIterate(Consumer<String> consumer) {
        MyIterator<String> it = createIterator();
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    @Override
    public MyIterator<String> createIterator() {
        return new NameListIterator();
    }

    // Inner class: The concrete polymorphic iterator
    private class NameListIterator implements MyIterator<String> {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            return names[index++];
        }
    }
}
