class Main{
    public static void main(String[] args) {
        int a=4;
        System.err.println(facto(a));
        
    }

    static int facto(int a)
    {
        if(a==0)
        {
            return 1;
        }
        else{
            return (a*facto(a-1));        
    }
}
}

