
public class Patten30 {
    public static void main(String[] args) {
        karan("gaurav");
        karan("karan");
        karan("aman");
        karan("arjun");

    }
    static void pattern10( int n) {




        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <=i ; j++) {

                System.out.print(" ");
            }
                for (int j =n; j <=0; j--) {
                    System.out.print("*");
                }


            System.out.println();
        }
    }
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
        static void pattern5 ( int n){
            for (int i = 1; i <= n * 2; i++) {
                int TotalColInRow = i > n ? 2 * n - i : i;
                for (int j = 1; j <= TotalColInRow; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
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

        static void pattern3 ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();

            }

        }
        static void pattern2 ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
        static void pattern ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");

                }
                System.out.println();
            }
        }
        static void pattern1 ( int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
        }

        static void karan(String aname){
            System.out.println(aname+"how are you man");

    }



}


