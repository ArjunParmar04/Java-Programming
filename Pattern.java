public class Pattern {
    public static void main(String[] args) {
//        pattern1();
//        pattern2();
        pattern3();
    }

    static void pattern1() {
        int n = 4;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern2() {
        int n = 5;
        int m = 8;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void pattern3() {
        int n = 4;
        int m = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(m + " ");
                m++;
            }
            System.out.println();
        }
    }
}


