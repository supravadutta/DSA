import java.util.*;
class Main{
  public static void main(String[] args) {
    int arr[]={15,11,102,90,9};
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ ",");
    }
    Arrays.sort(arr);
    System.out.println();
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+ ",");
    }
    for(int el:arr)
    {
      System.out.println(el);
    }
  }
}
