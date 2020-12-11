import java.util.*;
class Main{

  public static void main(String[] args) {
    int arr[]={396285104, 573261094 ,759641832, 819230764, 364801279};
    miniMaxSum(arr);
    
  }
  static void miniMaxSum(int[] arr) {
    int minimum=0;
    long maximum=0;
    Arrays.sort(arr);
    for(int i=0;i<arr.length-1;i++)
    {
        minimum=minimum+arr[i];
    }
    for(int i=1;i<arr.length;i++)
    {
        maximum=maximum+arr[i];
    }
    System.out.println(minimum + " "+ maximum);


}
}