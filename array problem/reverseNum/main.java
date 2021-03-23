class Main{
  public static void main(String[] args) {
    int num=512;
    int n=0;
    while(num!=0)
    {
      int rem=(num%10);
      n=n*10+rem;
      num=num/10;
    }
    System.out.println(n);
  }
}
