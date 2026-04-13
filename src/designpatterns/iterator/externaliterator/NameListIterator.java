package designpatterns.iterator.externaliterator;

import javax.naming.Name;
import java.util.Arrays;
import java.util.Iterator;

public class NameListIterator implements MyIterator<String> {
    //TO Lazy to implement an iterator :")
    Iterator<String> iterator;

    public NameListIterator(String[] names) {
        this.iterator = Arrays.stream(names).iterator();
    }


    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public String next() {
        return iterator.next();
    }
}
