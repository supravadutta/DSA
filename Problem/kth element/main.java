import java.util.*;

class Main {
    public static void main(String[] args) {
        int arr[] = { 7, 9, 1, 4, 7, 9, 0, 1 };
        int k = 6;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        if (k > list.size()) {
            System.out.println("NULL");
            return;
        }
        int small = list.get(k - 1);
        int greater = list.get(list.size() - k);
        System.out.println(small + " " + greater);

    }
}
