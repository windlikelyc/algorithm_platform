package utils;

import java.util.Arrays;

public class ArraysUtil{

    /**
     * 判断两个数组是否相等
     * @param a
     * @param b
     * @return
     */
    public static boolean equals(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
