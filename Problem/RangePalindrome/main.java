import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit = sc.nextInt();
        int num = sc.nextInt();
        int last = 0;
        for (int i = 0; i < num; i++) {
            last = last * 10 + 9;
        }
        for (int j = digit; j <= last; j++) {
            if (IsPalindrome(j)) {
                System.out.println(j + " ");
            }
        }
    }

    static boolean IsPalindrome(int digit) {
        int temp = digit;
        int rev = 0;
        while (digit != 0) {
            int rem = (digit % 10);
            rev = rev * 10 + rem;
            digit = digit / 10;
        }
        if (temp == rev) {
            return true;
        }
        return false;
    }
}
