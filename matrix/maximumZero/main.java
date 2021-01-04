import java.util.*;

class Main {
  public static void main(String[] args) {
    int[][] arr = { { 1, 1, 1, 1 }, { 0, 0, 0, 0 }, { 1, 0, 0, 0 }, { 1, 1, 1, 0 } };
    int rownum = -1;
    int max = -1;
    for (int i = 0; i < arr.length; i++) {
      int count = 0;
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j] == 0) {
          count++;
        }

      }
      if (count > max) {
        max = count;
        rownum = i;
      }

    }
    System.out.println(rownum);
  }
}
