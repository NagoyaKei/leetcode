package com.nkei.n2001_3000;

import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class N2418_SortThePeople {
    /**
        n == names.length == heights.length
        1 <= n <= 103
        1 <= names[i].length <= 20
        1 <= heights[i] <= 10^5
        names[i] consists of lower and upper case English letters.
        All the values of heights are distinct.
    */
    public String[] sortPeople(String[] names, int[] heights) {
        AtomicInteger counter = new AtomicInteger(names.length);
        String[] result = new String[counter.get()];
        IntStream.range(0, counter.get()).boxed()
                .collect(Collectors.toMap(i -> heights[i], Function.identity(), (k, v) -> v, TreeMap::new))
                .forEach((k, v) -> result[counter.decrementAndGet()] = names[v]);

        return result;
    }
}
