package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class VonTest {

    public static void main(String[] args) {
        VonTest t = new VonTest();
        String [] arr = new String[] {"abc1hdj8894f9-45hj", "abc954hdj8894f9-45hj", "abc01234hdj894f9-45hj", "abc1234hdj8894f9-45hj", "abc1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz012345hdj8894f9-45hj", "x012345hdj8894f9-45hj"};
        //String [] arr = new String[] {"abc1hdj8894f9-45hj", "abc954hdj8894f9-45hj", "abcO1234hdj894f9-45hj", "abc1234hdj8894f9-45hj", "abc1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyzO12345hdj8894f9-45hj", "xO12345hdj8894f9-45hj"};
        //String [] arr = new String[] {"abc1hdj8894f9-45hj", "abc954hdj8894f9-45hj", "abcA1234hdj894f9-45hj", "abc1234hdj8894f9-45hj"};
        //String [] arr = new String[] {"abc1hdj8894f9-45hj", "abc1234hdj8894f9-45hj"};
        System.out.println(t.solution(arr));
    }

    public boolean solution(String[] A) {
        boolean result = true;
        String [] temp = new String[A.length];
        String [] sortedArray = new String[A.length];
        System.arraycopy(A, 0, temp, 0, A.length);
        List<String> list = Arrays.asList(temp);
        Collections.sort(list);
        list.toArray(sortedArray);
        for (int i = 0; i < A.length; i++) {
            System.out.println(sortedArray[i]);
        }

        for (int i = 0; i < A.length; i++) {
            //System.out.println(sortedArray[i]);
            if (A[i] != sortedArray[i]) {
                result = false;
                break;
            }

        }

        return result;
    }
}
