package Algorithm;

import java.util.Random;

public class RandomPeople {

    public static void main(String[] args) {
        Random random = new Random();

        int people = random.nextInt(15);
        int[] height = new int[people];

        for(int i = 0; i < people; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println("키: " + height[i]);
        }
            System.out.println("사람 수: " + people);


    }

    static int maxOf(int[] a) {
        int max = a[0];

        for(int i = 0; i < a.length; i++) {
            if(a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

}
