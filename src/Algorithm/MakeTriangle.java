package Algorithm;

public class MakeTriangle {
    public static void main(String[] args) {
        triangleLB(4);
        System.out.println();
        triangleLU(4);
        System.out.println();
        triangleRU(4);
        System.out.println();
        triangleRB(4);
    }
//    static void triangleLB(int n) // 왼쪽 아래가 직각인 이등변 삼각형을 출력
//
//    static void triangleLU(int n) // 왼쪽 위가 직각인 이등변 삼각형을 출력
//    static void triangleRU(int n) // 오른쪽 위가 직각인 이등변 삼각형을 출력
//    static void triangleRB(int n) // 오른쪽 아래가 직각인 이등변 삼각형을 출력

    static void triangleLB(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static void triangleLU(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }


    static void triangleRB(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }


}
