import java.util.*;

class Main {
  public static void main(String[] args) {
    int pos, x;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of elements");
    int size = sc.nextInt();
    int[] arr = new int[size];
    System.out.println("enter elements of array");
    for (int i = 0; i < size; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("array elements..");
    for (int i = 0; i < size; i++) {
      System.out.println(arr[i]);
    }
    System.out.println("enter position");
    pos = sc.nextInt();
    System.out.println("enter element");
    x = sc.nextInt();
    for (int i = size-1; i > pos; i--) {
      arr[i] = arr[i - 1];
    }
    arr[pos] = x;
    System.out.println("after insertion..");
    for (int i = 0; i < size; i++) {
      System.out.println(arr[i]);
    }

  }
}