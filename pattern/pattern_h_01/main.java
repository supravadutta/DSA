import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {

                for (int j = 1; j <= i; j++) {
                    c++;

                    if (j < i) {
                        System.out.print(c + "$");
                    } else {
                        System.out.print(c);
                    }

                }
            } else if (i % 2 == 0) {
                c = c + i;
                for (int j = 1; j <= i; j++) {
                    if (j < i) {
                        System.out.print(c + "$");
                    } else {
                        System.out.print(c);
                    }
                    c--;

                }
                c = c + i;

            }
            System.out.println();

        }

    }
}
