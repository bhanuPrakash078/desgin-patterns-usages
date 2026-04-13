package designpatterns.iterator.internaliterator;

interface MyIterator<T> {
    boolean hasNext();
    T next();
}
