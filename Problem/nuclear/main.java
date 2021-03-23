class Main{
  public static void main(String[] args) {
    int n=3;
    int initial=5;
    int rate=3;
    int time=3;
    int[]arr=new int[n];
    for(int i=0;i<n;i++)
    {
      if(i==0)
      {
        System.out.println(initial);
        arr[i]=initial;

      }
      else{
        initial=initial*rate;
        System.out.println(initial);
        arr[i]=initial;
      }
      

    }
    

  }
}
