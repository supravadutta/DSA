import java.util.*;
import java.util.regex.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (isSpecial(str) && (isCapital(str)) && (isNumber(str)) && (isLength(str)) && (isAdjacent(str))) {

            System.out.println("valid");
        }

    }

    static boolean isLength(String str) {
        if (str.length() >= 8) {
            return true;
        }
        return false;
    }

    static boolean isSpecial(String str) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(str);
        boolean b = m.find();
        return b;
    }

    static boolean isCapital(String str) {
        Pattern p = Pattern.compile(".*[A-Z].*");
        Matcher m = p.matcher(str);
        boolean b = m.find();
        return b;
    }

    static boolean isNumber(String str) {
        Pattern p = Pattern.compile(".*[0-9].*");
        Matcher m = p.matcher(str);
        boolean b = m.find();
        return b;
    }

    static boolean isAdjacent(String str) {
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i + 1) == str.charAt(i + 2)) {
                return false;
            }

        }
        return true;
    }
}
