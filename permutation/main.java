class Main {
    public static void main(String[] args) {
        String str = "ABCD";
        permute(str, 0, str.length() - 1);
        System.out.println(count);
    }

    static void permute(String str, int l, int r) {

        if (l == r) {
            System.out.println(str);
            count++;
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                // for backtracking to reset it in previous state
                str = swap(str, l, i);

            }
        }
    }

    static String swap(String str, int l, int r) {
        char[] arr = str.toCharArray();
        char temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        return String.valueOf(arr);

    }

    static int count = 0;
}