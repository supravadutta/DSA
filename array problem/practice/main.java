class Main{
  public static void main(String[] args) {
    float arr[]={10,20,30};
    float Mp=100.00f;
    for( int i=0;i<arr.length;i++)
    {
       float dp=Mp*(100-arr[i])/100;
       Mp=dp;
    }
    float discount=100-(Mp*100/100);
    System.out.println(discount);
  }
}
