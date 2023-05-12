package Algorithm;

import java.util.Arrays;

public class CopyArr {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        copy(arr1, arr2);

    }

    static void copy(int[] a, int[] b) {
        for(int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
        System.out.println("복사 후: " + Arrays.toString(a));
    }

    static void rcopy(int[] a, int[] b) {

    }

}
