import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float price = sc.nextFloat();
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for (int k = 0; k < arr.length; k++) {
      if (checkPrime(arr[k])) {
        sum = sum + arr[k];

      }

    }
    float discount = Float.valueOf(sum);
    float result = price * ((100 - discount) / 100);
    System.out.println(result);

  }

  static boolean checkPrime(int number) {
    if (number == 0 || number == 1) {
      return false;
    } else {
      for (int j = 2; j <= (number / 2); j++) {
        if (number % j == 0) {
          return false;
        }
      }
      return true;
    }
  }
}
