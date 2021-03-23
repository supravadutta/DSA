import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 1, 2, 1, 4, 2, 5 };
    distinctBit(arr);

  }

  static void distinctBit(int arr[]) {
    int el = 0;
    for (int i = 0; i < arr.length; i++) {
      el = el ^ arr[i];
    }
    int rsb = el & -el;
    int one = 0;
    int zero = 0;
    for (int x : arr) {
      if ((x & rsb) == 0) {
        zero = zero ^ x;
      } else {
        one = one ^ x;
      }
    }
    System.out.println(zero +" " + one);
  }
}
