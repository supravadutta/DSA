import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
    int repeat = sc.nextInt();
    int[] arr = new int[number];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    for (int j = 0; j < repeat; j++) {
      int temp = arr[0];
      for (int k = 1; k < arr.length; k++) {
        arr[k - 1] = arr[k];
      }
      arr[arr.length - 1] = temp;
    }
    for(int el:arr){
      System.out.print(el+ " ");
    }

  }
}
