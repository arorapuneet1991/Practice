package interview.coding.java.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(6, 1, 2);

        // sort
        Stream<Integer> stream = myList.stream();
        Stream<Integer> sortedStream = stream.sorted();
        sortedStream.forEach(n -> System.out.println(n));

        // map
        Stream<Integer> stream1 = myList.stream();
        Stream<Integer> doublestream = stream1.map(n -> n * 2);
        doublestream.forEach(n -> System.out.println(n));

        // filter
        Stream<Integer> filtered = myList.stream();
        Stream<Integer> filterdStream = filtered.filter(n -> n % 2 == 0);
        filterdStream.forEach(n -> System.out.println(n));

        // reduce
        Stream<Integer> red = myList.stream();
        int d = red.reduce(0, (n, m) -> n + m);
        System.out.println(d);

        // collect

        // foreach

    }
}
