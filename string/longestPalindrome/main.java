class Main{
    public static void main(String[] args) {
        String str="aabcbab";
        System.out.println(max_length(str));
        
    }
   static boolean isPalindrome(String str)
    {
        int first=0;
        int last=str.length()-1;
        while(first<=last)
        {
            if(str.charAt(first)!=str.charAt(last))
            {
                return false;
            }
            first++;
            last--;

        }
        return true;
    }
    static String max_length(String str)
    {
        String max="";
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                String temp=str.substring(i,j+1);
                if(isPalindrome(temp))
                {
                    if(temp.length()>max.length())
                    {
                        max=temp;
                    }
                }
            }
        }
        return max;
    }
}
