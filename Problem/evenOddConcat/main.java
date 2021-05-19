class Main {
    public static void main(String[] args) {
        String result = "";
        String str = "233417386";
        for (int i = 0; i < str.length() - 1; i++) {
            if (Integer.valueOf(str.charAt(i)) % 2 == 0 && Integer.valueOf(str.charAt(i + 1)) % 2 == 0) {
                result = result + str.charAt(i) + "*";
            } else if (Integer.valueOf(str.charAt(i)) % 2 != 0 && Integer.valueOf(str.charAt(i + 1)) % 2 != 0) {
                result = result + str.charAt(i) + "-";
            } else {
                result = result + str.charAt(i);
            }
        }
        result=result+str.charAt(str.length()-1);
        System.out.println(result);
    }
}
