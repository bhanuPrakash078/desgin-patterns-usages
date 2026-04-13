package designpatterns.iterator.externaliterator;

interface MyIterator<T> {
    boolean hasNext();
    T next();
}
