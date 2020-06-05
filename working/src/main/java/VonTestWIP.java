package main.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class VonTestWIP {

    public static void main(String[] args) {
        //String [] arr = new String [] {"abc1hdj8894f9-45hj", "abc1234hdj8894f9-45hj"};
        String [] arr = new String[] {"abc1hdj8894f9-45hj", "abc954hdj8894f9-45hj", "abc01234hdj894f9-45hj", "abc1234hdj8894f9-45hj", "abc1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz1234hdj8894f9-45hj", "xyz012345hdj8894f9-45hj", "x012345hdj8894f9-45hj"};
        List list = Arrays.asList(arr);
        //String [] arr = new String [] {"a", "1"};
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int len1 = o1.length();
                int len2 = o2.length();
                int lim = Math.min(len1, len2);
                char v1[] = o1.toCharArray();
                char v2[] = o2.toCharArray();
                int k = 0;
                while (k < lim) {
                    char c1 = v1[k];
                    char c2 = v2[k];
                    if (c1 != c2) {
                        return c1 - c2;
                    }
                    k++;
                }
                return len1 - len2;

            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


}

