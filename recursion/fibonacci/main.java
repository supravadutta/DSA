class Main{
    public static void main(String[] args) {
        int n=3;
        System.out.println(fibo(n));
        
    }

static int fibo(int n)
{
    if(n<=1)
    {
        return n;
    }
    else{
        return fibo(n-1)+fibo(n-2);
    }
}
}
