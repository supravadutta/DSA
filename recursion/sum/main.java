class Main{
    public static void main(String[] args) {
        int result=sum(5);
        System.out.println(result);
    }

public static int sum(int a)
{
    if(a==0)
    {
        return 0;
    }
    else{
        return a+sum(a-1);
    }
}
}