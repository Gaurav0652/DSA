
public class Patten30 {
    public static void main(String[] args) {
        int n=5;
        pattern10(n);

    }

    //pattern10
    static void pattern10( int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i ; j++) {

                System.out.print(" ");
            }
                for (int j =0; j <n-i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }

    //pattern9
    static void pattern9 ( int n) {
        int orignaln=n;
        n = 2 * n;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                int num=orignaln-Math.min(Math.min(i,j),Math.min(n-i,n-j));
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }

    //pattern8
    static void pattern8(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int c= i > n ? 2 * n - i : i;
            for (int space = 0; space < n - c; space++) {
                System.out.print("  ");
            }
            for (int j = c; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= c; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //pattern7
        static void pattern7 ( int n){
            for (int i = 1; i <= 5; i++) {
                for (int space = 0; space < n - i; space++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        //pattern6
        static void pattern6 ( int n){
            for (int i = 1; i <= n * 2; i++) {
                int TotalColInRow = i > n ? 2 * n - i : i;
                int Space = n - TotalColInRow;
                for (int s = 0; s < Space; s++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= TotalColInRow; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        //pattern5
        static void pattern5 ( int n){
            for (int i = 1; i <= n * 2; i++) {
                int TotalColInRow = i > n ? 2 * n - i : i;
                for (int j = 1; j <= TotalColInRow; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //pattern4
        static void pattern4 ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //pattern3
        static void pattern3 ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

        //pattern2
        static void pattern2 ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //pattern1
        static void pattern ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        //pattern0
        static void pattern1 ( int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}


