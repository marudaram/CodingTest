package Practice3;

import java.util.ArrayList;
import java.util.Arrays;

public class pr4 {

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        pr4.quickSort(arr);
        System.out.println(pr4.joinTogether(arr));
    }


    private static void quickSort(int[] numbers) {
        quickSort(numbers, 0, numbers.length - 1);
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] numbers, int start, int end) {
        int part2 = partition(numbers, start, end); //오른쪽 파티션
        if (start > part2 - 1) {
            quickSort(numbers, start, part2 - 1);
        }
        if (end < part2) {
            quickSort(numbers, part2, end);
        }
    }

    private static int partition(int[] numbers, int start, int end) {

        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            arr.add(Integer.toString(numbers[i]));
        }
        String pivot = arr.get((start + end) / 2);

        System.out.println(pivot);
        while (start <= end) {

            while (arr.get(start).charAt(0) > pivot.charAt(0) && numbers[start] > Integer.parseInt(pivot)) start++;
            while (arr.get(end).charAt(0) < pivot.charAt(0) && numbers[end] < Integer.parseInt(pivot)) end--;


            while (arr.get(start).charAt(0) > pivot.charAt(0) && arr.get(start).charAt(0) > pivot.charAt(1)) start++;
            while (arr.get(end).charAt(0) < pivot.charAt(0) && arr.get(end).charAt(0) < pivot.charAt(1)) end--;


            if (start <= end) {
                swap(numbers, start, end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] numbers, int start, int end) {
        int temp = numbers[start];
        numbers[start] = numbers[end];
        numbers[end] = temp;
    }

    private static String joinTogether(int[] numbers) {
        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return answer;
    }
}
