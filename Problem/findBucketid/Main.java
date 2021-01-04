import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int filenum = sc.nextInt();
    int[] ar = new int[filenum];

    for (int i = 0; i < ar.length; i++) {
      ar[i] = sc.nextInt();
    }
    for (int j = 0; j < ar.length; j++) {

      int temp = digitSum(ar[j]);
      System.out.println(temp);
    }
  }

  static int digitSum(int n) {
    int sum = 0;

    while (n != 0) {
      int rem = (n % 10);
      sum = sum + rem;
      n = n / 10;
    }
    return sum;
  }
}
