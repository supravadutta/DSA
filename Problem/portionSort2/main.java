import java.util.Arrays;
import java.util.Collections;

class Main{
  public static void main(String[] args) {
    int[] arr = new int[]{23,0,-5,1,10,58,-1,11,-7};
    int mid=arr.length/2;
    Arrays.sort(arr, 0, mid-1);
    Arrays.sort(arr, mid, arr.length-1,Collections.reverseOrder());
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
