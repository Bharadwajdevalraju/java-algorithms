package org.bd.blind50.set3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopKFrequentElements {

    public static List<Integer> solve(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        PriorityQueue<Map.Entry<Integer, Long>> pq = new PriorityQueue<>((e1, e2) ->
                (int) (e2.getValue() - e1.getValue()));
        Map<Integer, Long> freqMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        pq.addAll(freqMap.entrySet());
        while (k > 0) {
            list.add(Objects.requireNonNull(pq.poll()).getKey());
            k--;
        }
        return list;
    }
}
