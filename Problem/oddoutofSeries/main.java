import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();

    }
    ArrayList<Integer> list = new ArrayList<>();
    int index = -1;
    int zero = 0;
    int one = 0;
    for (int j = 0; j < arr.length; j++) {
      int temp = arr[j] & 1;
      list.add(temp);
      if (temp == 0) {
        zero++;
      } else {
        one++;
      }
    }
    if (zero < one) {
      index = list.indexOf(0) + 1;
    } else if (one < zero) {
      index = list.indexOf(1) + 1;
    }
    System.out.println(index);

  }
}
