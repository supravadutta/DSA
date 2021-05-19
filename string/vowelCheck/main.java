class Main {
    public static void main(String[] args) {
        String str = "cabuxio";
        for (int i = 0; i < str.length(); i++) {
            if (count(str.substring(0, i)) == count(str.substring(i + 1, str.length()))) {
                System.out.println(str.charAt(i));
                break;
            }
        }

    }

    static int count(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
