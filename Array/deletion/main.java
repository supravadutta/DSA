import java.util.*;
class Main{
  public static void main(String[] args) {
        int pos;
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
          System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("enter position");
        pos = sc.nextInt();
        for(int i=pos;i<size-1;i++)
        {
          arr[i]=arr[i+1];

        }
        System.out.println("after deletion");
        for(int i =0;i<size-1;i++){
          System.out.print(arr[i]+",");
        }
  }
}
