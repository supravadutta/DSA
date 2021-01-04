import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int[] ar = new int[m];
    int[] arr = new int[n];
    for (int i = 0; i < m; i++) {
      ar[i] = sc.nextInt();

    }
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    Arrays.sort(ar);
    Arrays.sort(arr);
    int max1 = ar[m - 1];
    int max2 = arr[n - 1];
    if (max1 > max2) {
      System.out.println(max1);
    } else {
      System.out.println(max2);
    }
  }
}
