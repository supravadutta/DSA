import java.util.*;

class Main {
  public static void main(String[] args) {
    int mid, first, last;
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
    System.out.println("enter the search value");
    int number = sc.nextInt();
    first = 0;
    last = size - 1;
    mid = first + (last - first) / 2;
    while (first <= last) {
      mid = first + (last - first) / 2;
      if (arr[mid] == number) {
        System.out.println("found at location.." + mid);
        break;
      } else if (arr[mid] < number)

      {
        first = mid + 1;

      } else{
        last = mid - 1;
      }

    }
    if (first > last) {
      System.out.println("not found");
    }
  }
}
