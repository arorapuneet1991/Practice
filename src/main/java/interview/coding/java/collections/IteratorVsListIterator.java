package interview.coding.java.collections;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorVsListIterator {
    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 2, 3, 4);

        System.out.println(myList);
        Iterator<Integer> iter = myList.iterator();
        ListIterator<Integer> listIterator = myList.listIterator();

        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }

        while (listIterator.hasNext())
            System.out.println(listIterator.next() + " ");


        while (listIterator.hasPrevious())
            System.out.println(listIterator.previous() + " ");

    }
}