package Algorithm2;

import java.util.Scanner;

public class pr1 {

    static int searchldx(int[] a, int n, int key, int[] idx) {
        int answer = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == key) {
                idx[answer++] = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("요솟수: ");
        int num = scanner.nextInt();

        int[] originalArr = new int[num];
        int[] afterArr = new int[num];

        for(int i = 0; i < num; i++) {
            System.out.print("[x" + i + "] : ");
            originalArr[i] = scanner.nextInt();
        }

        System.out.print("검색 값: ");
        int key = scanner.nextInt();

        int answer = searchldx(originalArr, num, key, afterArr);

        if(answer == 0) {
            System.out.println("해당 값은 존재하지 않습니다-!");
        } else {
            for(int i = 0; i < answer; i++) {
                System.out.println("해당 값은 " + afterArr[i] + "번째에 있습니다-!");
            }
        }



    }

}
