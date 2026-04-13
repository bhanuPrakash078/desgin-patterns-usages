package designpatterns.iterator.externaliterator;

interface MyAggregate<T> {
    MyIterator<T> createIterator();
}
