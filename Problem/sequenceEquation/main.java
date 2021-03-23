import java.util.ArrayList;

class Main{
  public static void main(String[] args) {
    int n=5;
    int[]arr={3,5,1,4,2};
    ArrayList<Integer>list=new ArrayList<>();
    for(int el:arr)
    {
      list.add(el);
    }
    for(int i=1;i<=n;i++)
    {
      int temp_idx=list.indexOf(i)+1;
      System.out.print(list.indexOf(temp_idx)+1);
    }
  }
}
