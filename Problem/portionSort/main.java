import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] arr = new int[] { 12, 0, -12, 14, 11, 58, -10, -7, 5 };

    int mid = arr.length / 2;
    bubbleSort(arr, 0, mid-1);
    reverseSort(arr, mid, arr.length - 1);

    for (int p = 0; p < arr.length; p++) {
      System.out.print(arr[p] + " ");
    }

  }

  static void bubbleSort(int[] ar, int start, int end) {

    for (int j = start; j <= end; j++) {
      for (int k = start + 1; k <= end - j; k++) {
        if (ar[k - 1] > ar[k]) {
          int temp = ar[k - 1];
          ar[k - 1] = ar[k];
          ar[k] = temp;
        }
      }
    }
  }

  static void reverseSort(int[] ar, int start, int end) {
    int temp_end = end;

    for (int i = start; i <= end; i++) {
      for (int j = start + 1; j <= temp_end; j++) {
        if (ar[j - 1] < ar[j]) {
          int temp = ar[j - 1];
          ar[j - 1] = ar[j];
          ar[j] = temp;
        }
      }
      temp_end--;
    }
  }
}
