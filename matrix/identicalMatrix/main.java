import java.util.*;

class Main {
  public static void main(String[] args) {

    int[][] ar = { { 1, 2, 3,1 }, { 2, 5, 6, 8 }, { 6, 1, 2, 5 } };
    int[][] arr = { { 1, 2, 3, 4 }, { 2, 5, 6, 8 }, { 6, 1, 2, 5 } };
    for (int i = 0; i < ar.length; i++) {
      for (int j = 0; j < ar[0].length; j++) {
        if (ar[i][j] != arr[i][j]) {
          System.out.println("This is not identical");
          return;
        }

      }
    }
    System.out.println("This is identical");
  }
}
