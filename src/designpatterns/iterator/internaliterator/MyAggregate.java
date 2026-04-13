package designpatterns.iterator.internaliterator;

import java.util.function.Consumer;

interface MyAggregate<T> {
    MyIterator<T> createIterator();
    void internalIterate(Consumer<T> consumer);
}
