class Main {
    public static void main(String[] args) {
        String str = "aabbbaaaaacccccc";
        int result=count_max(str);
        System.out.println(result);

    }

    static int count_max(String str) {
        int max = 0;
        int first = 0;
        int last = 0;
        int count = 0;
        while (first < str.length() && last < str.length())

        {
            if (str.charAt(first) == str.charAt(last)) {
                count++;
                last++;
            }
            
             else {
                if (max < count) {
                    max = count;
                }
                count = 0;
                first = last;
            }
        }
        if(max<count)
        {
            max=count;
        }
        return max;
    }
}
