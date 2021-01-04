import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int start_range = sc.nextInt();
    int end_range = sc.nextInt();
    int sum = 0;
    for (int i = start_range; i <= end_range; i++) {
      if (primeCheck(i)) {
        sum = sum + i;
        System.out.println(i);

      }

    }
    System.out.println(sum);

  }

  static boolean primeCheck(int number) {
    number=Math.abs(number);
    if (number == 0 || number == 1) {
      return false;
    } else {
      for (int j = 2; j <= number / 2; j++) {
        if (number % j == 0) {
          return false;
        }

      }
      return true;
    }
  }
}