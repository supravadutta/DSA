class Main{
  public static void main(String[] args) {
    int n=3;
    int initial=5;
    int rate=3;
    int sum=0;
    for(int i=0;i<n;i++)
    {
      if(i==0)
      {
        sum=sum+initial;
      }
      else{
        initial=initial+rate;
        sum=sum+initial;
      }
    }
    System.out.println(sum);
  }
}