package org.bd.blind50.set1;

import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) {
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    // TC: 0(n);
    // SC: 0(n);
}
