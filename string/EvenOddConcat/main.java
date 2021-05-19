import java.util.*;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        String str=GetString(arr);
        System.out.println(str);

    }
    static String GetString(int arr[])
    {
        String result="";
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                result=result+"e"+String.valueOf(arr[i]);
                if(i!=arr.length-1)
                {
                    result=result+",";
                }
            }
            else{
                result=result+"o"+String.valueOf(arr[i]);
                if(i!=arr.length-1)
                {
                    result=result+",";
                }
            }
            
        }
        return result;
        
    }
}
