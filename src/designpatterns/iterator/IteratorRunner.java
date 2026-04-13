package designpatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorRunner {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        Iterator<Integer> iterator = list.iterator();
        int count = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            if (count < 10)
                list.add(iterator.next());
            count++;
        }
    }
}
