package Distinct;

// note: remember to import (for using "Arrays.sort(xxx[])")

import java.util.*;

// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {

        // special case
        if (A == null || A.length == 0)
            return 0;

        // init unique set
        HashSet<Integer> set = new HashSet<>();

        // add all elements to unique set
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        // return the size of uniqe set
        return set.size();

    }


}
