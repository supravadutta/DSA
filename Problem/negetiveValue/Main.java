import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    int count = 0;
    for (int i = 0; i < ar.length; i++) {
      ar[i] = sc.nextInt();
    }
    for (int j = 0; j < ar.length; j++) {
      if (ar[j] < 0) {
        count++;

      }
    }
    System.out.println(count);
  }
}
