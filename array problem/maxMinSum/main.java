import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=sc.nextInt();
    }
     int result=sum(arr);
    System.out.println(result);
    
  }

  static int sum(int arr[]) {
    Arrays.sort(arr);

    int result = arr[0] + arr[arr.length - 1];
    return result;

  }
}
