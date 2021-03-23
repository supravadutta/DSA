class Main{
  public static void main(String[] args) {
    int digit=471863;
    int oddmulti=1;
    int evensum=0;
    while(digit!=0)
    {
      int rem=(digit%10);
      
        if(rem%2==0)
        {
          evensum=evensum+rem;
        }
        else{
          oddmulti=oddmulti*rem;
        }
        digit=(digit/10);
    
    }
    int diff=Math.abs(oddmulti-evensum);
    System.out.println(diff);
  }
}
