package org.bd.blind50.set1;

import java.util.LinkedList;
import java.util.Map;

public class ValidParanthesis {

    public static boolean solve(final String input) {
        var map = Map.of('}','{',')','(',']','[');
        LinkedList<Character> stack = new LinkedList<>();
        for(var c: input.toCharArray()) {
            if (map.containsKey(c)) {
               if (!stack.isEmpty() && stack.peek() == map.get(c)) {
                   stack.pop();
               } else {
                   return false;
               }
            }else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
