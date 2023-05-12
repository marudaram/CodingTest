package Algorithm;

public class tlqkf {
    public static void main(String[] args) {
        tlqkf(4);
    }

    static void tlqkf(int n) {
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
