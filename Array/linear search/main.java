import java.util.*;

class Main {
  public static void main(String[] args) {
    int x;
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
    System.out.println("enter the element to be searched");
    x = sc.nextInt();
    int flag=0;
    for (int i = 0; i < size; i++) {
      if (arr[i] == x) {
        flag=1;
        break;
      }
    }
    if(flag==1)
    {
      System.out.println("element is found");
    }
    else{
      System.out.println("not found");
    }

  }
}
