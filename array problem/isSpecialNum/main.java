import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String str = String.valueOf(number);
        char[] arr = str.toCharArray();
        int n = arr.length - 1;
        int sum_1 = 0;
        int sum_2 = 0;
        for (int i = 0; i <= n / 2; i++) {
            sum_1 = sum_1 + (arr[i] - '0');
        }
        for (int j = n / 2 + 1; j <= n; j++) {
            sum_2 = sum_2 + (arr[j] - '0');
        }
        if (sum_1 == sum_2) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}