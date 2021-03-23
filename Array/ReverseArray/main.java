import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    int first = 0;
    int last = arr.length - 1;
    while (first < last) {
      int temp = arr[first];
      arr[first] = arr[last];
      arr[last] = temp;
      first++;
      last--;

    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}
