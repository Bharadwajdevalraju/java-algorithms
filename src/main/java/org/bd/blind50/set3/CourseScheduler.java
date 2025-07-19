package org.bd.blind50.set3;

import java.util.*;

public class CourseScheduler {

    public boolean solve(int numCourses, int[][] pre) {
        int[] indegree = new int[numCourses];
        var map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<>());
        }

        for (int[] ints : pre) {
            var c = ints[0];
            var p = ints[1];
            map.get(p).add(c);
            indegree[c]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        List<Integer> completed = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
                completed.add(i);
            }
        }

        while (!queue.isEmpty()) {
            var curr = queue.poll();
            for (var ch : map.get(curr)) {
                indegree[ch]--;
                if (indegree[ch] == 0) {
                    queue.add(ch);
                    completed.add(ch);
                }
            }
        }

        return numCourses == completed.size();

    }
}
